$Header: /cvsroot/smtphandler/smtphandler/readme.txt,v 1.6 2008/10/05 08:52:08 sullis Exp $

README file for SMTPHandler

About the SMTPHandler
=====================

SMTPHandler is a handler for java.util.logging

The SMTPHandler code is derived from log4j's SMTPAppender.

After downloading the SMTPHandler software, you will need 
to download two additional JAR files:

1)  Sun JavaMail 
    http://java.sun.com/products/javamail

2)  Sun JavaBeans Activiation Framework
    http://java.sun.com/products/javabeans/glasgow/jaf.html
 
SMTPHandler project homepage
============================

 http://smtphandler.sourceforge.net/

Changes between version 0.7 and version 0.6
===========================================

 + Add SSL (smtps) support (smtphandler.SMTPHandler.useSSL logging property),
   and ability to use non-default SMTP port (smtphandler.SMTPHandler.port
   logging property).  [SourceForge patch #2041257]
   Thanks to Alan Harder for providing this patch.

Changes between version 0.6 and version 0.5
===========================================

 + added support for SMTP authentication

SMTPHandler mailing lists
=========================

 Please visit http://smtphandler.sourceforge.net/mail-lists.html

java.util.logging documentation
===============================

 http://java.sun.com/j2se/1.5.0/docs/guide/logging/overview.html

Acknowledgements
================

Sean C. Sullivan - founder of the SMTPHandler project
Ceki Gulcu - author of log4j's SMTPAppender 
