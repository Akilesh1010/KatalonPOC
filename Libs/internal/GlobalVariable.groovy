package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile CSL : CSL Env
Profile SIT : Sit Url</p>
     */
    public static Object base_url
     
    /**
     * <p></p>
     */
    public static Object bsApp
     
    /**
     * <p></p>
     */
    public static Object SecurePortal
     
    /**
     * <p></p>
     */
    public static Object bsiOSapp
     
    /**
     * <p></p>
     */
    public static Object BundleID
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            base_url = selectedVariables['base_url']
            bsApp = selectedVariables['bsApp']
            SecurePortal = selectedVariables['SecurePortal']
            bsiOSapp = selectedVariables['bsiOSapp']
            BundleID = selectedVariables['BundleID']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
