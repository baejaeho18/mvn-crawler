package org.jboss.security;

import java.security.ProtectionDomain;
import java.security.PermissionCollection;
import java.io.Serializable;
import javax.annotation.Generated;
import java.util.Set;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Properties;
import java.net.URL;
import javax.security.auth.Subject;
import org.jboss.logging.BasicLogger;
import java.security.Permission;
import java.security.Permissions;
import java.lang.Throwable;
import java.lang.Class;
import java.util.List;
import java.lang.Object;
import javax.naming.NamingException;
import java.util.Map;
import java.security.Principal;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2015-11-20T10:19:54+0100")
public class PicketBoxLogger_$logger extends DelegatingBasicLogger implements PicketBoxLogger,BasicLogger,Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = PicketBoxLogger_$logger.class.getName();
    public PicketBoxLogger_$logger(final Logger log) {
        super(log);
    }
    @Override
    public final void traceBeginIsValid(final Principal principal, final String cacheEntry) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginIsValid$str(), principal, cacheEntry);
    }
    private static final String traceBeginIsValid = "PBOX00200: Begin isValid, principal: %s, cache entry: %s";
    protected String traceBeginIsValid$str() {
        return traceBeginIsValid;
    }
    @Override
    public final void traceEndIsValid(final boolean isValid) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndIsValid$str(), isValid);
    }
    private static final String traceEndIsValid = "PBOX00201: End isValid, result = %s";
    protected String traceEndIsValid$str() {
        return traceEndIsValid;
    }
    @Override
    public final void traceFlushWholeCache() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceFlushWholeCache$str());
    }
    private static final String traceFlushWholeCache = "PBOX00202: Flushing all entries from security cache";
    protected String traceFlushWholeCache$str() {
        return traceFlushWholeCache;
    }
    @Override
    public final void traceFlushCacheEntry(final String key) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceFlushCacheEntry$str(), key);
    }
    private static final String traceFlushCacheEntry = "PBOX00203: Flushing %s from security cache";
    protected String traceFlushCacheEntry$str() {
        return traceFlushCacheEntry;
    }
    @Override
    public final void traceBeginValidateCache(final String info, final Class<? extends Object> credentialClass) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginValidateCache$str(), info, credentialClass);
    }
    private static final String traceBeginValidateCache = "PBOX00204: Begin validateCache, domainInfo: %s, credential class: %s";
    protected String traceBeginValidateCache$str() {
        return traceBeginValidateCache;
    }
    @Override
    public final void traceEndValidteCache(final boolean isValid) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndValidteCache$str(), isValid);
    }
    private static final String traceEndValidteCache = "PBOX00205: End validateCache, result = %s";
    protected String traceEndValidteCache$str() {
        return traceEndValidteCache;
    }
    @Override
    public final void debugFailedLogin(final Throwable t) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, t, debugFailedLogin$str());
    }
    private static final String debugFailedLogin = "PBOX00206: Login failure";
    protected String debugFailedLogin$str() {
        return debugFailedLogin;
    }
    @Override
    public final void traceUpdateCache(final String inputSubject, final String cachedSubject) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceUpdateCache$str(), inputSubject, cachedSubject);
    }
    private static final String traceUpdateCache = "PBOX00207: updateCache, input subject: %s, cached subject: %s";
    protected String traceUpdateCache$str() {
        return traceUpdateCache;
    }
    @Override
    public final void traceInsertedCacheInfo(final String cacheInfo) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceInsertedCacheInfo$str(), cacheInfo);
    }
    private static final String traceInsertedCacheInfo = "PBOX00208: Inserted cache info: %s";
    protected String traceInsertedCacheInfo$str() {
        return traceInsertedCacheInfo;
    }
    @Override
    public final void traceDefaultLoginPrincipal(final Principal principal) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceDefaultLoginPrincipal$str(), principal);
    }
    private static final String traceDefaultLoginPrincipal = "PBOX00209: defaultLogin, principal: %s";
    protected String traceDefaultLoginPrincipal$str() {
        return traceDefaultLoginPrincipal;
    }
    @Override
    public final void traceDefaultLoginSubject(final String loginContext, final String subject) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceDefaultLoginSubject$str(), loginContext, subject);
    }
    private static final String traceDefaultLoginSubject = "PBOX00210: defaultLogin, login context: %s, subject: %s";
    protected String traceDefaultLoginSubject$str() {
        return traceDefaultLoginSubject;
    }
    @Override
    public final void traceCacheEntryLogoutFailure(final Throwable t) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, t, traceCacheEntryLogoutFailure$str());
    }
    private static final String traceCacheEntryLogoutFailure = "PBOX00211: Cache entry logout failed";
    protected String traceCacheEntryLogoutFailure$str() {
        return traceCacheEntryLogoutFailure;
    }
    @Override
    public final void errorLoadingConfigFile(final String filename, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorLoadingConfigFile$str(), filename);
    }
    private static final String errorLoadingConfigFile = "PBOX00212: Exception loading file %s";
    protected String errorLoadingConfigFile$str() {
        return errorLoadingConfigFile;
    }
    @Override
    public final void errorConvertingUsernameUTF8(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorConvertingUsernameUTF8$str());
    }
    private static final String errorConvertingUsernameUTF8 = "PBOX00213: Failed to convert username to byte[] using UTF-8";
    protected String errorConvertingUsernameUTF8$str() {
        return errorConvertingUsernameUTF8;
    }
    @Override
    public final void errorFindingCharset(final String charSet, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorFindingCharset$str(), charSet);
    }
    private static final String errorFindingCharset = "PBOX00214: Charset %s not found. Using platform default";
    protected String errorFindingCharset$str() {
        return errorFindingCharset;
    }
    @Override
    public final void unsupportedHashEncodingFormat(final String hashEncoding) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, unsupportedHashEncodingFormat$str(), hashEncoding);
    }
    private static final String unsupportedHashEncodingFormat = "PBOX00215: Unsupported hash encoding format: %s";
    protected String unsupportedHashEncodingFormat$str() {
        return unsupportedHashEncodingFormat;
    }
    @Override
    public final void errorCalculatingPasswordHash(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorCalculatingPasswordHash$str());
    }
    private static final String errorCalculatingPasswordHash = "PBOX00216: Password hash calculation failed";
    protected String errorCalculatingPasswordHash$str() {
        return errorCalculatingPasswordHash;
    }
    @Override
    public final void errorCheckingStrongJurisdictionPolicyFiles(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorCheckingStrongJurisdictionPolicyFiles$str());
    }
    private static final String errorCheckingStrongJurisdictionPolicyFiles = "PBOX00217: Failed to check if the strong jurisdiction policy files have been installed";
    protected String errorCheckingStrongJurisdictionPolicyFiles$str() {
        return errorCheckingStrongJurisdictionPolicyFiles;
    }
    @Override
    public final void traceBindDNNotFound() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBindDNNotFound$str());
    }
    private static final String traceBindDNNotFound = "PBOX00218: bindDN is not found";
    protected String traceBindDNNotFound$str() {
        return traceBindDNNotFound;
    }
    @Override
    public final void errorDecryptingBindCredential(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorDecryptingBindCredential$str());
    }
    private static final String errorDecryptingBindCredential = "PBOX00219: Exception while decrypting bindCredential";
    protected String errorDecryptingBindCredential$str() {
        return errorDecryptingBindCredential;
    }
    @Override
    public final void traceLDAPConnectionEnv(final Properties env) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceLDAPConnectionEnv$str(), env);
    }
    private static final String traceLDAPConnectionEnv = "PBOX00220: Logging into LDAP server with env %s";
    protected String traceLDAPConnectionEnv$str() {
        return traceLDAPConnectionEnv;
    }
    @Override
    public final void traceBeginGetAppConfigEntry(final String appName, final int size) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginGetAppConfigEntry$str(), appName, size);
    }
    private static final String traceBeginGetAppConfigEntry = "PBOX00221: Begin getAppConfigurationEntry(%s), size: %s";
    protected String traceBeginGetAppConfigEntry$str() {
        return traceBeginGetAppConfigEntry;
    }
    @Override
    public final void traceGetAppConfigEntryViaParent(final String appName, final String parentConfig) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceGetAppConfigEntryViaParent$str(), appName, parentConfig);
    }
    private static final String traceGetAppConfigEntryViaParent = "PBOX00222: getAppConfigurationEntry(%s), no entry found, trying parent config %s";
    protected String traceGetAppConfigEntryViaParent$str() {
        return traceGetAppConfigEntryViaParent;
    }
    @Override
    public final void traceGetAppConfigEntryViaDefault(final String appName, final String defaultConfig) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceGetAppConfigEntryViaDefault$str(), appName, defaultConfig);
    }
    private static final String traceGetAppConfigEntryViaDefault = "PBOX00223: getAppConfigurationEntry(%s), no entry in parent config, trying default %s";
    protected String traceGetAppConfigEntryViaDefault$str() {
        return traceGetAppConfigEntryViaDefault;
    }
    @Override
    public final void traceEndGetAppConfigEntryWithSuccess(final String appName, final String authInfo) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndGetAppConfigEntryWithSuccess$str(), appName, authInfo);
    }
    private static final String traceEndGetAppConfigEntryWithSuccess = "PBOX00224: End getAppConfigurationEntry(%s), AuthInfo: %s";
    protected String traceEndGetAppConfigEntryWithSuccess$str() {
        return traceEndGetAppConfigEntryWithSuccess;
    }
    @Override
    public final void traceEndGetAppConfigEntryWithFailure(final String appName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndGetAppConfigEntryWithFailure$str(), appName);
    }
    private static final String traceEndGetAppConfigEntryWithFailure = "PBOX00225: End getAppConfigurationEntry(%s), failed to find entry";
    protected String traceEndGetAppConfigEntryWithFailure$str() {
        return traceEndGetAppConfigEntryWithFailure;
    }
    @Override
    public final void traceAddAppConfig(final String appName, final String authInfo) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddAppConfig$str(), appName, authInfo);
    }
    private static final String traceAddAppConfig = "PBOX00226: addAppConfig(%s), AuthInfo: %s";
    protected String traceAddAppConfig$str() {
        return traceAddAppConfig;
    }
    @Override
    public final void traceRemoveAppConfig(final String appName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRemoveAppConfig$str(), appName);
    }
    private static final String traceRemoveAppConfig = "PBOX00227: removeAppConfig(%s)";
    protected String traceRemoveAppConfig$str() {
        return traceRemoveAppConfig;
    }
    @Override
    public final void warnFailureToFindConfig(final String loginConfig) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnFailureToFindConfig$str(), loginConfig);
    }
    private static final String warnFailureToFindConfig = "PBOX00228: Failed to find config: %s";
    protected String warnFailureToFindConfig$str() {
        return warnFailureToFindConfig;
    }
    @Override
    public final void traceBeginLoadConfig(final URL configURL) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginLoadConfig$str(), configURL);
    }
    private static final String traceBeginLoadConfig = "PBOX00229: Begin loadConfig, loginConfigURL: %s";
    protected String traceBeginLoadConfig$str() {
        return traceBeginLoadConfig;
    }
    @Override
    public final void traceEndLoadConfigWithSuccess(final URL configURL) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndLoadConfigWithSuccess$str(), configURL);
    }
    private static final String traceEndLoadConfigWithSuccess = "PBOX00230: End loadConfig, loginConfigURL: %s";
    protected String traceEndLoadConfigWithSuccess$str() {
        return traceEndLoadConfigWithSuccess;
    }
    @Override
    public final void warnEndLoadConfigWithFailure(final URL configURL, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, throwable, warnEndLoadConfigWithFailure$str(), configURL);
    }
    private static final String warnEndLoadConfigWithFailure = "PBOX00231: End loadConfig, failed to load config: %s";
    protected String warnEndLoadConfigWithFailure$str() {
        return warnEndLoadConfigWithFailure;
    }
    @Override
    public final void debugLoadConfigAsXML(final URL configURL) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugLoadConfigAsXML$str(), configURL);
    }
    private static final String debugLoadConfigAsXML = "PBOX00232: Try loading config as XML from %s";
    protected String debugLoadConfigAsXML$str() {
        return debugLoadConfigAsXML;
    }
    @Override
    public final void debugLoadConfigAsSun(final URL configURL, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugLoadConfigAsSun$str(), configURL);
    }
    private static final String debugLoadConfigAsSun = "PBOX00233: Failed to load config as XML. Try loading as Sun format from %s";
    protected String debugLoadConfigAsSun$str() {
        return debugLoadConfigAsSun;
    }
    @Override
    public final void warnInvalidModuleOption(final String option) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnInvalidModuleOption$str(), option);
    }
    private static final String warnInvalidModuleOption = "PBOX00234: Invalid or misspelled module option: %s";
    protected String warnInvalidModuleOption$str() {
        return warnInvalidModuleOption;
    }
    @Override
    public final void debugErrorGettingRequestFromPolicyContext(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugErrorGettingRequestFromPolicyContext$str());
    }
    private static final String debugErrorGettingRequestFromPolicyContext = "PBOX00235: Error getting request from policy context";
    protected String debugErrorGettingRequestFromPolicyContext$str() {
        return debugErrorGettingRequestFromPolicyContext;
    }
    @Override
    public final void traceBeginInitialize() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginInitialize$str());
    }
    private static final String traceBeginInitialize = "PBOX00236: Begin initialize method";
    protected String traceBeginInitialize$str() {
        return traceBeginInitialize;
    }
    @Override
    public final void traceUnauthenticatedIdentity(final String name) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceUnauthenticatedIdentity$str(), name);
    }
    private static final String traceUnauthenticatedIdentity = "PBOX00237: Saw unauthenticated indentity: %s";
    protected String traceUnauthenticatedIdentity$str() {
        return traceUnauthenticatedIdentity;
    }
    @Override
    public final void warnFailureToCreateUnauthIdentity(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, throwable, warnFailureToCreateUnauthIdentity$str());
    }
    private static final String warnFailureToCreateUnauthIdentity = "PBOX00238: Failed to create custom unauthenticated identity";
    protected String warnFailureToCreateUnauthIdentity$str() {
        return warnFailureToCreateUnauthIdentity;
    }
    @Override
    public final void traceEndInitialize() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndInitialize$str());
    }
    private static final String traceEndInitialize = "PBOX00239: End initialize method";
    protected String traceEndInitialize$str() {
        return traceEndInitialize;
    }
    @Override
    public final void traceBeginLogin() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginLogin$str());
    }
    private static final String traceBeginLogin = "PBOX00240: Begin login method";
    protected String traceBeginLogin$str() {
        return traceBeginLogin;
    }
    @Override
    public final void traceEndLogin(final boolean loginOk) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndLogin$str(), loginOk);
    }
    private static final String traceEndLogin = "PBOX00241: End login method, isValid: %s";
    protected String traceEndLogin$str() {
        return traceEndLogin;
    }
    @Override
    public final void traceBeginCommit(final boolean loginOk) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginCommit$str(), loginOk);
    }
    private static final String traceBeginCommit = "PBOX00242: Begin commit method, overall result: %s";
    protected String traceBeginCommit$str() {
        return traceBeginCommit;
    }
    @Override
    public final void traceBeginLogout() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginLogout$str());
    }
    private static final String traceBeginLogout = "PBOX00243: Begin logout method";
    protected String traceBeginLogout$str() {
        return traceBeginLogout;
    }
    @Override
    public final void traceBeginAbort(final boolean loginOk) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginAbort$str(), loginOk);
    }
    private static final String traceBeginAbort = "PBOX00244: Begin abort method, overall result: %s";
    protected String traceBeginAbort$str() {
        return traceBeginAbort;
    }
    @Override
    public final void traceSecurityDomainFound(final String domain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceSecurityDomainFound$str(), domain);
    }
    private static final String traceSecurityDomainFound = "PBOX00245: Found security domain: %s";
    protected String traceSecurityDomainFound$str() {
        return traceSecurityDomainFound;
    }
    @Override
    public final void errorGettingJSSESecurityDomain(final String domain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, errorGettingJSSESecurityDomain$str(), domain);
    }
    private static final String errorGettingJSSESecurityDomain = "PBOX00246: The JSSE security domain %s is not valid. All authentication using this login module will fail!";
    protected String errorGettingJSSESecurityDomain$str() {
        return errorGettingJSSESecurityDomain;
    }
    @Override
    public final void errorFindingSecurityDomain(final String domain, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorFindingSecurityDomain$str(), domain);
    }
    private static final String errorFindingSecurityDomain = "PBOX00247: Unable to find the security domain %s";
    protected String errorFindingSecurityDomain$str() {
        return errorFindingSecurityDomain;
    }
    @Override
    public final void errorCreatingCertificateVerifier(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorCreatingCertificateVerifier$str());
    }
    private static final String errorCreatingCertificateVerifier = "PBOX00248: Failed to create X509CertificateVerifier";
    protected String errorCreatingCertificateVerifier$str() {
        return errorCreatingCertificateVerifier;
    }
    @Override
    public final void debugPasswordNotACertificate() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugPasswordNotACertificate$str());
    }
    private static final String debugPasswordNotACertificate = "PBOX00249: javax.security.auth.login.password is not a X509Certificate";
    protected String debugPasswordNotACertificate$str() {
        return debugPasswordNotACertificate;
    }
    @Override
    public final void traceUsingUnauthIdentity(final String unauthenticatedIdentity) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceUsingUnauthIdentity$str(), unauthenticatedIdentity);
    }
    private static final String traceUsingUnauthIdentity = "PBOX00250: Authenticating using unauthenticated identity %s";
    protected String traceUsingUnauthIdentity$str() {
        return traceUsingUnauthIdentity;
    }
    @Override
    public final void debugFailureToCreateIdentityForAlias(final String alias, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToCreateIdentityForAlias$str(), alias);
    }
    private static final String debugFailureToCreateIdentityForAlias = "PBOX00251: Failed to create identity for alias %s";
    protected String debugFailureToCreateIdentityForAlias$str() {
        return debugFailureToCreateIdentityForAlias;
    }
    @Override
    public final void traceBeginGetAliasAndCert() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginGetAliasAndCert$str());
    }
    private static final String traceBeginGetAliasAndCert = "PBOX00252: Begin getAliasAndCert method";
    protected String traceBeginGetAliasAndCert$str() {
        return traceBeginGetAliasAndCert;
    }
    @Override
    public final void traceCertificateFound(final String serialNumber, final String subjectDN) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceCertificateFound$str(), serialNumber, subjectDN);
    }
    private static final String traceCertificateFound = "PBOX00253: Found certificate, serial number: %s, subject DN: %s";
    protected String traceCertificateFound$str() {
        return traceCertificateFound;
    }
    @Override
    public final void warnNullCredentialFromCallbackHandler() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnNullCredentialFromCallbackHandler$str());
    }
    private static final String warnNullCredentialFromCallbackHandler = "PBOX00254: CallbackHandler did not provide a credential";
    protected String warnNullCredentialFromCallbackHandler$str() {
        return warnNullCredentialFromCallbackHandler;
    }
    @Override
    public final void traceEndGetAliasAndCert() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndGetAliasAndCert$str());
    }
    private static final String traceEndGetAliasAndCert = "PBOX00255: End getAliasAndCert method";
    protected String traceEndGetAliasAndCert$str() {
        return traceEndGetAliasAndCert;
    }
    @Override
    public final void traceBeginValidateCredential() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginValidateCredential$str());
    }
    private static final String traceBeginValidateCredential = "PBOX00256: Begin validateCredential method";
    protected String traceBeginValidateCredential$str() {
        return traceBeginValidateCredential;
    }
    @Override
    public final void traceValidatingUsingVerifier(final Class<? extends Object> verifier) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceValidatingUsingVerifier$str(), verifier);
    }
    private static final String traceValidatingUsingVerifier = "PBOX00257: Validating certificate using verifier %s";
    protected String traceValidatingUsingVerifier$str() {
        return traceValidatingUsingVerifier;
    }
    @Override
    public final void warnFailureToFindCertForAlias(final String alias, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, throwable, warnFailureToFindCertForAlias$str(), alias);
    }
    private static final String warnFailureToFindCertForAlias = "PBOX00258: Failed to find certificate for alias &%s";
    protected String warnFailureToFindCertForAlias$str() {
        return warnFailureToFindCertForAlias;
    }
    @Override
    public final void warnFailureToValidateCertificate() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnFailureToValidateCertificate$str());
    }
    private static final String warnFailureToValidateCertificate = "PBOX00259: Failed to validate certificate: SecurityDomain, Keystore or certificate is null";
    protected String warnFailureToValidateCertificate$str() {
        return warnFailureToValidateCertificate;
    }
    @Override
    public final void traceEndValidateCredential(final boolean isValid) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndValidateCredential$str(), isValid);
    }
    private static final String traceEndValidateCredential = "PBOX00260: End validateCredential method, result: %s";
    protected String traceEndValidateCredential$str() {
        return traceEndValidateCredential;
    }
    @Override
    public final void errorLoadingUserRolesPropertiesFiles(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, throwable, errorLoadingUserRolesPropertiesFiles$str());
    }
    private static final String errorLoadingUserRolesPropertiesFiles = "PBOX00261: Failed to load users/passwords/roles files";
    protected String errorLoadingUserRolesPropertiesFiles$str() {
        return errorLoadingUserRolesPropertiesFiles;
    }
    @Override
    public final void traceDBCertLoginModuleOptions(final String dsJNDIName, final String principalsQuery, final String rolesQuery, final boolean suspendResume) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceDBCertLoginModuleOptions$str(), dsJNDIName, principalsQuery, rolesQuery, suspendResume);
    }
    private static final String traceDBCertLoginModuleOptions = "PBOX00262: Module options [dsJndiName: %s, principalsQuery: %s, rolesQuery: %s, suspendResume: %s]";
    protected String traceDBCertLoginModuleOptions$str() {
        return traceDBCertLoginModuleOptions;
    }
    @Override
    public final void traceExecuteQuery(final String query, final String username) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceExecuteQuery$str(), query, username);
    }
    private static final String traceExecuteQuery = "PBOX00263: Executing query %s with username %s";
    protected String traceExecuteQuery$str() {
        return traceExecuteQuery;
    }
    @Override
    public final void debugFailureToCreatePrincipal(final String name, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToCreatePrincipal$str(), name);
    }
    private static final String debugFailureToCreatePrincipal = "PBOX00264: Failed to create principal %s";
    protected String debugFailureToCreatePrincipal$str() {
        return debugFailureToCreatePrincipal;
    }
    @Override
    public final void errorUsingDisabledDomain(final String securityDomain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, errorUsingDisabledDomain$str(), securityDomain);
    }
    private static final String errorUsingDisabledDomain = "PBOX00265: The security domain %s has been disabled. All authentication will fail";
    protected String errorUsingDisabledDomain$str() {
        return errorUsingDisabledDomain;
    }
    @Override
    public final void traceBindingLDAPUsername(final String username) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBindingLDAPUsername$str(), username);
    }
    private static final String traceBindingLDAPUsername = "PBOX00266: Binding username %s";
    protected String traceBindingLDAPUsername$str() {
        return traceBindingLDAPUsername;
    }
    @Override
    public final void traceRejectingEmptyPassword() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRejectingEmptyPassword$str());
    }
    private static final String traceRejectingEmptyPassword = "PBOX00267: Rejecting empty password as allowEmptyPasswords option has not been set to true";
    protected String traceRejectingEmptyPassword$str() {
        return traceRejectingEmptyPassword;
    }
    @Override
    public final void traceAssignUserToRole(final String role) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAssignUserToRole$str(), role);
    }
    private static final String traceAssignUserToRole = "PBOX00268: Assigning user to role %s";
    protected String traceAssignUserToRole$str() {
        return traceAssignUserToRole;
    }
    @Override
    public final void debugFailureToParseNumberProperty(final String property, final long defaultValue) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugFailureToParseNumberProperty$str(), property, defaultValue);
    }
    private static final String debugFailureToParseNumberProperty = "PBOX00269: Failed to parse %s as number, using default value %s";
    protected String debugFailureToParseNumberProperty$str() {
        return debugFailureToParseNumberProperty;
    }
    @Override
    public final void debugFailureToQueryLDAPAttribute(final String attributeName, final String contextName, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToQueryLDAPAttribute$str(), attributeName, contextName);
    }
    private static final String debugFailureToQueryLDAPAttribute = "PBOX00270: Failed to query %s from %s";
    protected String debugFailureToQueryLDAPAttribute$str() {
        return debugFailureToQueryLDAPAttribute;
    }
    @Override
    public final void traceSuccessfulLogInToLDAP(final String context) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceSuccessfulLogInToLDAP$str(), context);
    }
    private static final String traceSuccessfulLogInToLDAP = "PBOX00271: Logged into LDAP server, context: %s";
    protected String traceSuccessfulLogInToLDAP$str() {
        return traceSuccessfulLogInToLDAP;
    }
    @Override
    public final void traceRebindWithConfiguredPrincipal(final String principal) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRebindWithConfiguredPrincipal$str(), principal);
    }
    private static final String traceRebindWithConfiguredPrincipal = "PBOX00272: Rebind security principal to %s";
    protected String traceRebindWithConfiguredPrincipal$str() {
        return traceRebindWithConfiguredPrincipal;
    }
    @Override
    public final void traceFoundUserRolesContextDN(final String context) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceFoundUserRolesContextDN$str(), context);
    }
    private static final String traceFoundUserRolesContextDN = "PBOX00273: Found user roles context DN: %s";
    protected String traceFoundUserRolesContextDN$str() {
        return traceFoundUserRolesContextDN;
    }
    @Override
    public final void traceRolesDNSearch(final String dn, final String roleFilter, final String filterArgs, final String roleAttr, final int searchScope, final int searchTimeLimit) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRolesDNSearch$str(), dn, roleFilter, filterArgs, roleAttr, searchScope, searchTimeLimit);
    }
    private static final String traceRolesDNSearch = "PBOX00274: Searching rolesCtxDN %s with roleFilter: %s, filterArgs: %s, roleAttr: %s, searchScope: %s, searchTimeLimit: %s";
    protected String traceRolesDNSearch$str() {
        return traceRolesDNSearch;
    }
    @Override
    public final void traceCheckSearchResult(final String searchResult) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceCheckSearchResult$str(), searchResult);
    }
    private static final String traceCheckSearchResult = "PBOX00275: Checking search result %s";
    protected String traceCheckSearchResult$str() {
        return traceCheckSearchResult;
    }
    @Override
    public final void traceFollowRoleDN(final String roleDN) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceFollowRoleDN$str(), roleDN);
    }
    private static final String traceFollowRoleDN = "PBOX00276: Following roleDN %s";
    protected String traceFollowRoleDN$str() {
        return traceFollowRoleDN;
    }
    @Override
    public final void debugFailureToFindAttrInSearchResult(final String attrName, final String searchResult) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugFailureToFindAttrInSearchResult$str(), attrName, searchResult);
    }
    private static final String debugFailureToFindAttrInSearchResult = "PBOX00277: No attribute %s found in search result %s";
    protected String debugFailureToFindAttrInSearchResult$str() {
        return debugFailureToFindAttrInSearchResult;
    }
    @Override
    public final void debugFailureToExecuteRolesDNSearch(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToExecuteRolesDNSearch$str());
    }
    private static final String debugFailureToExecuteRolesDNSearch = "PBOX00278: Failed to locate roles";
    protected String debugFailureToExecuteRolesDNSearch$str() {
        return debugFailureToExecuteRolesDNSearch;
    }
    @Override
    public final void debugRealHostForTrust(final String host) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugRealHostForTrust$str(), host);
    }
    private static final String debugRealHostForTrust = "PBOX00279: The real host for trust is %s";
    protected String debugRealHostForTrust$str() {
        return debugRealHostForTrust;
    }
    @Override
    public final void debugFailureToLoadPropertiesFile(final String fileName, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToLoadPropertiesFile$str(), fileName);
    }
    private static final String debugFailureToLoadPropertiesFile = "PBOX00280: Failed to load properties file %s";
    protected String debugFailureToLoadPropertiesFile$str() {
        return debugFailureToLoadPropertiesFile;
    }
    @Override
    public final void debugPasswordHashing(final String algorithm, final String encoding, final String charset, final String callback, final String storeCallBack) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugPasswordHashing$str(), algorithm, encoding, charset, callback, storeCallBack);
    }
    private static final String debugPasswordHashing = "PBOX00281: Password hashing activated, algorithm: %s, encoding: %s, charset: %s, callback: %s, storeCallBack: %s";
    protected String debugPasswordHashing$str() {
        return debugPasswordHashing;
    }
    @Override
    public final void debugFailureToInstantiateClass(final String className, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToInstantiateClass$str(), className);
    }
    private static final String debugFailureToInstantiateClass = "PBOX00282: Failed to instantiate class %s";
    protected String debugFailureToInstantiateClass$str() {
        return debugFailureToInstantiateClass;
    }
    @Override
    public final void debugBadPasswordForUsername(final String username) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugBadPasswordForUsername$str(), username);
    }
    private static final String debugBadPasswordForUsername = "PBOX00283: Bad password for username %s";
    protected String debugBadPasswordForUsername$str() {
        return debugBadPasswordForUsername;
    }
    @Override
    public final void traceCreateDigestCallback(final String callback) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceCreateDigestCallback$str(), callback);
    }
    private static final String traceCreateDigestCallback = "PBOX00284: Created DigestCallback %s";
    protected String traceCreateDigestCallback$str() {
        return traceCreateDigestCallback;
    }
    @Override
    public final void traceAdditionOfRoleToGroup(final String roleName, final String groupName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAdditionOfRoleToGroup$str(), roleName, groupName);
    }
    private static final String traceAdditionOfRoleToGroup = "PBOX00285: Adding role %s to group %s";
    protected String traceAdditionOfRoleToGroup$str() {
        return traceAdditionOfRoleToGroup;
    }
    @Override
    public final void traceAttemptToLoadResource(final String resourceURL) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAttemptToLoadResource$str(), resourceURL);
    }
    private static final String traceAttemptToLoadResource = "PBOX00286: Attempting to load resource %s";
    protected String traceAttemptToLoadResource$str() {
        return traceAttemptToLoadResource;
    }
    @Override
    public final void debugFailureToOpenPropertiesFromURL(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureToOpenPropertiesFromURL$str());
    }
    private static final String debugFailureToOpenPropertiesFromURL = "PBOX00287: Failed to open properties file from URL";
    protected String debugFailureToOpenPropertiesFromURL$str() {
        return debugFailureToOpenPropertiesFromURL;
    }
    @Override
    public final void tracePropertiesFileLoaded(final String fileName, final Set<? extends Object> users) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, tracePropertiesFileLoaded$str(), fileName, users);
    }
    private static final String tracePropertiesFileLoaded = "PBOX00288: Properties file %s loaded, users: %s";
    protected String tracePropertiesFileLoaded$str() {
        return tracePropertiesFileLoaded;
    }
    @Override
    public final void debugJACCDeniedAccess(final String permission, final Subject caller, final String roles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugJACCDeniedAccess$str(), permission, caller, roles);
    }
    private static final String debugJACCDeniedAccess = "PBOX00289: JACC delegate access denied [permission: %s, caller: %s, roles: %s";
    protected String debugJACCDeniedAccess$str() {
        return debugJACCDeniedAccess;
    }
    @Override
    public final void traceNoMethodPermissions(final String methodName, final String interfaceName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceNoMethodPermissions$str(), methodName, interfaceName);
    }
    private static final String traceNoMethodPermissions = "PBOX00290: No method permissions assigned to method: %s, interface: %s";
    protected String traceNoMethodPermissions$str() {
        return traceNoMethodPermissions;
    }
    @Override
    public final void debugEJBPolicyModuleDelegateState(final String methodName, final String interfaceName, final String requiredRoles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugEJBPolicyModuleDelegateState$str(), methodName, interfaceName, requiredRoles);
    }
    private static final String debugEJBPolicyModuleDelegateState = "PBOX00291: Method: %s, interface: %s, required roles: %s";
    protected String debugEJBPolicyModuleDelegateState$str() {
        return debugEJBPolicyModuleDelegateState;
    }
    @Override
    public final void debugInsufficientMethodPermissions(final Principal ejbPrincipal, final String ejbName, final String methodName, final String interfaceName, final String requiredRoles, final String principalRoles, final String runAsRoles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugInsufficientMethodPermissions$str(), ejbPrincipal, ejbName, methodName, interfaceName, requiredRoles, principalRoles, runAsRoles);
    }
    private static final String debugInsufficientMethodPermissions = "PBOX00292: Insufficient method permissions [principal: %s, EJB name: %s, method: %s, interface: %s, required roles: %s, principal roles: %s, run-as roles: %s]";
    protected String debugInsufficientMethodPermissions$str() {
        return debugInsufficientMethodPermissions;
    }
    @Override
    public final void debugIgnoredException(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugIgnoredException$str());
    }
    private static final String debugIgnoredException = "PBOX00293: Exception caught";
    protected String debugIgnoredException$str() {
        return debugIgnoredException;
    }
    @Override
    public final void debugInvalidWebJaccCheck() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugInvalidWebJaccCheck$str());
    }
    private static final String debugInvalidWebJaccCheck = "PBOX00294: Check is not resourcePerm, userDataPerm or roleRefPerm";
    protected String debugInvalidWebJaccCheck$str() {
        return debugInvalidWebJaccCheck;
    }
    @Override
    public final void traceHasResourcePermission(final String permission, final boolean allowed) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceHasResourcePermission$str(), permission, allowed);
    }
    private static final String traceHasResourcePermission = "PBOX00295: hasResourcePermission, permission: %s, allowed: %s";
    protected String traceHasResourcePermission$str() {
        return traceHasResourcePermission;
    }
    @Override
    public final void traceHasRolePermission(final String permission, final boolean allowed) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceHasRolePermission$str(), permission, allowed);
    }
    private static final String traceHasRolePermission = "PBOX00296: hasRolePermission, permission: %s, allowed: %s";
    protected String traceHasRolePermission$str() {
        return traceHasRolePermission;
    }
    @Override
    public final void traceHasUserDataPermission(final String permission, final boolean allowed) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceHasUserDataPermission$str(), permission, allowed);
    }
    private static final String traceHasUserDataPermission = "PBOX00297: hasUserDataPermission, permission: %s, allowed: %s";
    protected String traceHasUserDataPermission$str() {
        return traceHasUserDataPermission;
    }
    @Override
    public final void debugRequisiteModuleFailure(final String moduleName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugRequisiteModuleFailure$str(), moduleName);
    }
    private static final String debugRequisiteModuleFailure = "PBOX00298: Requisite module %s failed";
    protected String debugRequisiteModuleFailure$str() {
        return debugRequisiteModuleFailure;
    }
    @Override
    public final void debugRequiredModuleFailure(final String moduleName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugRequiredModuleFailure$str(), moduleName);
    }
    private static final String debugRequiredModuleFailure = "PBOX00299: Required module %s failed";
    protected String debugRequiredModuleFailure$str() {
        return debugRequiredModuleFailure;
    }
    @Override
    public final void traceImpliesMatchesExcludedSet(final Permission permission) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceImpliesMatchesExcludedSet$str(), permission);
    }
    private static final String traceImpliesMatchesExcludedSet = "PBOX00300: Denied: matched excluded set, permission %s";
    protected String traceImpliesMatchesExcludedSet$str() {
        return traceImpliesMatchesExcludedSet;
    }
    @Override
    public final void traceImpliesMatchesUncheckedSet(final Permission permission) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceImpliesMatchesUncheckedSet$str(), permission);
    }
    private static final String traceImpliesMatchesUncheckedSet = "PBOX00301: Allowed: matched unchecked set, permission %s";
    protected String traceImpliesMatchesUncheckedSet$str() {
        return traceImpliesMatchesUncheckedSet;
    }
    @Override
    public final void traceProtectionDomainPrincipals(final List<String> principalNames) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceProtectionDomainPrincipals$str(), principalNames);
    }
    private static final String traceProtectionDomainPrincipals = "PBOX00302: Protection domain principals: %s";
    protected String traceProtectionDomainPrincipals$str() {
        return traceProtectionDomainPrincipals;
    }
    @Override
    public final void traceNoPrincipalsInProtectionDomain(final ProtectionDomain domain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceNoPrincipalsInProtectionDomain$str(), domain);
    }
    private static final String traceNoPrincipalsInProtectionDomain = "PBOX00303: Not principals found in protection domain %s";
    protected String traceNoPrincipalsInProtectionDomain$str() {
        return traceNoPrincipalsInProtectionDomain;
    }
    @Override
    public final void debugImpliesParameters(final String roleName, final Permissions permissions) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugImpliesParameters$str(), roleName, permissions);
    }
    private static final String debugImpliesParameters = "PBOX00304: Checking role: %s, permissions: %s";
    protected String debugImpliesParameters$str() {
        return debugImpliesParameters;
    }
    @Override
    public final void debugImpliesResult(final boolean implies) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugImpliesResult$str(), implies);
    }
    private static final String debugImpliesResult = "PBOX00305: Checking result, implies: %s";
    protected String debugImpliesResult$str() {
        return debugImpliesResult;
    }
    @Override
    public final void traceNoPolicyContextForId(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceNoPolicyContextForId$str(), contextID);
    }
    private static final String traceNoPolicyContextForId = "PBOX00306: No PolicyContext found for contextID %s";
    protected String traceNoPolicyContextForId$str() {
        return traceNoPolicyContextForId;
    }
    @Override
    public final void debugJBossPolicyConfigurationConstruction(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugJBossPolicyConfigurationConstruction$str(), contextID);
    }
    private static final String debugJBossPolicyConfigurationConstruction = "PBOX00307: Constructing JBossPolicyConfiguration with contextID %s";
    protected String debugJBossPolicyConfigurationConstruction$str() {
        return debugJBossPolicyConfigurationConstruction;
    }
    @Override
    public final void traceAddPermissionToExcludedPolicy(final Permission permission) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionToExcludedPolicy$str(), permission);
    }
    private static final String traceAddPermissionToExcludedPolicy = "PBOX00308: addToExcludedPolicy, permission: %s";
    protected String traceAddPermissionToExcludedPolicy$str() {
        return traceAddPermissionToExcludedPolicy;
    }
    @Override
    public final void traceAddPermissionsToExcludedPolicy(final PermissionCollection permissions) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionsToExcludedPolicy$str(), permissions);
    }
    private static final String traceAddPermissionsToExcludedPolicy = "PBOX00309: addToExcludedPolicy, permission collection: %s";
    protected String traceAddPermissionsToExcludedPolicy$str() {
        return traceAddPermissionsToExcludedPolicy;
    }
    @Override
    public final void traceAddPermissionToRole(final Permission permission) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionToRole$str(), permission);
    }
    private static final String traceAddPermissionToRole = "PBOX00310: addToRole, permission: %s";
    protected String traceAddPermissionToRole$str() {
        return traceAddPermissionToRole;
    }
    @Override
    public final void traceAddPermissionsToRole(final PermissionCollection permissions) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionsToRole$str(), permissions);
    }
    private static final String traceAddPermissionsToRole = "PBOX00311: addToRole, permission collection: %s";
    protected String traceAddPermissionsToRole$str() {
        return traceAddPermissionsToRole;
    }
    @Override
    public final void traceAddPermissionToUncheckedPolicy(final Permission permission) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionToUncheckedPolicy$str(), permission);
    }
    private static final String traceAddPermissionToUncheckedPolicy = "PBOX00312: addToUncheckedPolicy, permission: %s";
    protected String traceAddPermissionToUncheckedPolicy$str() {
        return traceAddPermissionToUncheckedPolicy;
    }
    @Override
    public final void traceAddPermissionsToUncheckedPolicy(final PermissionCollection permissions) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceAddPermissionsToUncheckedPolicy$str(), permissions);
    }
    private static final String traceAddPermissionsToUncheckedPolicy = "PBOX00313: addToUncheckedPolicy, permission collection: %s";
    protected String traceAddPermissionsToUncheckedPolicy$str() {
        return traceAddPermissionsToUncheckedPolicy;
    }
    @Override
    public final void tracePolicyConfigurationCommit(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, tracePolicyConfigurationCommit$str(), contextID);
    }
    private static final String tracePolicyConfigurationCommit = "PBOX00314: commit, contextID: %s";
    protected String tracePolicyConfigurationCommit$str() {
        return tracePolicyConfigurationCommit;
    }
    @Override
    public final void tracePolicyConfigurationDelete(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, tracePolicyConfigurationDelete$str(), contextID);
    }
    private static final String tracePolicyConfigurationDelete = "PBOX00315: delete, contextID: %s";
    protected String tracePolicyConfigurationDelete$str() {
        return tracePolicyConfigurationDelete;
    }
    @Override
    public final void traceLinkConfiguration(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceLinkConfiguration$str(), contextID);
    }
    private static final String traceLinkConfiguration = "PBOX00316: linkConfiguration, link to contextID: %s";
    protected String traceLinkConfiguration$str() {
        return traceLinkConfiguration;
    }
    @Override
    public final void traceRemoveExcludedPolicy(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRemoveExcludedPolicy$str(), contextID);
    }
    private static final String traceRemoveExcludedPolicy = "PBOX00317: removeExcludedPolicy, contextID: %s";
    protected String traceRemoveExcludedPolicy$str() {
        return traceRemoveExcludedPolicy;
    }
    @Override
    public final void traceRemoveRole(final String roleName, final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRemoveRole$str(), roleName, contextID);
    }
    private static final String traceRemoveRole = "PBOX00318: removeRole, role name: %s, contextID: %s";
    protected String traceRemoveRole$str() {
        return traceRemoveRole;
    }
    @Override
    public final void traceRemoveUncheckedPolicy(final String contextID) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRemoveUncheckedPolicy$str(), contextID);
    }
    private static final String traceRemoveUncheckedPolicy = "PBOX00319: removeUncheckedPolicy, contextID: %s";
    protected String traceRemoveUncheckedPolicy$str() {
        return traceRemoveUncheckedPolicy;
    }
    @Override
    public final void traceMappedX500Principal(final Principal newPrincipal) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceMappedX500Principal$str(), newPrincipal);
    }
    private static final String traceMappedX500Principal = "PBOX00320: Mapped X500 principal, new principal: %s";
    protected String traceMappedX500Principal$str() {
        return traceMappedX500Principal;
    }
    @Override
    public final void traceQueryWithEmptyResult() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceQueryWithEmptyResult$str());
    }
    private static final String traceQueryWithEmptyResult = "PBOX00321: Query returned an empty result";
    protected String traceQueryWithEmptyResult$str() {
        return traceQueryWithEmptyResult;
    }
    @Override
    public final void debugMappingProviderOptions(final Principal principal, final Map<String, Set<String>> principalRolesMap, final Set<Principal> subjectPrincipals) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugMappingProviderOptions$str(), principal, principalRolesMap, subjectPrincipals);
    }
    private static final String debugMappingProviderOptions = "PBOX00322: Mapping provider options [principal: %s, principal to roles map: %s, subject principals: %s]";
    protected String debugMappingProviderOptions$str() {
        return debugMappingProviderOptions;
    }
    @Override
    public final void traceNoAuditContextFoundForDomain(final String securityDomain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceNoAuditContextFoundForDomain$str(), securityDomain);
    }
    private static final String traceNoAuditContextFoundForDomain = "PBOX00323: No audit context found for security domain %s; using default context";
    protected String traceNoAuditContextFoundForDomain$str() {
        return traceNoAuditContextFoundForDomain;
    }
    @Override
    public final void debugNullAuthorizationManager(final String securityDomain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugNullAuthorizationManager$str(), securityDomain);
    }
    private static final String debugNullAuthorizationManager = "PBOX00324: AuthorizationManager is null for security domain %s";
    protected String debugNullAuthorizationManager$str() {
        return debugNullAuthorizationManager;
    }
    @Override
    public final void debugAuthorizationError(final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugAuthorizationError$str());
    }
    private static final String debugAuthorizationError = "PBOX00325: Authorization processing error";
    protected String debugAuthorizationError$str() {
        return debugAuthorizationError;
    }
    @Override
    public final void debugFailureExecutingMethod(final String methodName, final Throwable throwable) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, throwable, debugFailureExecutingMethod$str(), methodName);
    }
    private static final String debugFailureExecutingMethod = "PBOX00326: %s processing failed";
    protected String debugFailureExecutingMethod$str() {
        return debugFailureExecutingMethod;
    }
    @Override
    public final void traceHostThreadLocalGet(final String host, final long threadId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceHostThreadLocalGet$str(), host, threadId);
    }
    private static final String traceHostThreadLocalGet = "PBOX00327: Returning host %s from thread [id: %s]";
    protected String traceHostThreadLocalGet$str() {
        return traceHostThreadLocalGet;
    }
    @Override
    public final void traceHostThreadLocalSet(final String host, final long threadId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceHostThreadLocalSet$str(), host, threadId);
    }
    private static final String traceHostThreadLocalSet = "PBOX00328: Setting host %s on thread [id: %s]";
    protected String traceHostThreadLocalSet$str() {
        return traceHostThreadLocalSet;
    }
    @Override
    public final void traceBeginDoesUserHaveRole(final Principal principal, final String roles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginDoesUserHaveRole$str(), principal, roles);
    }
    private static final String traceBeginDoesUserHaveRole = "PBOX00329: Begin doesUserHaveRole, principal: %s, roles: %s";
    protected String traceBeginDoesUserHaveRole$str() {
        return traceBeginDoesUserHaveRole;
    }
    @Override
    public final void traceEndDoesUserHaveRole(final boolean hasRole) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndDoesUserHaveRole$str(), hasRole);
    }
    private static final String traceEndDoesUserHaveRole = "PBOX00330: End doesUserHaveRole, result: %s";
    protected String traceEndDoesUserHaveRole$str() {
        return traceEndDoesUserHaveRole;
    }
    @Override
    public final void traceRolesBeforeMapping(final String roles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRolesBeforeMapping$str(), roles);
    }
    private static final String traceRolesBeforeMapping = "PBOX00331: Roles before mapping: %s";
    protected String traceRolesBeforeMapping$str() {
        return traceRolesBeforeMapping;
    }
    @Override
    public final void traceRolesAfterMapping(final String roles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRolesAfterMapping$str(), roles);
    }
    private static final String traceRolesAfterMapping = "PBOX00332: Roles after mapping: %s";
    protected String traceRolesAfterMapping$str() {
        return traceRolesAfterMapping;
    }
    @Override
    public final void traceDeregisterPolicy(final String contextID, final String type) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceDeregisterPolicy$str(), contextID, type);
    }
    private static final String traceDeregisterPolicy = "PBOX00333: Deregistered policy for contextID: %s, type: %s";
    protected String traceDeregisterPolicy$str() {
        return traceDeregisterPolicy;
    }
    @Override
    public final void traceRegisterPolicy(final String contextID, final String type, final String location) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRegisterPolicy$str(), contextID, type, location);
    }
    private static final String traceRegisterPolicy = "PBOX00334: Registered policy for contextID: %s, type: %s, location: %s";
    protected String traceRegisterPolicy$str() {
        return traceRegisterPolicy;
    }
    @Override
    public final void warnSecurityMagementNotSet() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnSecurityMagementNotSet$str());
    }
    private static final String warnSecurityMagementNotSet = "PBOX00335: SecurityManagement is not set, creating a default one";
    protected String warnSecurityMagementNotSet$str() {
        return warnSecurityMagementNotSet;
    }
    @Override
    public final void debugNullAuthenticationManager(final String securityDomain) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugNullAuthenticationManager$str(), securityDomain);
    }
    private static final String debugNullAuthenticationManager = "PBOX00336: AuthenticationManager is null for security domain %s";
    protected String debugNullAuthenticationManager$str() {
        return debugNullAuthenticationManager;
    }
    @Override
    public final void traceStateMachineNextState(final String action, final String nextState) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceStateMachineNextState$str(), action, nextState);
    }
    private static final String traceStateMachineNextState = "PBOX00337: nextState for action %s: %s";
    protected String traceStateMachineNextState$str() {
        return traceStateMachineNextState;
    }
    @Override
    public final void traceIgnoreXMLAttribute(final String uri, final String qName, final String value) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceIgnoreXMLAttribute$str(), uri, qName, value);
    }
    private static final String traceIgnoreXMLAttribute = "PBOX00338: Ignore attribute [uri: %s, qname: %s, value: %s]";
    protected String traceIgnoreXMLAttribute$str() {
        return traceIgnoreXMLAttribute;
    }
    @Override
    public final void traceSystemIDMismatch(final String systemId, final String publicId, final String registeredId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceSystemIDMismatch$str(), systemId, publicId, registeredId);
    }
    private static final String traceSystemIDMismatch = "PBOX00339: systemId argument '%s' for publicId '%s' is different from the registered systemId '%s', resolution will be based on the argument";
    protected String traceSystemIDMismatch$str() {
        return traceSystemIDMismatch;
    }
    @Override
    public final void debugFailureToResolveEntity(final String systemId, final String publicId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugFailureToResolveEntity$str(), systemId, publicId);
    }
    private static final String debugFailureToResolveEntity = "PBOX00340: Cannot resolve entity, systemId: %s, publicId: %s";
    protected String debugFailureToResolveEntity$str() {
        return debugFailureToResolveEntity;
    }
    @Override
    public final void traceBeginResolvePublicID(final String publicId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginResolvePublicID$str(), publicId);
    }
    private static final String traceBeginResolvePublicID = "PBOX00341: Begin resolvePublicId, publicId: %s";
    protected String traceBeginResolvePublicID$str() {
        return traceBeginResolvePublicID;
    }
    @Override
    public final void traceFoundEntityFromID(final String idName, final String idValue, final String fileName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceFoundEntityFromID$str(), idName, idValue, fileName);
    }
    private static final String traceFoundEntityFromID = "PBOX00342: Found entity from %s: %s, filename: %s";
    protected String traceFoundEntityFromID$str() {
        return traceFoundEntityFromID;
    }
    @Override
    public final void warnFailureToLoadIDFromResource(final String idName, final String resourceType, final String resourceName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnFailureToLoadIDFromResource$str(), idName, resourceType, resourceName);
    }
    private static final String warnFailureToLoadIDFromResource = "PBOX00343: Cannot load %s from %s resource: %s";
    protected String warnFailureToLoadIDFromResource$str() {
        return warnFailureToLoadIDFromResource;
    }
    @Override
    public final void traceBeginResolveSystemID(final String systemId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginResolveSystemID$str(), systemId);
    }
    private static final String traceBeginResolveSystemID = "PBOX00344: Begin resolveSystemId, systemId: %s";
    protected String traceBeginResolveSystemID$str() {
        return traceBeginResolveSystemID;
    }
    @Override
    public final void traceBeginResolveSystemIDasURL(final String systemId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginResolveSystemIDasURL$str(), systemId);
    }
    private static final String traceBeginResolveSystemIDasURL = "PBOX00345: Begin resolveSystemIdasURL, systemId: %s";
    protected String traceBeginResolveSystemIDasURL$str() {
        return traceBeginResolveSystemIDasURL;
    }
    @Override
    public final void warnResolvingSystemIdAsNonFileURL(final String systemId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnResolvingSystemIdAsNonFileURL$str(), systemId);
    }
    private static final String warnResolvingSystemIdAsNonFileURL = "PBOX00346: Trying to resolve systemId %s as a non-file URL";
    protected String warnResolvingSystemIdAsNonFileURL$str() {
        return warnResolvingSystemIdAsNonFileURL;
    }
    @Override
    public final void traceBeginResolveClasspathName(final String systemId) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginResolveClasspathName$str(), systemId);
    }
    private static final String traceBeginResolveClasspathName = "PBOX00347: Begin resolveClasspathName, systemId: %s";
    protected String traceBeginResolveClasspathName$str() {
        return traceBeginResolveClasspathName;
    }
    @Override
    public final void traceMappedSystemIdToFilename(final String filename) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceMappedSystemIdToFilename$str(), filename);
    }
    private static final String traceMappedSystemIdToFilename = "PBOX00348: Mapped systemId to filename %s";
    protected String traceMappedSystemIdToFilename$str() {
        return traceMappedSystemIdToFilename;
    }
    @Override
    public final void traceMappedResourceToURL(final String resource, final URL url) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceMappedResourceToURL$str(), resource, url);
    }
    private static final String traceMappedResourceToURL = "PBOX00349: Mapped resource %s to URL %s";
    protected String traceMappedResourceToURL$str() {
        return traceMappedResourceToURL;
    }
    @Override
    public final void debugModuleOption(final String optionName, final Object optionValue) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, debugModuleOption$str(), optionName, optionValue);
    }
    private static final String debugModuleOption = "PBOX00350: Module option: %s, value: %s";
    protected String debugModuleOption$str() {
        return debugModuleOption;
    }
    @Override
    public final void traceObtainedAuthInfoFromHandler(final Principal loginPrincipal, final Class<? extends Object> credentialClass) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceObtainedAuthInfoFromHandler$str(), loginPrincipal, credentialClass);
    }
    private static final String traceObtainedAuthInfoFromHandler = "PBOX00351: Obtained auth info from handler, principal: %s, credential class: %s";
    protected String traceObtainedAuthInfoFromHandler$str() {
        return traceObtainedAuthInfoFromHandler;
    }
    @Override
    public final void traceJSSEDomainGetKey(final String alias) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceJSSEDomainGetKey$str(), alias);
    }
    private static final String traceJSSEDomainGetKey = "PBOX00352: JSSE domain got request for key with alias %s";
    protected String traceJSSEDomainGetKey$str() {
        return traceJSSEDomainGetKey;
    }
    @Override
    public final void traceJSSEDomainGetCertificate(final String alias) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceJSSEDomainGetCertificate$str(), alias);
    }
    private static final String traceJSSEDomainGetCertificate = "PBOX00353: JSSE domain got request for certificate with alias %s";
    protected String traceJSSEDomainGetCertificate$str() {
        return traceJSSEDomainGetCertificate;
    }
    @Override
    public final void traceSecRolesAssociationSetSecurityRoles(final Map<String, Set<String>> roles) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceSecRolesAssociationSetSecurityRoles$str(), roles);
    }
    private static final String traceSecRolesAssociationSetSecurityRoles = "PBOX00354: Setting security roles ThreadLocal: %s";
    protected String traceSecRolesAssociationSetSecurityRoles$str() {
        return traceSecRolesAssociationSetSecurityRoles;
    }
    @Override
    public final void traceBeginExecPasswordCmd(final String passwordCmd) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginExecPasswordCmd$str(), passwordCmd);
    }
    private static final String traceBeginExecPasswordCmd = "PBOX00355: Begin execPasswordCmd, command: %s";
    protected String traceBeginExecPasswordCmd$str() {
        return traceBeginExecPasswordCmd;
    }
    @Override
    public final void traceEndExecPasswordCmd(final int exitCode) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceEndExecPasswordCmd$str(), exitCode);
    }
    private static final String traceEndExecPasswordCmd = "PBOX00356: End execPasswordCmd, exit code: %s";
    protected String traceEndExecPasswordCmd$str() {
        return traceEndExecPasswordCmd;
    }
    @Override
    public final void traceBeginGetIdentity(final String username) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginGetIdentity$str(), username);
    }
    private static final String traceBeginGetIdentity = "PBOX00357: Begin getIdentity, username: %s";
    protected String traceBeginGetIdentity$str() {
        return traceBeginGetIdentity;
    }
    @Override
    public final void traceBeginGetRoleSets() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceBeginGetRoleSets$str());
    }
    private static final String traceBeginGetRoleSets = "PBOX00358: Begin getRoleSets";
    protected String traceBeginGetRoleSets$str() {
        return traceBeginGetRoleSets;
    }
    @Override
    public final void traceCurrentCallingPrincipal(final String username, final String threadName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceCurrentCallingPrincipal$str(), username, threadName);
    }
    private static final String traceCurrentCallingPrincipal = "PBOX00359: Current calling principal: %s, thread name: %s";
    protected String traceCurrentCallingPrincipal$str() {
        return traceCurrentCallingPrincipal;
    }
    @Override
    public final void warnModuleCreationWithEmptyPassword() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, warnModuleCreationWithEmptyPassword$str());
    }
    private static final String warnModuleCreationWithEmptyPassword = "PBOX00360: Creating login module with empty password";
    protected String warnModuleCreationWithEmptyPassword$str() {
        return warnModuleCreationWithEmptyPassword;
    }
    @Override
    public final void infoVaultInitialized() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.INFO, null, infoVaultInitialized$str());
    }
    private static final String infoVaultInitialized = "PBOX00361: Default Security Vault Implementation Initialized and Ready";
    protected String infoVaultInitialized$str() {
        return infoVaultInitialized;
    }
    @Override
    public final void errorCannotGetMD5AlgorithmInstance() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, errorCannotGetMD5AlgorithmInstance$str());
    }
    private static final String errorCannotGetMD5AlgorithmInstance = "PBOX00362: Cannot get MD5 algorithm instance for hashing password commands. Using NULL.";
    protected String errorCannotGetMD5AlgorithmInstance$str() {
        return errorCannotGetMD5AlgorithmInstance;
    }
    @Override
    public final void traceRetrievingPasswordFromCache(final String newKey) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceRetrievingPasswordFromCache$str(), newKey);
    }
    private static final String traceRetrievingPasswordFromCache = "PBOX00363: Retrieving password from the cache for key: %s";
    protected String traceRetrievingPasswordFromCache$str() {
        return traceRetrievingPasswordFromCache;
    }
    @Override
    public final void traceStoringPasswordToCache(final String newKey) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceStoringPasswordToCache$str(), newKey);
    }
    private static final String traceStoringPasswordToCache = "PBOX00364: Storing password to the cache for key: %s";
    protected String traceStoringPasswordToCache$str() {
        return traceStoringPasswordToCache;
    }
    @Override
    public final void traceResettingCache() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceResettingCache$str());
    }
    private static final String traceResettingCache = "PBOX00365: Resetting cache";
    protected String traceResettingCache$str() {
        return traceResettingCache;
    }
    @Override
    public final void errorParsingTimeoutNumber() {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, errorParsingTimeoutNumber$str());
    }
    private static final String errorParsingTimeoutNumber = "PBOX00366: Error parsing time out number.";
    protected String errorParsingTimeoutNumber$str() {
        return errorParsingTimeoutNumber;
    }
    @Override
    public final void securityVaultContentVersion(final String dataVersion, final String targetVersion) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.DEBUG, null, securityVaultContentVersion$str(), dataVersion, targetVersion);
    }
    private static final String securityVaultContentVersion = "PBOX00367: Reading security vault data version %s target version is %s";
    protected String securityVaultContentVersion$str() {
        return securityVaultContentVersion;
    }
    @Override
    public final void mixedVaultDataFound(final String vaultDatFile, final String encDatFile, final String encDatFile2) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, null, mixedVaultDataFound$str(), vaultDatFile, encDatFile, encDatFile2);
    }
    private static final String mixedVaultDataFound = "PBOX00368: Security Vault contains both covnerted (%s) and pre-conversion data (%s). Try to delete %s file and start over again.";
    protected String mixedVaultDataFound$str() {
        return mixedVaultDataFound;
    }
    @Override
    public final void ambiguosKeyForSecurityVaultTransformation(final String delimiter, final String vaultBlock, final String attributeName) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.INFO, null, ambiguosKeyForSecurityVaultTransformation$str(), delimiter, vaultBlock, attributeName);
    }
    private static final String ambiguosKeyForSecurityVaultTransformation = "PBOX00369: Ambiguos vault block and attribute name stored in original security vault. Delimiter (%s) is part of vault block or attribute name. Took the first delimiter. Result vault block (%s) attribute name (%s). Modify security vault manually.";
    protected String ambiguosKeyForSecurityVaultTransformation$str() {
        return ambiguosKeyForSecurityVaultTransformation;
    }
    @Override
    public final void cannotDeleteOriginalVaultFile(final String file) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, cannotDeleteOriginalVaultFile$str(), file);
    }
    private static final String cannotDeleteOriginalVaultFile = "PBOX00370: Cannot delete original security vault file (%s). Delete the file manually before next start, please.";
    protected String cannotDeleteOriginalVaultFile$str() {
        return cannotDeleteOriginalVaultFile;
    }
    @Override
    public final void vaultDoesnotContainSecretKey(final String alias) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.INFO, null, vaultDoesnotContainSecretKey$str(), alias);
    }
    private static final String vaultDoesnotContainSecretKey = "PBOX00371: Security Vault does not contain SecretKey entry under alias (%s)";
    protected String vaultDoesnotContainSecretKey$str() {
        return vaultDoesnotContainSecretKey;
    }
    @Override
    public final void keyStoreConvertedToJCEKS(final String keyStoreFile) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.INFO, null, keyStoreConvertedToJCEKS$str(), keyStoreFile);
    }
    private static final String keyStoreConvertedToJCEKS = "PBOX00372: Security Vault key store successfuly converted to JCEKS type (%s). From now on use JCEKS as KEYSTORE_TYPE in Security Vault configuration.";
    protected String keyStoreConvertedToJCEKS$str() {
        return keyStoreConvertedToJCEKS;
    }
    @Override
    public final void errorGettingServerAuthConfig(final String layer, final String appContext, final Throwable cause) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, cause, errorGettingServerAuthConfig$str(), layer, appContext);
    }
    private static final String errorGettingServerAuthConfig = "PBOX00373: Error getting ServerAuthConfig for layer %s and appContext %s";
    protected String errorGettingServerAuthConfig$str() {
        return errorGettingServerAuthConfig;
    }
    @Override
    public final void errorGettingServerAuthContext(final String authContextId, final String securityDomain, final Throwable cause) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, cause, errorGettingServerAuthContext$str(), authContextId, securityDomain);
    }
    private static final String errorGettingServerAuthContext = "PBOX00374: Error getting ServerAuthContext for authContextId %s and security domain %s";
    protected String errorGettingServerAuthContext$str() {
        return errorGettingServerAuthContext;
    }
    @Override
    public final void errorGettingModuleInformation(final Throwable cause) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.ERROR, cause, errorGettingModuleInformation$str());
    }
    private static final String errorGettingModuleInformation = "PBOX00375: Error getting the module classloader informations for cache";
    protected String errorGettingModuleInformation$str() {
        return errorGettingModuleInformation;
    }
    @Override
    public final void wrongBase64StringUsed(final String fixedBase64) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, wrongBase64StringUsed$str(), fixedBase64);
    }
    private static final String wrongBase64StringUsed = "PBOX00376: Wrong Base64 string used with masked password utility. Following is correct (%s)";
    protected String wrongBase64StringUsed$str() {
        return wrongBase64StringUsed;
    }
    @Override
    public final void traceLogoutSubject(final String loginContext, final String subject) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.TRACE, null, traceLogoutSubject$str(), loginContext, subject);
    }
    private static final String traceLogoutSubject = "PBOX00377: JAAS logout, login context: %s, subject: %s";
    protected String traceLogoutSubject$str() {
        return traceLogoutSubject;
    }
    @Override
    public final void warnProblemClosingOriginalLdapContextDuringRebind(final NamingException e) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, e, warnProblemClosingOriginalLdapContextDuringRebind$str());
    }
    private static final String warnProblemClosingOriginalLdapContextDuringRebind = "PBOX00378: Problem when closing original LDAP context during role search rebind. Trying to create new LDAP context.";
    protected String warnProblemClosingOriginalLdapContextDuringRebind$str() {
        return warnProblemClosingOriginalLdapContextDuringRebind;
    }
}
