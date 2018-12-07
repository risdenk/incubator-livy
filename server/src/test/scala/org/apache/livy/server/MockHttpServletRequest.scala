package org.apache.livy.server

import java.io.BufferedReader
import java.security.Principal
import java.util
import java.util.Locale

import javax.servlet._
import javax.servlet.http._

class MockHttpServletRequest(req: HttpServletRequest) extends HttpServletRequest {
  override def getAuthType: String = req.getAuthType

  override def getCookies: Array[Cookie] = req.getCookies

  override def getDateHeader(name: String): Long = req.getDateHeader(name)

  override def getHeader(name: String): String = req.getHeader(name)

  override def getHeaders(name: String): util.Enumeration[String] = req.getHeaders(name)

  override def getHeaderNames: util.Enumeration[String] = req.getHeaderNames

  override def getIntHeader(name: String): Int = req.getIntHeader(name)

  override def getMethod: String = req.getMethod

  override def getPathInfo: String = req.getPathInfo

  override def getPathTranslated: String = req.getPathTranslated

  override def getContextPath: String = req.getContextPath

  override def getQueryString: String = req.getQueryString

  override def getRemoteUser: String = req.getHeader(BaseSessionServletSpec.REMOTE_USER_HEADER)

  override def isUserInRole(role: String): Boolean = req.isUserInRole(role)

  override def getUserPrincipal: Principal = req.getUserPrincipal

  override def getRequestedSessionId: String = req.getRequestedSessionId

  override def getRequestURI: String = req.getRequestURI

  override def getRequestURL: StringBuffer = req.getRequestURL

  override def getServletPath: String = req.getServletPath

  override def getSession(create: Boolean): HttpSession = req.getSession(create)

  override def getSession: HttpSession = req.getSession

  override def changeSessionId(): String = req.changeSessionId()

  override def isRequestedSessionIdValid: Boolean = req.isRequestedSessionIdValid

  override def isRequestedSessionIdFromCookie: Boolean = req.isRequestedSessionIdFromCookie

  override def isRequestedSessionIdFromURL: Boolean = req.isRequestedSessionIdFromURL

  override def isRequestedSessionIdFromUrl: Boolean = req.isRequestedSessionIdFromUrl

  override def authenticate(response: HttpServletResponse): Boolean = req.authenticate(response)

  override def login(username: String, password: String): Unit = req.login(username, password)

  override def logout(): Unit = req.logout()

  override def getParts: util.Collection[Part] = req.getParts

  override def getPart(name: String): Part = req.getPart(name)

  override def upgrade[T <: HttpUpgradeHandler](handlerClass: Class[T]): T = req.upgrade(handlerClass)

  override def getAttribute(name: String): AnyRef = req.getAttribute(name)

  override def getAttributeNames: util.Enumeration[String] = req.getAttributeNames

  override def getCharacterEncoding: String = req.getCharacterEncoding

  override def setCharacterEncoding(env: String): Unit = req.setCharacterEncoding(env)

  override def getContentLength: Int = req.getContentLength

  override def getContentLengthLong: Long = req.getContentLengthLong

  override def getContentType: String = req.getContentType

  override def getInputStream: ServletInputStream = req.getInputStream

  override def getParameter(name: String): String = req.getParameter(name)

  override def getParameterNames: util.Enumeration[String] = req.getParameterNames

  override def getParameterValues(name: String): Array[String] = req.getParameterValues(name)

  override def getParameterMap: util.Map[String, Array[String]] = req.getParameterMap

  override def getProtocol: String = req.getProtocol

  override def getScheme: String = req.getScheme

  override def getServerName: String = req.getServerName

  override def getServerPort: Int = req.getServerPort

  override def getReader: BufferedReader = req.getReader

  override def getRemoteAddr: String = req.getRemoteAddr

  override def getRemoteHost: String = req.getRemoteHost

  override def setAttribute(name: String, o: Any): Unit = req.setAttribute(name, o)

  override def removeAttribute(name: String): Unit = req.removeAttribute(name)

  override def getLocale: Locale = req.getLocale

  override def getLocales: util.Enumeration[Locale] = req.getLocales

  override def isSecure: Boolean = req.isSecure

  override def getRequestDispatcher(path: String): RequestDispatcher = req.getRequestDispatcher(path)

  override def getRealPath(path: String): String = req.getRealPath(path)

  override def getRemotePort: Int = req.getRemotePort

  override def getLocalName: String = req.getLocalName

  override def getLocalAddr: String = req.getLocalAddr

  override def getLocalPort: Int = req.getLocalPort

  override def getServletContext: ServletContext = req.getServletContext

  override def startAsync(): AsyncContext = req.startAsync()

  override def startAsync(servletRequest: ServletRequest, servletResponse: ServletResponse): AsyncContext = {
    req.startAsync(servletRequest, servletResponse)
  }

  override def isAsyncStarted: Boolean = req.isAsyncStarted

  override def isAsyncSupported: Boolean = req.isAsyncSupported

  override def getAsyncContext: AsyncContext = req.getAsyncContext

  override def getDispatcherType: DispatcherType = req.getDispatcherType
}
