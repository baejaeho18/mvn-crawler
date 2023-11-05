/*
 * An XML document type.
 * Localname: ProducerReference
 * Namespace: http://ws.apache.org/notification/base/service/SubscriptionManager
 * Java type: org.apache.ws.notification.base.service.subscriptionManager.ProducerReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ws.notification.base.service.subscriptionManager.impl;
/**
 * A document containing one ProducerReference(@http://ws.apache.org/notification/base/service/SubscriptionManager) element.
 *
 * This is a complex type.
 */
public class ProducerReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ws.notification.base.service.subscriptionManager.ProducerReferenceDocument
{
    
    public ProducerReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCERREFERENCE$0 = 
        new javax.xml.namespace.QName("http://ws.apache.org/notification/base/service/SubscriptionManager", "ProducerReference");
    
    
    /**
     * Gets the "ProducerReference" element
     */
    public org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType getProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType target = null;
            target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$0, 0);
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
            target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$0);
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
            target = (org.xmlsoap.schemas.ws.x2003.x03.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$0);
            return target;
        }
    }
}
