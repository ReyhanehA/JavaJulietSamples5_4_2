/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE80_XSS__Servlet_getCookiesServlet_53a.java
Label Definition File: CWE80_XSS__Servlet.label.xml
Template File: sources-sink-53a.tmpl.java
*/
/*
 * @description
 * CWE: 80 Cross Site Scripting (XSS)
 * BadSource: getCookiesServlet Read data from the first cookie
 * GoodSource: A hardcoded string
 * Sinks: Servlet
 *    BadSink : querystring parameter not sanitized
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */

package testcases.CWE80_XSS;

import testcasesupport.*;

import javax.servlet.http.*;

import javax.servlet.http.*;
import java.util.logging.Logger;

public class CWE80_XSS__Servlet_getCookiesServlet_53a extends AbstractTestCaseServlet
{

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        Logger log_bad = Logger.getLogger("local-logger");

        /* read parameter from cookie */
        Cookie cookieSources[] = request.getCookies();
        if (cookieSources != null)
        {
            data = cookieSources[0].getValue();
        }
        else
        {
            data = null;
        }

        (new CWE80_XSS__Servlet_getCookiesServlet_53b()).bad_sink(data , request, response);
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

        /* FIX: Use a hardcoded string */
        data = "foo";

        (new CWE80_XSS__Servlet_getCookiesServlet_53b()).goodG2B_sink(data , request, response);
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}
