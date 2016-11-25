package com.test.imageIo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ThumbnailAction {
	
	private UploadService uploadService;
	
	private ThumbnailService thumbnailService;
	
	@RequestMapping(value="/thumbnail",method=RequestMethod.POST)
	public ModelAndView thumbnail(@RequestParam("image")CommonsMultipartFile file,HttpSession session){
		
		String uploadPath = "/images";
		String realUploadPath = session.getServletContext().getRealPath(uploadPath);//绝对路径
		
		
		String imageUrl = uploadService.uploadImage(file, uploadPath, realUploadPath);//图片上传
		String thumImageUrl = thumbnailService.thumbnail(file, uploadPath, realUploadPath);//缩略图的生成
		
		
		ModelAndView ret = new ModelAndView();
		ret.addObject("imageURL",imageUrl);
		ret.addObject("thumImageUrl", thumImageUrl);
		
		ret.setViewName("thumbnail");
		
		return ret;
		
	}

	@Autowired
	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}

	@Autowired
	public void setThumbnailService(ThumbnailService thumbnailService) {
		this.thumbnailService = thumbnailService;
	}
	
	

}
