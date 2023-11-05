/*
 * An XML document type.
 * Localname: SubscriptionManagerRP
 * Namespace: http://ws.apache.org/notification/base/service/SubscriptionManager
 * Java type: org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ws.notification.base.service.subscriptionManager.impl;
/**
 * A document containing one SubscriptionManagerRP(@http://ws.apache.org/notification/base/service/SubscriptionManager) element.
 *
 * This is a complex type.
 */
public class SubscriptionManagerRPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument
{
    
    public SubscriptionManagerRPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONMANAGERRP$0 = 
        new javax.xml.namespace.QName("http://ws.apache.org/notification/base/service/SubscriptionManager", "SubscriptionManagerRP");
    
    
    /**
     * Gets the "SubscriptionManagerRP" element
     */
    public org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP getSubscriptionManagerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().find_element_user(SUBSCRIPTIONMANAGERRP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionManagerRP" element
     */
    public void setSubscriptionManagerRP(org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP subscriptionManagerRP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().find_element_user(SUBSCRIPTIONMANAGERRP$0, 0);
            if (target == null)
            {
                target = (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().add_element_user(SUBSCRIPTIONMANAGERRP$0);
            }
            target.set(subscriptionManagerRP);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionManagerRP" element
     */
    public org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP addNewSubscriptionManagerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().add_element_user(SUBSCRIPTIONMANAGERRP$0);
            return target;
        }
    }
    /**
     * An XML SubscriptionManagerRP(@http://ws.apache.org/notification/base/service/SubscriptionManager).
     *
     * This is a complex type.
     */
    public static class SubscriptionManagerRPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ws.notification.base.service.subscriptionManager.SubscriptionManagerRPDocument.SubscriptionManagerRP
    {
        
        public SubscriptionManagerRPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURRENTTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", "CurrentTime");
        private static final javax.xml.namespace.QName TERMINATIONTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-ResourceLifetime-1.2-draft-01.xsd", "TerminationTime");
        private static final javax.xml.namespace.QName CONSUMERREFERENCE$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "ConsumerReference");
        private static final javax.xml.namespace.QName TOPICEXPRESSION$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "TopicExpression");
        private static final javax.xml.namespace.QName USENOTIFY$8 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "UseNotify");
        private static final javax.xml.namespace.QName PRECONDITION$10 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "Precondition");
        private static final javax.xml.namespace.QName SELECTOR$12 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "Selector");
        private static final javax.xml.namespace.QName SUBSCRIPTIONPOLICY$14 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "SubscriptionPolicy");
        private static final javax.xml.namespace.QName CREATIONTIME$16 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/2004/06/wsn-WS-BaseNotification-1.2-draft-01.xsd", "CreationTime");
        private static final javax.xml.namespace.QName PRODUCERREFERENCE$18 = 
            new javax.xml.namespace.QName("http://ws.apache.org/notification/base/service/SubscriptionManager", "ProducerReference");
        
        
        /**
         * Gets the "CurrentTime" element
         */
        public java.util.Calendar getCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentTime" element
         */
        public void setCurrentTime(java.util.Calendar currentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTIME$0);
                }
                target.setCalendarValue(currentTime);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentTime" element
         */
        public void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CURRENTTIME$0);
                }
                target.set(currentTime);
            }
        }
        
        /**
         * Gets the "TerminationTime" element
         */
        public java.util.Calendar getTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TerminationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "TerminationTime" element
         */
        public boolean isNilTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "TerminationTime" element
         */
        public void setTerminationTime(java.util.Calendar terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMINATIONTIME$2);
                }
                target.setCalendarValue(terminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "TerminationTime" element
         */
        public void xsetTerminationTime(org.apache.xmlbeans.XmlDateTime terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$2);
                }
                target.set(terminationTime);
            }
        }
        
        /**
         * Nils the "TerminationTime" element
         */
        public void setNilTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "ConsumerReference" element
         */
        public org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType getConsumerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ConsumerReference" element
         */
        public void setConsumerReference(org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType consumerReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$4, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$4);
                }
                target.set(consumerReference);
            }
        }
        
        /**
         * Appends and returns a new empty "ConsumerReference" element
         */
        public org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType addNewConsumerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$4);
                return target;
            }
        }
        
        /**
         * Gets the "TopicExpression" element
         */
        public org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType getTopicExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "TopicExpression" element
         */
        public void setTopicExpression(org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType topicExpression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$6, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType)get_store().add_element_user(TOPICEXPRESSION$6);
                }
                target.set(topicExpression);
            }
        }
        
        /**
         * Appends and returns a new empty "TopicExpression" element
         */
        public org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType addNewTopicExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.x2004.x06.wsnWSBaseNotification12Draft01.TopicExpressionType)get_store().add_element_user(TOPICEXPRESSION$6);
                return target;
            }
        }
        
        /**
         * Gets the "UseNotify" element
         */
        public boolean getUseNotify()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USENOTIFY$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "UseNotify" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetUseNotify()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USENOTIFY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UseNotify" element
         */
        public void setUseNotify(boolean useNotify)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USENOTIFY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USENOTIFY$8);
                }
                target.setBooleanValue(useNotify);
            }
        }
        
        /**
         * Sets (as xml) the "UseNotify" element
         */
        public void xsetUseNotify(org.apache.xmlbeans.XmlBoolean useNotify)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USENOTIFY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(USENOTIFY$8);
                }
                target.set(useNotify);
            }
        }
        
        /**
         * Gets the "Precondition" element
         */
        public org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType getPrecondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().find_element_user(PRECONDITION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Precondition" element
         */
        public boolean isSetPrecondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRECONDITION$10) != 0;
            }
        }
        
        /**
         * Sets the "Precondition" element
         */
        public void setPrecondition(org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType precondition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().find_element_user(PRECONDITION$10, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().add_element_user(PRECONDITION$10);
                }
                target.set(precondition);
            }
        }
        
        /**
         * Appends and returns a new empty "Precondition" element
         */
        public org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType addNewPrecondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().add_element_user(PRECONDITION$10);
                return target;
            }
        }
        
        /**
         * Unsets the "Precondition" element
         */
        public void unsetPrecondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRECONDITION$10, 0);
            }
        }
        
        /**
         * Gets the "Selector" element
         */
        public org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType getSelector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().find_element_user(SELECTOR$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Selector" element
         */
        public boolean isSetSelector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SELECTOR$12) != 0;
            }
        }
        
        /**
         * Sets the "Selector" element
         */
        public void setSelector(org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType selector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().find_element_user(SELECTOR$12, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().add_element_user(SELECTOR$12);
                }
                target.set(selector);
            }
        }
        
        /**
         * Appends and returns a new empty "Selector" element
         */
        public org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType addNewSelector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType target = null;
                target = (org.oasisOpen.docs.wsrf.x2004.x06.wsrfWSResourceProperties12Draft01.QueryExpressionType)get_store().add_element_user(SELECTOR$12);
                return target;
            }
        }
        
        /**
         * Unsets the "Selector" element
         */
        public void unsetSelector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SELECTOR$12, 0);
            }
        }
        
        /**
         * Gets the "SubscriptionPolicy" element
         */
        public org.apache.xmlbeans.XmlObject getSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SUBSCRIPTIONPOLICY$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SubscriptionPolicy" element
         */
        public boolean isSetSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSCRIPTIONPOLICY$14) != 0;
            }
        }
        
        /**
         * Sets the "SubscriptionPolicy" element
         */
        public void setSubscriptionPolicy(org.apache.xmlbeans.XmlObject subscriptionPolicy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SUBSCRIPTIONPOLICY$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SUBSCRIPTIONPOLICY$14);
                }
                target.set(subscriptionPolicy);
            }
        }
        
        /**
         * Appends and returns a new empty "SubscriptionPolicy" element
         */
        public org.apache.xmlbeans.XmlObject addNewSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SUBSCRIPTIONPOLICY$14);
                return target;
            }
        }
        
        /**
         * Unsets the "SubscriptionPolicy" element
         */
        public void unsetSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSCRIPTIONPOLICY$14, 0);
            }
        }
        
        /**
         * Gets the "CreationTime" element
         */
        public java.util.Calendar getCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "CreationTime" element
         */
        public boolean isSetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATIONTIME$16) != 0;
            }
        }
        
        /**
         * Sets the "CreationTime" element
         */
        public void setCreationTime(java.util.Calendar creationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONTIME$16);
                }
                target.setCalendarValue(creationTime);
            }
        }
        
        /**
         * Sets (as xml) the "CreationTime" element
         */
        public void xsetCreationTime(org.apache.xmlbeans.XmlDateTime creationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONTIME$16);
                }
                target.set(creationTime);
            }
        }
        
        /**
         * Unsets the "CreationTime" element
         */
        public void unsetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATIONTIME$16, 0);
            }
        }
        
        /**
         * Gets the "ProducerReference" element
         */
        public org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType getProducerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ProducerReference" element
         */
        public void setProducerReference(org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType producerReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$18, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$18);
                }
                target.set(producerReference);
            }
        }
        
        /**
         * Appends and returns a new empty "ProducerReference" element
         */
        public org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType addNewProducerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$18);
                return target;
            }
        }
    }
}
