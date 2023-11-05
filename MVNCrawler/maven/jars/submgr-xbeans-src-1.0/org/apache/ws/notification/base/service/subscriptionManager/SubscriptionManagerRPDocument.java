/*
 * An XML document type.
 * Localname: SubscriptionManagerRP
 * Namespace: http://ws.apache.org/notification/base/service/SubscriptionManager
 * Java type: org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ws.notification.base.service.subscriptionManager;


/**
 * A document containing one SubscriptionManagerRP(@http://ws.apache.org/notification/base/service/SubscriptionManager) element.
 *
 * This is a complex type.
 */
public interface SubscriptionManagerRPDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schemaorg_apache_xmlbeans.system.sA7E37A0C23D07A9E86E8F212049C70C1.TypeSystemHolder.typeSystem.resolveHandle("subscriptionmanagerrp51bcdoctype");
    
    /**
     * Gets the "SubscriptionManagerRP" element
     */
    org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP getSubscriptionManagerRP();
    
    /**
     * Sets the "SubscriptionManagerRP" element
     */
    void setSubscriptionManagerRP(org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP subscriptionManagerRP);
    
    /**
     * Appends and returns a new empty "SubscriptionManagerRP" element
     */
    org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP addNewSubscriptionManagerRP();
    
    /**
     * An XML SubscriptionManagerRP(@http://ws.apache.org/notification/base/service/SubscriptionManager).
     *
     * This is a complex type.
     */
    public interface SubscriptionManagerRP extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schemaorg_apache_xmlbeans.system.sA7E37A0C23D07A9E86E8F212049C70C1.TypeSystemHolder.typeSystem.resolveHandle("subscriptionmanagerrp0922elemtype");
        
        /**
         * Gets the "CurrentTime" element
         */
        java.util.Calendar getCurrentTime();
        
        /**
         * Gets (as xml) the "CurrentTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCurrentTime();
        
        /**
         * Sets the "CurrentTime" element
         */
        void setCurrentTime(java.util.Calendar currentTime);
        
        /**
         * Sets (as xml) the "CurrentTime" element
         */
        void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime);
        
        /**
         * Gets the "TerminationTime" element
         */
        java.util.Calendar getTerminationTime();
        
        /**
         * Gets (as xml) the "TerminationTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetTerminationTime();
        
        /**
         * Tests for nil "TerminationTime" element
         */
        boolean isNilTerminationTime();
        
        /**
         * Sets the "TerminationTime" element
         */
        void setTerminationTime(java.util.Calendar terminationTime);
        
        /**
         * Sets (as xml) the "TerminationTime" element
         */
        void xsetTerminationTime(org.apache.xmlbeans.XmlDateTime terminationTime);
        
        /**
         * Nils the "TerminationTime" element
         */
        void setNilTerminationTime();
        
        /**
         * Gets the "ConsumerReference" element
         */
        org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType getConsumerReference();
        
        /**
         * Sets the "ConsumerReference" element
         */
        void setConsumerReference(org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType consumerReference);
        
        /**
         * Appends and returns a new empty "ConsumerReference" element
         */
        org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType addNewConsumerReference();
        
        /**
         * Gets the "TopicExpression" element
         */
        org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType getTopicExpression();
        
        /**
         * Sets the "TopicExpression" element
         */
        void setTopicExpression(org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType topicExpression);
        
        /**
         * Appends and returns a new empty "TopicExpression" element
         */
        org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType addNewTopicExpression();
        
        /**
         * Gets the "UseNotify" element
         */
        boolean getUseNotify();
        
        /**
         * Gets (as xml) the "UseNotify" element
         */
        org.apache.xmlbeans.XmlBoolean xgetUseNotify();
        
        /**
         * Sets the "UseNotify" element
         */
        void setUseNotify(boolean useNotify);
        
        /**
         * Sets (as xml) the "UseNotify" element
         */
        void xsetUseNotify(org.apache.xmlbeans.XmlBoolean useNotify);
        
        /**
         * Gets the "Precondition" element
         */
        org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType getPrecondition();
        
        /**
         * True if has "Precondition" element
         */
        boolean isSetPrecondition();
        
        /**
         * Sets the "Precondition" element
         */
        void setPrecondition(org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType precondition);
        
        /**
         * Appends and returns a new empty "Precondition" element
         */
        org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType addNewPrecondition();
        
        /**
         * Unsets the "Precondition" element
         */
        void unsetPrecondition();
        
        /**
         * Gets the "Selector" element
         */
        org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType getSelector();
        
        /**
         * True if has "Selector" element
         */
        boolean isSetSelector();
        
        /**
         * Sets the "Selector" element
         */
        void setSelector(org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType selector);
        
        /**
         * Appends and returns a new empty "Selector" element
         */
        org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType addNewSelector();
        
        /**
         * Unsets the "Selector" element
         */
        void unsetSelector();
        
        /**
         * Gets the "SubscriptionPolicy" element
         */
        org.apache.xmlbeans.XmlObject getSubscriptionPolicy();
        
        /**
         * True if has "SubscriptionPolicy" element
         */
        boolean isSetSubscriptionPolicy();
        
        /**
         * Sets the "SubscriptionPolicy" element
         */
        void setSubscriptionPolicy(org.apache.xmlbeans.XmlObject subscriptionPolicy);
        
        /**
         * Appends and returns a new empty "SubscriptionPolicy" element
         */
        org.apache.xmlbeans.XmlObject addNewSubscriptionPolicy();
        
        /**
         * Unsets the "SubscriptionPolicy" element
         */
        void unsetSubscriptionPolicy();
        
        /**
         * Gets the "CreationTime" element
         */
        java.util.Calendar getCreationTime();
        
        /**
         * Gets (as xml) the "CreationTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCreationTime();
        
        /**
         * True if has "CreationTime" element
         */
        boolean isSetCreationTime();
        
        /**
         * Sets the "CreationTime" element
         */
        void setCreationTime(java.util.Calendar creationTime);
        
        /**
         * Sets (as xml) the "CreationTime" element
         */
        void xsetCreationTime(org.apache.xmlbeans.XmlDateTime creationTime);
        
        /**
         * Unsets the "CreationTime" element
         */
        void unsetCreationTime();
        
        /**
         * Gets the "ProducerReference" element
         */
        org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType getProducerReference();
        
        /**
         * Sets the "ProducerReference" element
         */
        void setProducerReference(org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType producerReference);
        
        /**
         * Appends and returns a new empty "ProducerReference" element
         */
        org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType addNewProducerReference();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP newInstance() {
              return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument newInstance() {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
