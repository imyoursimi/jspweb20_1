package customer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.notice.NoticeDelProcController;
import customer.controller.notice.NoticeDetailController;
import customer.controller.notice.NoticeEditController;
import customer.controller.notice.NoticeEditProcController;
import customer.controller.notice.NoticeRegController;
import customer.controller.notice.NoticeRegProcController;

public class MyDispatcher extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("signnnnnn");
		
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		
		System.out.println("com:"+com);
		
		/*
		 * NoticeDetailController controller1=new NoticeDetailController();
		 * NoticeEditController controller2=new NoticeEditController();
		 */
		//인터페이스를 활용, 각각의 객체를 하나의 형식으로 합쳐줌.
		//아래 if문을 통해 객체생성 각각하면됨! 위처럼 객체 이름을 따로따로 만들 필요 없고, 익제큐트도 한꺼번에 쓸 수 있다.
		Controller controller=null;
		
		
		try {
			//주소로 분기
			if(com.equals("/customer/noticeDetail.do")) {
				controller=new NoticeDetailController();
				//controller.execute(request, response);
			}else if(com.equals("/customer/noticeEdit.do")) {
				controller=new NoticeEditController();
				//controller.execute(request, response);
			}else if(com.equals("/customer/noticeEditProc.do")) {
				controller=new NoticeEditProcController();
				//controller.execute(request, response);
			}else if(com.equals("/customer/noticeReg.do")) {
				controller=new NoticeRegController();
				//controller.execute(request, response);
			}else if(com.equals("/customer/noticeRegProc.do")) {
				controller=new NoticeRegProcController();
				//controller.execute(request, response);
			}else if(com.equals("/customer/noticeDelProc.do")) {
				controller=new NoticeDelProcController();
				//controller.execute(request, response);
			}
			controller.execute(request, response);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
	
}
