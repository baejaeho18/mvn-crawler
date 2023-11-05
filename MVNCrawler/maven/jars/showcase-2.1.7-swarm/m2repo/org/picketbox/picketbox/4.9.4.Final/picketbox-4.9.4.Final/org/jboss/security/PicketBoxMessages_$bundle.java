package org.jboss.security;

import java.lang.IllegalStateException;
import java.io.Serializable;
import javax.management.AttributeNotFoundException;
import java.net.MalformedURLException;
import java.security.ProviderException;
import java.lang.String;
import java.net.URISyntaxException;
import java.lang.RuntimeException;
import javax.naming.NamingException;
import java.util.List;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.lang.IllegalArgumentException;
import javax.annotation.Generated;
import java.security.GeneralSecurityException;
import java.lang.NumberFormatException;
import java.lang.SecurityException;
import java.io.IOException;
import java.security.KeyException;
import javax.security.auth.callback.Callback;
import javax.security.auth.login.FailedLoginException;
import javax.xml.stream.XMLStreamException;
import java.lang.Throwable;
import javax.security.auth.login.LoginException;
import java.lang.Class;
import java.util.Arrays;
import javax.xml.stream.Location;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageBundleImplementor", date = "2015-11-20T10:19:53+0100")
public class PicketBoxMessages_$bundle implements PicketBoxMessages,Serializable {
    private static final long serialVersionUID = 1L;
    protected PicketBoxMessages_$bundle() {}
    public static final PicketBoxMessages_$bundle INSTANCE = new PicketBoxMessages_$bundle();
    protected Object readResolve() {
        return INSTANCE;
    }
    private static final String invalidControlFlag = "PBOX00001: Invalid control flag: %s";
    protected String invalidControlFlag$str() {
        return invalidControlFlag;
    }
    @Override
    public final IllegalArgumentException invalidControlFlag(final String flag) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidControlFlag$str(), flag));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String identityTypeFactoryNotImplemented = "PBOX00002: IdentityFactory for type %s not implemented";
    protected String identityTypeFactoryNotImplemented$str() {
        return identityTypeFactoryNotImplemented;
    }
    @Override
    public final IllegalArgumentException identityTypeFactoryNotImplemented(final String identityType) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(identityTypeFactoryNotImplemented$str(), identityType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidType = "PBOX00003: Class is not an instance of %s";
    protected String invalidType$str() {
        return invalidType;
    }
    @Override
    public final IllegalArgumentException invalidType(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidType$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullArgument = "PBOX00004: Argument %s cannot be null";
    protected String invalidNullArgument$str() {
        return invalidNullArgument;
    }
    @Override
    public final IllegalArgumentException invalidNullArgument(final String argumentName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidNullArgument$str(), argumentName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String deniedByIdentityTrustMessage = "PBOX00005: Caller denied by identity trust framework";
    protected String deniedByIdentityTrustMessage$str() {
        return deniedByIdentityTrustMessage;
    }
    @Override
    public final String deniedByIdentityTrustMessage() {
        return String.format(deniedByIdentityTrustMessage$str());
    }
    private static final String unableToLoadVaultMessage = "PBOX00006: Unable to load vault class";
    protected String unableToLoadVaultMessage$str() {
        return unableToLoadVaultMessage;
    }
    @Override
    public final String unableToLoadVaultMessage() {
        return String.format(unableToLoadVaultMessage$str());
    }
    private static final String unableToCreateVaultMessage = "PBOX00007: Unable to instantiate vault class";
    protected String unableToCreateVaultMessage$str() {
        return unableToCreateVaultMessage;
    }
    @Override
    public final String unableToCreateVaultMessage() {
        return String.format(unableToCreateVaultMessage$str());
    }
    private static final String vaultNotInitializedMessage = "PBOX00008: Vault is not initialized";
    protected String vaultNotInitializedMessage$str() {
        return vaultNotInitializedMessage;
    }
    @Override
    public final String vaultNotInitializedMessage() {
        return String.format(vaultNotInitializedMessage$str());
    }
    private static final String invalidVaultStringFormat = "PBOX00009: Invalid vaultString format: %s";
    protected String invalidVaultStringFormat$str() {
        return invalidVaultStringFormat;
    }
    @Override
    public final IllegalArgumentException invalidVaultStringFormat(final String vaultString) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidVaultStringFormat$str(), vaultString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToFindSetSecurityInfoMessage = "PBOX00010: Unable to find setSecurityInfo(Principal, Object) in CallbackHandler";
    protected String unableToFindSetSecurityInfoMessage$str() {
        return unableToFindSetSecurityInfoMessage;
    }
    @Override
    public final String unableToFindSetSecurityInfoMessage() {
        return String.format(unableToFindSetSecurityInfoMessage$str());
    }
    private static final String invalidThreadContextClassLoader = "PBOX00011: Thread context classloader has not been set";
    protected String invalidThreadContextClassLoader$str() {
        return invalidThreadContextClassLoader;
    }
    @Override
    public final IllegalStateException invalidThreadContextClassLoader() {
        final IllegalStateException result = new IllegalStateException(String.format(invalidThreadContextClassLoader$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullLoginConfig = "PBOX00012: 'java.security.auth.login.config' system property not set and auth.conf file not present";
    protected String invalidNullLoginConfig$str() {
        return invalidNullLoginConfig;
    }
    @Override
    public final IllegalStateException invalidNullLoginConfig() {
        final IllegalStateException result = new IllegalStateException(String.format(invalidNullLoginConfig$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToInitSecurityFactory = "PBOX00013: Unable to initialize security factory";
    protected String unableToInitSecurityFactory$str() {
        return unableToInitSecurityFactory;
    }
    @Override
    public final RuntimeException unableToInitSecurityFactory(final Throwable throwable) {
        final RuntimeException result = new RuntimeException(String.format(unableToInitSecurityFactory$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToHandleCallback = "PBOX00014: %s does not handle a callback of type %s";
    protected String unableToHandleCallback$str() {
        return unableToHandleCallback;
    }
    @Override
    public final UnsupportedCallbackException unableToHandleCallback(final Callback callback, final String callbackHandler, final String callbackType) {
        final UnsupportedCallbackException result = new UnsupportedCallbackException(callback, String.format(unableToHandleCallback$str(), callbackHandler, callbackType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidSecurityAnnotationConfig = "PBOX00015: Invalid annotation configuration: either @SecurityConfig or @Authentication is needed";
    protected String invalidSecurityAnnotationConfig$str() {
        return invalidSecurityAnnotationConfig;
    }
    @Override
    public final RuntimeException invalidSecurityAnnotationConfig() {
        final RuntimeException result = new RuntimeException(String.format(invalidSecurityAnnotationConfig$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String authenticationFailedMessage = "PBOX00016: Access denied: authentication failed";
    protected String authenticationFailedMessage$str() {
        return authenticationFailedMessage;
    }
    @Override
    public final String authenticationFailedMessage() {
        return String.format(authenticationFailedMessage$str());
    }
    private static final String authorizationFailedMessage = "PBOX00017: Acces denied: authorization failed";
    protected String authorizationFailedMessage$str() {
        return authorizationFailedMessage;
    }
    @Override
    public final String authorizationFailedMessage() {
        return String.format(authorizationFailedMessage$str());
    }
    private static final String nullRolesInSubjectMessage = "PBOX00018: Subject contains a null set of roles";
    protected String nullRolesInSubjectMessage$str() {
        return nullRolesInSubjectMessage;
    }
    @Override
    public final String nullRolesInSubjectMessage() {
        return String.format(nullRolesInSubjectMessage$str());
    }
    private static final String aclEntryPermissionAlreadySet = "PBOX00019: ACLEntry permission has already been set";
    protected String aclEntryPermissionAlreadySet$str() {
        return aclEntryPermissionAlreadySet;
    }
    @Override
    public final IllegalStateException aclEntryPermissionAlreadySet() {
        final IllegalStateException result = new IllegalStateException(String.format(aclEntryPermissionAlreadySet$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String aclResourceAlreadySet = "PBOX00020: ACL resource has already been set";
    protected String aclResourceAlreadySet$str() {
        return aclResourceAlreadySet;
    }
    @Override
    public final IllegalStateException aclResourceAlreadySet() {
        final IllegalStateException result = new IllegalStateException(String.format(aclResourceAlreadySet$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToCreateACLPersistenceStrategy = "PBOX00021: Failed to instantiate persistence strategy class";
    protected String unableToCreateACLPersistenceStrategy$str() {
        return unableToCreateACLPersistenceStrategy;
    }
    @Override
    public final RuntimeException unableToCreateACLPersistenceStrategy(final Throwable throwable) {
        final RuntimeException result = new RuntimeException(String.format(unableToCreateACLPersistenceStrategy$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToLocateACLForResourceMessage = "PBOX00022: Unable to locate ACL for resource %s";
    protected String unableToLocateACLForResourceMessage$str() {
        return unableToLocateACLForResourceMessage;
    }
    @Override
    public final String unableToLocateACLForResourceMessage(final String resource) {
        return String.format(unableToLocateACLForResourceMessage$str(), resource);
    }
    private static final String unableToLocateACLWithNoStrategyMessage = "PBOX00023: Unable to locate ACL: persistence strategy has not been set";
    protected String unableToLocateACLWithNoStrategyMessage$str() {
        return unableToLocateACLWithNoStrategyMessage;
    }
    @Override
    public final String unableToLocateACLWithNoStrategyMessage() {
        return String.format(unableToLocateACLWithNoStrategyMessage$str());
    }
    private static final String malformedIdentityString = "PBOX00024: Malformed identity string: %s. Expected Identity_Class:Identity_Name";
    protected String malformedIdentityString$str() {
        return malformedIdentityString;
    }
    @Override
    public final IllegalArgumentException malformedIdentityString(final String identityString) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(malformedIdentityString$str(), identityString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainSHAMessageDigest = "PBOX00025: Failed to obtain SHA MessageDigest";
    protected String failedToObtainSHAMessageDigest$str() {
        return failedToObtainSHAMessageDigest;
    }
    @Override
    public final ProviderException failedToObtainSHAMessageDigest(final Throwable throwable) {
        final ProviderException result = new ProviderException(String.format(failedToObtainSHAMessageDigest$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToCreateSecretKeySpec = "PBOX00026: Failed to create SecretKeySpec from session key";
    protected String failedToCreateSecretKeySpec$str() {
        return failedToCreateSecretKeySpec;
    }
    @Override
    public final KeyException failedToCreateSecretKeySpec(final Throwable throwable) {
        final KeyException result = new KeyException(String.format(failedToCreateSecretKeySpec$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedExceptionDuringSecretKeyCreation = "PBOX00027: Unexpected exception during SecretKeySpec creation";
    protected String unexpectedExceptionDuringSecretKeyCreation$str() {
        return unexpectedExceptionDuringSecretKeyCreation;
    }
    @Override
    public final KeyException unexpectedExceptionDuringSecretKeyCreation(final Throwable throwable) {
        final KeyException result = new KeyException(String.format(unexpectedExceptionDuringSecretKeyCreation$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToCreateSealedObject = "PBOX00028: Failed to create SealedObject";
    protected String failedToCreateSealedObject$str() {
        return failedToCreateSealedObject;
    }
    @Override
    public final GeneralSecurityException failedToCreateSealedObject(final Throwable throwable) {
        final GeneralSecurityException result = new GeneralSecurityException(String.format(failedToCreateSealedObject$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String enterUsernameMessage = "PBOX00029: Enter the username: ";
    protected String enterUsernameMessage$str() {
        return enterUsernameMessage;
    }
    @Override
    public final String enterUsernameMessage() {
        return String.format(enterUsernameMessage$str());
    }
    private static final String enterPasswordMessage = "PBOX00030: Enter the password: ";
    protected String enterPasswordMessage$str() {
        return enterPasswordMessage;
    }
    @Override
    public final String enterPasswordMessage() {
        return String.format(enterPasswordMessage$str());
    }
    private static final String failedToObtainUsername = "PBOX00031: Failed to obtain the username";
    protected String failedToObtainUsername$str() {
        return failedToObtainUsername;
    }
    @Override
    public final SecurityException failedToObtainUsername(final Throwable throwable) {
        final SecurityException result = new SecurityException(String.format(failedToObtainUsername$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainPassword = "PBOX00032: Failed to obtain the password";
    protected String failedToObtainPassword$str() {
        return failedToObtainPassword;
    }
    @Override
    public final SecurityException failedToObtainPassword(final Throwable throwable) {
        final SecurityException result = new SecurityException(String.format(failedToObtainPassword$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToFindPrincipalInDB = "PBOX00033: No matching principal found in DB: %s";
    protected String unableToFindPrincipalInDB$str() {
        return unableToFindPrincipalInDB;
    }
    @Override
    public final RuntimeException unableToFindPrincipalInDB(final String principalName) {
        final RuntimeException result = new RuntimeException(String.format(unableToFindPrincipalInDB$str(), principalName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToLookupDataSource = "PBOX00034: Unable to lookup DataSource - the DS JNDI name is null";
    protected String unableToLookupDataSource$str() {
        return unableToLookupDataSource;
    }
    @Override
    public final RuntimeException unableToLookupDataSource() {
        final RuntimeException result = new RuntimeException(String.format(unableToLookupDataSource$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullSecurityContext = "PBOX00035: Unable to proceed: security context is null";
    protected String invalidNullSecurityContext$str() {
        return invalidNullSecurityContext;
    }
    @Override
    public final RuntimeException invalidNullSecurityContext() {
        final RuntimeException result = new RuntimeException(String.format(invalidNullSecurityContext$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullBaseContextDN = "PBOX00036: Invalid configuration: baseCtxDN is null";
    protected String invalidNullBaseContextDN$str() {
        return invalidNullBaseContextDN;
    }
    @Override
    public final NamingException invalidNullBaseContextDN() {
        final NamingException result = new NamingException(String.format(invalidNullBaseContextDN$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToFindBaseContextDN = "PBOX00037: Search for context %s found no results";
    protected String failedToFindBaseContextDN$str() {
        return failedToFindBaseContextDN;
    }
    @Override
    public final NamingException failedToFindBaseContextDN(final String baseDN) {
        final NamingException result = new NamingException(String.format(failedToFindBaseContextDN$str(), baseDN));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToFollowReferralForAuth = "PBOX00038: Unable to follow referral for authentication: %s";
    protected String unableToFollowReferralForAuth$str() {
        return unableToFollowReferralForAuth;
    }
    @Override
    public final NamingException unableToFollowReferralForAuth(final String name) {
        final NamingException result = new NamingException(String.format(unableToFollowReferralForAuth$str(), name));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPasswordType = "PBOX00039: Invalid password type: %s";
    protected String invalidPasswordType$str() {
        return invalidPasswordType;
    }
    @Override
    public final RuntimeException invalidPasswordType(final Class<? extends Object> type) {
        final RuntimeException result = new RuntimeException(String.format(invalidPasswordType$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unsupportedAlgorithm = "PBOX00040: Unsupported algorithm: %s";
    protected String unsupportedAlgorithm$str() {
        return unsupportedAlgorithm;
    }
    @Override
    public final IllegalArgumentException unsupportedAlgorithm(final String algorithm) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(unsupportedAlgorithm$str(), algorithm));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unsupportedQOP = "PBOX00041: Unsupported quality of protection: %s";
    protected String unsupportedQOP$str() {
        return unsupportedQOP;
    }
    @Override
    public final IllegalArgumentException unsupportedQOP(final String qop) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(unsupportedQOP$str(), qop));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String sizeMismatchMessage = "PBOX00042: Size mismatch between %s and %s";
    protected String sizeMismatchMessage$str() {
        return sizeMismatchMessage;
    }
    @Override
    public final String sizeMismatchMessage(final String param1, final String param2) {
        return String.format(sizeMismatchMessage$str(), param1, param2);
    }
    private static final String failedToFindResource = "PBOX00043: Failed to find resource %s";
    protected String failedToFindResource$str() {
        return failedToFindResource;
    }
    @Override
    public final IOException failedToFindResource(final String resourceName) {
        final IOException result = new IOException(String.format(failedToFindResource$str(), resourceName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidKeyFormat = "PBOX00044: Invalid key format: %s";
    protected String invalidKeyFormat$str() {
        return invalidKeyFormat;
    }
    @Override
    public final RuntimeException invalidKeyFormat(final String key) {
        final RuntimeException result = new RuntimeException(String.format(invalidKeyFormat$str(), key));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToRegisterAuthConfigProvider = "PBOX00045: Failed to register AuthConfigProvider %s";
    protected String failedToRegisterAuthConfigProvider$str() {
        return failedToRegisterAuthConfigProvider;
    }
    @Override
    public final SecurityException failedToRegisterAuthConfigProvider(final String providerClass, final Throwable throwable) {
        final SecurityException result = new SecurityException(String.format(failedToRegisterAuthConfigProvider$str(), providerClass), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String callbackHandlerSysPropertyNotSet = "PBOX00046: CallbackHandler not specified by system property %s";
    protected String callbackHandlerSysPropertyNotSet$str() {
        return callbackHandlerSysPropertyNotSet;
    }
    @Override
    public final IllegalStateException callbackHandlerSysPropertyNotSet(final String systemPropertyName) {
        final IllegalStateException result = new IllegalStateException(String.format(callbackHandlerSysPropertyNotSet$str(), systemPropertyName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainSecDomainFromContextOrConfig = "PBOX00047: Failed to obtain security domain from security context or configuration";
    protected String failedToObtainSecDomainFromContextOrConfig$str() {
        return failedToObtainSecDomainFromContextOrConfig;
    }
    @Override
    public final IllegalStateException failedToObtainSecDomainFromContextOrConfig() {
        final IllegalStateException result = new IllegalStateException(String.format(failedToObtainSecDomainFromContextOrConfig$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainApplicationPolicy = "PBOX00048: Failed to obtain ApplicationPolicy for domain %s";
    protected String failedToObtainApplicationPolicy$str() {
        return failedToObtainApplicationPolicy;
    }
    @Override
    public final IllegalStateException failedToObtainApplicationPolicy(final String securityDomain) {
        final IllegalStateException result = new IllegalStateException(String.format(failedToObtainApplicationPolicy$str(), securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainAuthenticationInfo = "PBOX00049: AuthenticationInfo not set in security domain %s";
    protected String failedToObtainAuthenticationInfo$str() {
        return failedToObtainAuthenticationInfo;
    }
    @Override
    public final IllegalStateException failedToObtainAuthenticationInfo(final String securityDomain) {
        final IllegalStateException result = new IllegalStateException(String.format(failedToObtainAuthenticationInfo$str(), securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noServerAuthModuleForRequestType = "PBOX00050: No ServerAuthModule configured to support type %s";
    protected String noServerAuthModuleForRequestType$str() {
        return noServerAuthModuleForRequestType;
    }
    @Override
    public final IllegalStateException noServerAuthModuleForRequestType(final Class<? extends Object> requestType) {
        final IllegalStateException result = new IllegalStateException(String.format(noServerAuthModuleForRequestType$str(), requestType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToCreatePrincipal = "PBOX00051: Failed to create principal: %s";
    protected String failedToCreatePrincipal$str() {
        return failedToCreatePrincipal;
    }
    @Override
    public final LoginException failedToCreatePrincipal(final String message) {
        final LoginException result = new LoginException(String.format(failedToCreatePrincipal$str(), message));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToMatchCredential = "PBOX00052: Supplied credential did not match existing credential for alias %s";
    protected String failedToMatchCredential$str() {
        return failedToMatchCredential;
    }
    @Override
    public final FailedLoginException failedToMatchCredential(final String alias) {
        final FailedLoginException result = new FailedLoginException(String.format(failedToMatchCredential$str(), alias));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noCallbackHandlerAvailable = "PBOX00053: No CallbackHandler available to collect authentication information";
    protected String noCallbackHandlerAvailable$str() {
        return noCallbackHandlerAvailable;
    }
    @Override
    public final LoginException noCallbackHandlerAvailable() {
        final LoginException result = new LoginException(String.format(noCallbackHandlerAvailable$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToGetCertificateFromClass = "PBOX00054: Unable to obtain a X509Certificate from %s";
    protected String unableToGetCertificateFromClass$str() {
        return unableToGetCertificateFromClass;
    }
    @Override
    public final LoginException unableToGetCertificateFromClass(final Class<? extends Object> certClass) {
        final LoginException result = new LoginException(String.format(unableToGetCertificateFromClass$str(), certClass));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToInvokeCallbackHandler = "PBOX00055: Failed to invoke CallbackHandler";
    protected String failedToInvokeCallbackHandler$str() {
        return failedToInvokeCallbackHandler;
    }
    @Override
    public final LoginException failedToInvokeCallbackHandler() {
        final LoginException result = new LoginException(String.format(failedToInvokeCallbackHandler$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String suppliedCredentialMessage = "PBOX00056: Supplied credential: ";
    protected String suppliedCredentialMessage$str() {
        return suppliedCredentialMessage;
    }
    @Override
    public final String suppliedCredentialMessage() {
        return String.format(suppliedCredentialMessage$str());
    }
    private static final String existingCredentialMessage = "PBOX00057: Existing credential: ";
    protected String existingCredentialMessage$str() {
        return existingCredentialMessage;
    }
    @Override
    public final String existingCredentialMessage() {
        return String.format(existingCredentialMessage$str());
    }
    private static final String noMatchForAliasMessage = "PBOX00058: No match for alias %s, existing aliases: %s";
    protected String noMatchForAliasMessage$str() {
        return noMatchForAliasMessage;
    }
    @Override
    public final String noMatchForAliasMessage(final String alias, final List<String> existingAliases) {
        return String.format(noMatchForAliasMessage$str(), alias, existingAliases);
    }
    private static final String missingPropertiesFile = "PBOX00059: Missing properties file: %s";
    protected String missingPropertiesFile$str() {
        return missingPropertiesFile;
    }
    @Override
    public final LoginException missingPropertiesFile(final String fileName) {
        final LoginException result = new LoginException(String.format(missingPropertiesFile$str(), fileName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToGetTransactionManager = "PBOX00060: Unable to get TransactionManager";
    protected String failedToGetTransactionManager$str() {
        return failedToGetTransactionManager;
    }
    @Override
    public final RuntimeException failedToGetTransactionManager(final Throwable throwable) {
        final RuntimeException result = new RuntimeException(String.format(failedToGetTransactionManager$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullTransactionManager = "PBOX00061: Invalid null TransactionManager";
    protected String invalidNullTransactionManager$str() {
        return invalidNullTransactionManager;
    }
    @Override
    public final IllegalStateException invalidNullTransactionManager() {
        final IllegalStateException result = new IllegalStateException(String.format(invalidNullTransactionManager$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noMatchingUsernameFoundInPrincipals = "PBOX00062: No matching username found in principals";
    protected String noMatchingUsernameFoundInPrincipals$str() {
        return noMatchingUsernameFoundInPrincipals;
    }
    @Override
    public final FailedLoginException noMatchingUsernameFoundInPrincipals() {
        final FailedLoginException result = new FailedLoginException(String.format(noMatchingUsernameFoundInPrincipals$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noMatchingUsernameFoundInRoles = "PBOX00063: No matching username found in roles";
    protected String noMatchingUsernameFoundInRoles$str() {
        return noMatchingUsernameFoundInRoles;
    }
    @Override
    public final FailedLoginException noMatchingUsernameFoundInRoles() {
        final FailedLoginException result = new FailedLoginException(String.format(noMatchingUsernameFoundInRoles$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToLookupDataSourceMessage = "PBOX00064: Error looking up DataSource from %s";
    protected String failedToLookupDataSourceMessage$str() {
        return failedToLookupDataSourceMessage;
    }
    @Override
    public final String failedToLookupDataSourceMessage(final String jndiName) {
        return String.format(failedToLookupDataSourceMessage$str(), jndiName);
    }
    private static final String failedToProcessQueryMessage = "PBOX00065: Error processing query";
    protected String failedToProcessQueryMessage$str() {
        return failedToProcessQueryMessage;
    }
    @Override
    public final String failedToProcessQueryMessage() {
        return String.format(failedToProcessQueryMessage$str());
    }
    private static final String failedToDecodeBindCredential = "PBOX00066: Failed to decode bindCredential";
    protected String failedToDecodeBindCredential$str() {
        return failedToDecodeBindCredential;
    }
    @Override
    public final IllegalArgumentException failedToDecodeBindCredential(final Throwable throwable) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(failedToDecodeBindCredential$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingRequiredModuleOptionMessage = "PBOX00067: Missing required module option: %s";
    protected String missingRequiredModuleOptionMessage$str() {
        return missingRequiredModuleOptionMessage;
    }
    @Override
    public final String missingRequiredModuleOptionMessage(final String moduleOption) {
        return String.format(missingRequiredModuleOptionMessage$str(), moduleOption);
    }
    private static final String failedToInstantiateDelegateModule = "PBOX00068: Failed to instantiate delegate module %s";
    protected String failedToInstantiateDelegateModule$str() {
        return failedToInstantiateDelegateModule;
    }
    @Override
    public final LoginException failedToInstantiateDelegateModule(final String loginModuleName) {
        final LoginException result = new LoginException(String.format(failedToInstantiateDelegateModule$str(), loginModuleName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToGetPasswordFromVault = "PBOX00069: Unable to get password value from vault";
    protected String unableToGetPasswordFromVault$str() {
        return unableToGetPasswordFromVault;
    }
    @Override
    public final LoginException unableToGetPasswordFromVault() {
        final LoginException result = new LoginException(String.format(unableToGetPasswordFromVault$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPassword = "PBOX00070: Password invalid/Password required";
    protected String invalidPassword$str() {
        return invalidPassword;
    }
    @Override
    public final FailedLoginException invalidPassword() {
        final FailedLoginException result = new FailedLoginException(String.format(invalidPassword$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToInstantiateClassMessage = "PBOX00071: Failed to instantiate %s class";
    protected String failedToInstantiateClassMessage$str() {
        return failedToInstantiateClassMessage;
    }
    @Override
    public final String failedToInstantiateClassMessage(final Class<? extends Object> clazz) {
        return String.format(failedToInstantiateClassMessage$str(), clazz);
    }
    private static final String unableToFindPropertiesFile = "PBOX00072: Properties file %s not found";
    protected String unableToFindPropertiesFile$str() {
        return unableToFindPropertiesFile;
    }
    @Override
    public final IOException unableToFindPropertiesFile(final String fileName) {
        final IOException result = new IOException(String.format(unableToFindPropertiesFile$str(), fileName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToLoadPropertiesFile = "PBOX00073: Properties file %s not available for loading";
    protected String unableToLoadPropertiesFile$str() {
        return unableToLoadPropertiesFile;
    }
    @Override
    public final IOException unableToLoadPropertiesFile(final String fileName) {
        final IOException result = new IOException(String.format(unableToLoadPropertiesFile$str(), fileName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingXMLUserRolesMapping = "PBOX00074: Missing XML configuration for user/roles mapping";
    protected String missingXMLUserRolesMapping$str() {
        return missingXMLUserRolesMapping;
    }
    @Override
    public final LoginException missingXMLUserRolesMapping() {
        final LoginException result = new LoginException(String.format(missingXMLUserRolesMapping$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullProperty = "PBOX00075: The property %s is null";
    protected String invalidNullProperty$str() {
        return invalidNullProperty;
    }
    @Override
    public final IllegalStateException invalidNullProperty(final String property) {
        final IllegalStateException result = new IllegalStateException(String.format(invalidNullProperty$str(), property));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noMatchingRoleFoundInDescriptor = "PBOX00076: No matching role found in deployment descriptor for role %s";
    protected String noMatchingRoleFoundInDescriptor$str() {
        return noMatchingRoleFoundInDescriptor;
    }
    @Override
    public final RuntimeException noMatchingRoleFoundInDescriptor(final String roleName) {
        final RuntimeException result = new RuntimeException(String.format(noMatchingRoleFoundInDescriptor$str(), roleName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPermissionChecks = "PBOX00077: Permission checks must be different";
    protected String invalidPermissionChecks$str() {
        return invalidPermissionChecks;
    }
    @Override
    public final IllegalStateException invalidPermissionChecks() {
        final IllegalStateException result = new IllegalStateException(String.format(invalidPermissionChecks$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingDelegateForLayer = "PBOX00078: Delegate is missing for layer %s";
    protected String missingDelegateForLayer$str() {
        return missingDelegateForLayer;
    }
    @Override
    public final IllegalStateException missingDelegateForLayer(final String layer) {
        final IllegalStateException result = new IllegalStateException(String.format(missingDelegateForLayer$str(), layer));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidDelegateMapEntry = "PBOX00079: Invalid delegate map entry: %s";
    protected String invalidDelegateMapEntry$str() {
        return invalidDelegateMapEntry;
    }
    @Override
    public final IllegalStateException invalidDelegateMapEntry(final String entry) {
        final IllegalStateException result = new IllegalStateException(String.format(invalidDelegateMapEntry$str(), entry));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingXACMLPolicyForContextId = "PBOX00080: Missing XACML policy for contextID %s";
    protected String missingXACMLPolicyForContextId$str() {
        return missingXACMLPolicyForContextId;
    }
    @Override
    public final IllegalStateException missingXACMLPolicyForContextId(final String contextID) {
        final IllegalStateException result = new IllegalStateException(String.format(missingXACMLPolicyForContextId$str(), contextID));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String cacheMissMessage = "PBOX00081: Cache miss";
    protected String cacheMissMessage$str() {
        return cacheMissMessage;
    }
    @Override
    public final String cacheMissMessage() {
        return String.format(cacheMissMessage$str());
    }
    private static final String cacheValidationFailedMessage = "PBOX00082: Cache validation failed";
    protected String cacheValidationFailedMessage$str() {
        return cacheValidationFailedMessage;
    }
    @Override
    public final String cacheValidationFailedMessage() {
        return String.format(cacheValidationFailedMessage$str());
    }
    private static final String invalidLoginModuleStackRef = "PBOX00083: auth-module references a login module stack that doesn't exist: %s";
    protected String invalidLoginModuleStackRef$str() {
        return invalidLoginModuleStackRef;
    }
    @Override
    public final RuntimeException invalidLoginModuleStackRef(final String stackRef) {
        final RuntimeException result = new RuntimeException(String.format(invalidLoginModuleStackRef$str(), stackRef));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToFindSchema = "PBOX00084: Unable to find schema file %s";
    protected String unableToFindSchema$str() {
        return unableToFindSchema;
    }
    @Override
    public final RuntimeException unableToFindSchema(final String schemaFile) {
        final RuntimeException result = new RuntimeException(String.format(unableToFindSchema$str(), schemaFile));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingRequiredAttributes = "PBOX00085: Missing required attribute(s): %s";
    protected String missingRequiredAttributes$str() {
        return missingRequiredAttributes;
    }
    @Override
    public final XMLStreamException missingRequiredAttributes(final String attributes, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(missingRequiredAttributes$str(), attributes), location);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedElement = "PBOX00086: Unexpected element %s encountered";
    protected String unexpectedElement$str() {
        return unexpectedElement;
    }
    @Override
    public final XMLStreamException unexpectedElement(final String elementName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(unexpectedElement$str(), elementName), location);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedAttribute = "PBOX00087: Unexpected attribute %s encountered";
    protected String unexpectedAttribute$str() {
        return unexpectedAttribute;
    }
    @Override
    public final XMLStreamException unexpectedAttribute(final String attributeName, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(unexpectedAttribute$str(), attributeName), location);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedNamespace = "PBOX00088: Unexpected namespace %s encountered";
    protected String unexpectedNamespace$str() {
        return unexpectedNamespace;
    }
    @Override
    public final XMLStreamException unexpectedNamespace(final String namespaceURI, final Location location) {
        final XMLStreamException result = new XMLStreamException(String.format(unexpectedNamespace$str(), namespaceURI), location);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String identityTrustValidationFailedMessage = "PBOX00089: Identity trust validation failed";
    protected String identityTrustValidationFailedMessage$str() {
        return identityTrustValidationFailedMessage;
    }
    @Override
    public final String identityTrustValidationFailedMessage() {
        return String.format(identityTrustValidationFailedMessage$str());
    }
    private static final String moduleCommitFailedMessage = "PBOX00090: Invocation of commit on module failed";
    protected String moduleCommitFailedMessage$str() {
        return moduleCommitFailedMessage;
    }
    @Override
    public final String moduleCommitFailedMessage() {
        return String.format(moduleCommitFailedMessage$str());
    }
    private static final String moduleAbortFailedMessage = "PBOX00091: Invocation of abort on module failed";
    protected String moduleAbortFailedMessage$str() {
        return moduleAbortFailedMessage;
    }
    @Override
    public final String moduleAbortFailedMessage() {
        return String.format(moduleAbortFailedMessage$str());
    }
    private static final String noPolicyContextForIdMessage = "PBOX00092: No PolicyContext exists for contextID %s";
    protected String noPolicyContextForIdMessage$str() {
        return noPolicyContextForIdMessage;
    }
    @Override
    public final String noPolicyContextForIdMessage(final String contextID) {
        return String.format(noPolicyContextForIdMessage$str(), contextID);
    }
    private static final String operationNotAllowedMessage = "PBOX00093: Operation not allowed";
    protected String operationNotAllowedMessage$str() {
        return operationNotAllowedMessage;
    }
    @Override
    public final String operationNotAllowedMessage() {
        return String.format(operationNotAllowedMessage$str());
    }
    private static final String failedToParseJACCStatesConfigFile = "PBOX00094: Failed to parse jacc-policy-config-states.xml";
    protected String failedToParseJACCStatesConfigFile$str() {
        return failedToParseJACCStatesConfigFile;
    }
    @Override
    public final IllegalStateException failedToParseJACCStatesConfigFile(final Throwable throwable) {
        final IllegalStateException result = new IllegalStateException(String.format(failedToParseJACCStatesConfigFile$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullAuthConfigProviderForLayer = "PBOX00095: AuthConfigProvider is null for layer %s, contextID: %s";
    protected String invalidNullAuthConfigProviderForLayer$str() {
        return invalidNullAuthConfigProviderForLayer;
    }
    @Override
    public final IllegalStateException invalidNullAuthConfigProviderForLayer(final String layer, final String contextID) {
        final IllegalStateException result = new IllegalStateException(String.format(invalidNullAuthConfigProviderForLayer$str(), layer, contextID));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainAuthorizationInfo = "PBOX00096: AuthorizationInfo not set in security domain %s";
    protected String failedToObtainAuthorizationInfo$str() {
        return failedToObtainAuthorizationInfo;
    }
    @Override
    public final IllegalStateException failedToObtainAuthorizationInfo(final String securityDomain) {
        final IllegalStateException result = new IllegalStateException(String.format(failedToObtainAuthorizationInfo$str(), securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToObtainInfoFromAppPolicy = "PBOX00097: Application policy has no info of type %s";
    protected String failedToObtainInfoFromAppPolicy$str() {
        return failedToObtainInfoFromAppPolicy;
    }
    @Override
    public final IllegalStateException failedToObtainInfoFromAppPolicy(final String infoType) {
        final IllegalStateException result = new IllegalStateException(String.format(failedToObtainInfoFromAppPolicy$str(), infoType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unexpectedSecurityDomainInInfo = "PBOX00098: Application policy -> %s does not match expected security domain %s";
    protected String unexpectedSecurityDomainInInfo$str() {
        return unexpectedSecurityDomainInInfo;
    }
    @Override
    public final IllegalStateException unexpectedSecurityDomainInInfo(final String infoType, final String securityDomain) {
        final IllegalStateException result = new IllegalStateException(String.format(unexpectedSecurityDomainInInfo$str(), infoType, securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidEJBVersion = "PBOX00099: Invalid EJB version: %s";
    protected String invalidEJBVersion$str() {
        return invalidEJBVersion;
    }
    @Override
    public final IllegalArgumentException invalidEJBVersion(final String version) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidEJBVersion$str(), version));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingCallerInfoMessage = "PBOX00100: Either caller subject or caller run-as should be non-null";
    protected String missingCallerInfoMessage$str() {
        return missingCallerInfoMessage;
    }
    @Override
    public final String missingCallerInfoMessage() {
        return String.format(missingCallerInfoMessage$str());
    }
    private static final String invalidMBeanAttribute = "PBOX00101: %s is not an MBean attribute";
    protected String invalidMBeanAttribute$str() {
        return invalidMBeanAttribute;
    }
    @Override
    public final AttributeNotFoundException invalidMBeanAttribute(final String attrName) {
        final AttributeNotFoundException result = new AttributeNotFoundException(String.format(invalidMBeanAttribute$str(), attrName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String filePasswordUsageMessage = "PBOX00102: Write a password in opaque form to a file for use with the FilePassword accessor\n\nUsage: FilePassword salt count password password-file\n  salt  : an 8 char sequence for PBEKeySpec\n  count : iteration count for PBEKeySpec\n  password : the clear text password to write\n  password-file : the path to the file to write the password to\n";
    protected String filePasswordUsageMessage$str() {
        return filePasswordUsageMessage;
    }
    @Override
    public final String filePasswordUsageMessage() {
        return String.format(filePasswordUsageMessage$str());
    }
    private static final String unexpectedSecurityDomainInContext = "PBOX00103: The context security domain does not match expected domain %s";
    protected String unexpectedSecurityDomainInContext$str() {
        return unexpectedSecurityDomainInContext;
    }
    @Override
    public final IllegalArgumentException unexpectedSecurityDomainInContext(final String securityDomain) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(unexpectedSecurityDomainInContext$str(), securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPolicyRegistrationType = "PBOX00104: Unsupported policy registration type: %s";
    protected String invalidPolicyRegistrationType$str() {
        return invalidPolicyRegistrationType;
    }
    @Override
    public final RuntimeException invalidPolicyRegistrationType(final String type) {
        final RuntimeException result = new RuntimeException(String.format(invalidPolicyRegistrationType$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String pbeUtilsMessage = "PBOX00105: Ecrypt a password using the JaasSecurityDomain password\n\nUsage: PBEUtils salt count domain-password password\n  salt : the Salt attribute from the JaasSecurityDomain\n  count : the IterationCount attribute from the JaasSecurityDomain\n  domain-password : the plaintext password that maps to the KeyStorePass attribute from the JaasSecurityDomain\n  password : the plaintext password that should be encrypted with the JaasSecurityDomain password\n";
    protected String pbeUtilsMessage$str() {
        return pbeUtilsMessage;
    }
    @Override
    public final String pbeUtilsMessage() {
        return String.format(pbeUtilsMessage$str());
    }
    private static final String failedToResolveTargetStateMessage = "PBOX00106: Failed to resolve target state %s for transition %s";
    protected String failedToResolveTargetStateMessage$str() {
        return failedToResolveTargetStateMessage;
    }
    @Override
    public final String failedToResolveTargetStateMessage(final String targetName, final String transitionName) {
        return String.format(failedToResolveTargetStateMessage$str(), targetName, transitionName);
    }
    private static final String invalidTransitionForActionMessage = "PBOX00107: No transition for action %s from state %s ";
    protected String invalidTransitionForActionMessage$str() {
        return invalidTransitionForActionMessage;
    }
    @Override
    public final String invalidTransitionForActionMessage(final String actionName, final String stateName) {
        return String.format(invalidTransitionForActionMessage$str(), actionName, stateName);
    }
    private static final String unableToLocateMBeanServer = "PBOX00108: Unable to locate MBean server";
    protected String unableToLocateMBeanServer$str() {
        return unableToLocateMBeanServer;
    }
    @Override
    public final IllegalStateException unableToLocateMBeanServer() {
        final IllegalStateException result = new IllegalStateException(String.format(unableToLocateMBeanServer$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToCreateDocumentBuilder = "PBOX00109: Failed to create DocumentBuilder";
    protected String failedToCreateDocumentBuilder$str() {
        return failedToCreateDocumentBuilder;
    }
    @Override
    public final RuntimeException failedToCreateDocumentBuilder(final Throwable throwable) {
        final RuntimeException result = new RuntimeException(String.format(failedToCreateDocumentBuilder$str()), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToFindNamespaceURI = "PBOX00110: Failed to find namespace URI for %s";
    protected String failedToFindNamespaceURI$str() {
        return failedToFindNamespaceURI;
    }
    @Override
    public final RuntimeException failedToFindNamespaceURI(final String elementName) {
        final RuntimeException result = new RuntimeException(String.format(failedToFindNamespaceURI$str(), elementName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String base64EncoderMessage = "PBOX00111: Usage: Base64Encoder <string> <optional hash algorithm>";
    protected String base64EncoderMessage$str() {
        return base64EncoderMessage;
    }
    @Override
    public final String base64EncoderMessage() {
        return String.format(base64EncoderMessage$str());
    }
    private static final String invalidBase64String = "PBOX00112: Invalid Base64 string: %s";
    protected String invalidBase64String$str() {
        return invalidBase64String;
    }
    @Override
    public final IllegalArgumentException invalidBase64String(final String base64Str) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidBase64String$str(), base64Str));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String illegalBase64Character = "PBOX00113: Illegal Base64 character";
    protected String illegalBase64Character$str() {
        return illegalBase64Character;
    }
    @Override
    public final NumberFormatException illegalBase64Character() {
        final NumberFormatException result = new NumberFormatException(String.format(illegalBase64Character$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToValidateURL = "PBOX00114: Failed to validate %s as a URL, file or classpath resource";
    protected String failedToValidateURL$str() {
        return failedToValidateURL;
    }
    @Override
    public final MalformedURLException failedToValidateURL(final String urlString) {
        final MalformedURLException result = new MalformedURLException(String.format(failedToValidateURL$str(), urlString));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingServiceAuthToken = "PBOX00115: JSSE domain %s has been requested to provide sensitive security information, but no service authentication token has been configured on it. Use setServiceAuthToken()";
    protected String missingServiceAuthToken$str() {
        return missingServiceAuthToken;
    }
    @Override
    public final IllegalStateException missingServiceAuthToken(final String securityDomain) {
        final IllegalStateException result = new IllegalStateException(String.format(missingServiceAuthToken$str(), securityDomain));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToVerifyServiceAuthToken = "PBOX00116: Service authentication token verification failed";
    protected String failedToVerifyServiceAuthToken$str() {
        return failedToVerifyServiceAuthToken;
    }
    @Override
    public final SecurityException failedToVerifyServiceAuthToken() {
        final SecurityException result = new SecurityException(String.format(failedToVerifyServiceAuthToken$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullKeyStoreURL = "PBOX00117: Cannot load KeyStore of type %s: required keyStoreURL is null";
    protected String invalidNullKeyStoreURL$str() {
        return invalidNullKeyStoreURL;
    }
    @Override
    public final RuntimeException invalidNullKeyStoreURL(final String keystoreType) {
        final RuntimeException result = new RuntimeException(String.format(invalidNullKeyStoreURL$str(), keystoreType));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidPasswordCommandType = "PBOX00118: Invalid password command type: %s";
    protected String invalidPasswordCommandType$str() {
        return invalidPasswordCommandType;
    }
    @Override
    public final IllegalArgumentException invalidPasswordCommandType(final String type) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidPasswordCommandType$str(), type));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToGetPrincipalOrCredsForAssociation = "PBOX00119: Unable to get the calling principal or its credentials for resource association";
    protected String unableToGetPrincipalOrCredsForAssociation$str() {
        return unableToGetPrincipalOrCredsForAssociation;
    }
    @Override
    public final LoginException unableToGetPrincipalOrCredsForAssociation() {
        final LoginException result = new LoginException(String.format(unableToGetPrincipalOrCredsForAssociation$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullOrEmptyOptionMap = "PBOX00120: Options map %s is null or empty";
    protected String invalidNullOrEmptyOptionMap$str() {
        return invalidNullOrEmptyOptionMap;
    }
    @Override
    public final IllegalArgumentException invalidNullOrEmptyOptionMap(final String mapName) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(invalidNullOrEmptyOptionMap$str(), mapName));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidNullOrEmptyOptionMessage = "PBOX00121: Option %s is null or empty";
    protected String invalidNullOrEmptyOptionMessage$str() {
        return invalidNullOrEmptyOptionMessage;
    }
    @Override
    public final String invalidNullOrEmptyOptionMessage(final String optionName) {
        return String.format(invalidNullOrEmptyOptionMessage$str(), optionName);
    }
    private static final String invalidUnmaskedKeystorePasswordMessage = "PBOX00122: Keystore password is not masked";
    protected String invalidUnmaskedKeystorePasswordMessage$str() {
        return invalidUnmaskedKeystorePasswordMessage;
    }
    @Override
    public final String invalidUnmaskedKeystorePasswordMessage() {
        return String.format(invalidUnmaskedKeystorePasswordMessage$str());
    }
    private static final String fileOrDirectoryDoesNotExistMessage = "PBOX00123: File or directory %s does not exist";
    protected String fileOrDirectoryDoesNotExistMessage$str() {
        return fileOrDirectoryDoesNotExistMessage;
    }
    @Override
    public final String fileOrDirectoryDoesNotExistMessage(final String fileName) {
        return String.format(fileOrDirectoryDoesNotExistMessage$str(), fileName);
    }
    private static final String invalidDirectoryFormatMessage = "PBOX00124: Directory %s does not end with / or \\";
    protected String invalidDirectoryFormatMessage$str() {
        return invalidDirectoryFormatMessage;
    }
    @Override
    public final String invalidDirectoryFormatMessage(final String directory) {
        return String.format(invalidDirectoryFormatMessage$str(), directory);
    }
    private static final String failedToRetrievePublicKeyMessage = "PBOX00125: Failed to retrieve public key from keystore using alias %s";
    protected String failedToRetrievePublicKeyMessage$str() {
        return failedToRetrievePublicKeyMessage;
    }
    @Override
    public final String failedToRetrievePublicKeyMessage(final String publicKeyAlias) {
        return String.format(failedToRetrievePublicKeyMessage$str(), publicKeyAlias);
    }
    private static final String failedToRetrieveCertificateMessage = "PBOX00126: Failed to retrieve certificate from keystore using alias %s";
    protected String failedToRetrieveCertificateMessage$str() {
        return failedToRetrieveCertificateMessage;
    }
    @Override
    public final String failedToRetrieveCertificateMessage(final String publicKeyAlias) {
        return String.format(failedToRetrieveCertificateMessage$str(), publicKeyAlias);
    }
    private static final String invalidSharedKeyMessage = "PBOX00127: The shared key is invalid or has been incorrectly encoded";
    protected String invalidSharedKeyMessage$str() {
        return invalidSharedKeyMessage;
    }
    @Override
    public final String invalidSharedKeyMessage() {
        return String.format(invalidSharedKeyMessage$str());
    }
    private static final String unableToEncryptDataMessage = "PBOX00128: Unable to encrypt data";
    protected String unableToEncryptDataMessage$str() {
        return unableToEncryptDataMessage;
    }
    @Override
    public final String unableToEncryptDataMessage() {
        return String.format(unableToEncryptDataMessage$str());
    }
    private static final String unableToWriteShareKeyFileMessage = "PBOX00129: Unable to write shared key file";
    protected String unableToWriteShareKeyFileMessage$str() {
        return unableToWriteShareKeyFileMessage;
    }
    @Override
    public final String unableToWriteShareKeyFileMessage() {
        return String.format(unableToWriteShareKeyFileMessage$str());
    }
    private static final String unableToWriteVaultDataFileMessage = "PBOX00130: Unable to write vault data file (%s)";
    protected String unableToWriteVaultDataFileMessage$str() {
        return unableToWriteVaultDataFileMessage;
    }
    @Override
    public final String unableToWriteVaultDataFileMessage(final String fileName) {
        return String.format(unableToWriteVaultDataFileMessage$str(), fileName);
    }
    private static final String sharedKeyMismatchMessage = "PBOX00131: Vault mismatch: shared key does not match for vault block %s and attribute name %s";
    protected String sharedKeyMismatchMessage$str() {
        return sharedKeyMismatchMessage;
    }
    @Override
    public final String sharedKeyMismatchMessage(final String vaultBlock, final String attributeName) {
        return String.format(sharedKeyMismatchMessage$str(), vaultBlock, attributeName);
    }
    private static final String missingSystemProperty = "PBOX00132: The specified system property %s is missing";
    protected String missingSystemProperty$str() {
        return missingSystemProperty;
    }
    @Override
    public final IllegalArgumentException missingSystemProperty(final String sysProperty) {
        final IllegalArgumentException result = new IllegalArgumentException(String.format(missingSystemProperty$str(), sysProperty));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String failedToMatchStrings = "PBOX00133: Failed to match %s and %s";
    protected String failedToMatchStrings$str() {
        return failedToMatchStrings;
    }
    @Override
    public final RuntimeException failedToMatchStrings(final String one, final String two) {
        final RuntimeException result = new RuntimeException(String.format(failedToMatchStrings$str(), one, two));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unrecognizedVaultContentVersion = "PBOX00134: Unrecognized security vault content version (%s), expecting (from %s to %s)";
    protected String unrecognizedVaultContentVersion$str() {
        return unrecognizedVaultContentVersion;
    }
    @Override
    public final RuntimeException unrecognizedVaultContentVersion(final String readVersion, final String fromVersion, final String toVersion) {
        final RuntimeException result = new RuntimeException(String.format(unrecognizedVaultContentVersion$str(), readVersion, fromVersion, toVersion));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String mixedVaultDataFound = "PBOX00135: Security Vault contains both covnerted (%s) and pre-conversion data (%s), failed to load vault";
    protected String mixedVaultDataFound$str() {
        return mixedVaultDataFound;
    }
    @Override
    public final RuntimeException mixedVaultDataFound(final String vaultDatFile, final String encDatFile) {
        final RuntimeException result = new RuntimeException(String.format(mixedVaultDataFound$str(), vaultDatFile, encDatFile));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String missingAdminKeyInOriginalVaultData = "PBOX00136: Security Vault conversion unsuccessful missing admin key in original vault data";
    protected String missingAdminKeyInOriginalVaultData$str() {
        return missingAdminKeyInOriginalVaultData;
    }
    @Override
    public final RuntimeException missingAdminKeyInOriginalVaultData() {
        final RuntimeException result = new RuntimeException(String.format(missingAdminKeyInOriginalVaultData$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String vaultDoesnotContainSecretKey = "PBOX00137: Security Vault does not contain SecretKey entry under alias (%s)";
    protected String vaultDoesnotContainSecretKey$str() {
        return vaultDoesnotContainSecretKey;
    }
    @Override
    public final RuntimeException vaultDoesnotContainSecretKey(final String alias) {
        final RuntimeException result = new RuntimeException(String.format(vaultDoesnotContainSecretKey$str(), alias));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String noSecretKeyandAliasAlreadyUsed = "PBOX00138: There is no SecretKey under the alias (%s) and the alias is already used to denote diffrent crypto object in the keystore.";
    protected String noSecretKeyandAliasAlreadyUsed$str() {
        return noSecretKeyandAliasAlreadyUsed;
    }
    @Override
    public final RuntimeException noSecretKeyandAliasAlreadyUsed(final String alias) {
        final RuntimeException result = new RuntimeException(String.format(noSecretKeyandAliasAlreadyUsed$str(), alias));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToStoreKeyStoreToFile = "PBOX00139: Unable to store keystore to file (%s)";
    protected String unableToStoreKeyStoreToFile$str() {
        return unableToStoreKeyStoreToFile;
    }
    @Override
    public final RuntimeException unableToStoreKeyStoreToFile(final Throwable throwable, final String file) {
        final RuntimeException result = new RuntimeException(String.format(unableToStoreKeyStoreToFile$str(), file), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToGetKeyStore = "PBOX00140: Unable to get keystore (%s)";
    protected String unableToGetKeyStore$str() {
        return unableToGetKeyStore;
    }
    @Override
    public final RuntimeException unableToGetKeyStore(final Throwable throwable, final String file) {
        final RuntimeException result = new RuntimeException(String.format(unableToGetKeyStore$str(), file), throwable);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToParseReferralAbsoluteName = "PBOX00141: Unable to parse referral absolute name: %s";
    protected String unableToParseReferralAbsoluteName$str() {
        return unableToParseReferralAbsoluteName;
    }
    @Override
    public final RuntimeException unableToParseReferralAbsoluteName(final URISyntaxException cause, final String absoluteName) {
        final RuntimeException result = new RuntimeException(String.format(unableToParseReferralAbsoluteName$str(), absoluteName), cause);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String invalidKeystorePasswordFormatMessage = "PBOX00142: Keystore password should be either masked or prefixed with one of {EXT}, {EXTC}, {CMD}, {CMDC}, {CLASS}";
    protected String invalidKeystorePasswordFormatMessage$str() {
        return invalidKeystorePasswordFormatMessage;
    }
    @Override
    public final String invalidKeystorePasswordFormatMessage() {
        return String.format(invalidKeystorePasswordFormatMessage$str());
    }
    private static final String unableToLoadPasswordClass = "PBOX00143: Unable to load password class (%s). Try to specify module to load class from using '{CLASS@module}class_name'";
    protected String unableToLoadPasswordClass$str() {
        return unableToLoadPasswordClass;
    }
    @Override
    public final RuntimeException unableToLoadPasswordClass(final Throwable t, final String classToLoad) {
        final RuntimeException result = new RuntimeException(String.format(unableToLoadPasswordClass$str(), classToLoad), t);
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String loadingNullorEmptyClass = "PBOX00144: Trying to load null or empty class";
    protected String loadingNullorEmptyClass$str() {
        return loadingNullorEmptyClass;
    }
    @Override
    public final RuntimeException loadingNullorEmptyClass() {
        final RuntimeException result = new RuntimeException(String.format(loadingNullorEmptyClass$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    private static final String unableToInitializeLoginContext = "PBOX00145: Unable to initialize login context";
    protected String unableToInitializeLoginContext$str() {
        return unableToInitializeLoginContext;
    }
    @Override
    public final String unableToInitializeLoginContext(final Throwable cause) {
        return String.format(unableToInitializeLoginContext$str());
    }
}
