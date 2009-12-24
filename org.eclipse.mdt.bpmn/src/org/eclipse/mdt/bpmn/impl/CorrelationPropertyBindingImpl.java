/**
 *  Copyright (c) 2000-2009, Intalio Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Intalio Inc. - initial API and implementation
 *
 */
package org.eclipse.mdt.bpmn.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.CorrelationPropertyBinding;
import org.eclipse.mdt.bpmn.FormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyBindingImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.CorrelationPropertyBindingImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyBindingImpl extends BaseElementImpl implements
        CorrelationPropertyBinding {
    /**
     * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataPath()
     * @generated
     * @ordered
     */
    protected FormalExpression dataPath;

    /**
     * The default value of the '{@link #getCorrelationPropertyRef() <em>Correlation Property Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationPropertyRef()
     * @generated
     * @ordered
     */
    protected static final QName CORRELATION_PROPERTY_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCorrelationPropertyRef() <em>Correlation Property Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCorrelationPropertyRef()
     * @generated
     * @ordered
     */
    protected QName correlationPropertyRef = CORRELATION_PROPERTY_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CorrelationPropertyBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getCorrelationPropertyBinding();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression getDataPath() {
        return dataPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataPath(FormalExpression newDataPath,
            NotificationChain msgs) {
        FormalExpression oldDataPath = dataPath;
        dataPath = newDataPath;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this,
                    Notification.SET,
                    BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH,
                    oldDataPath, newDataPath);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataPath(FormalExpression newDataPath) {
        if (newDataPath != dataPath) {
            NotificationChain msgs = null;
            if (dataPath != null)
                msgs = ((InternalEObject) dataPath)
                        .eInverseRemove(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH,
                                null, msgs);
            if (newDataPath != null)
                msgs = ((InternalEObject) newDataPath)
                        .eInverseAdd(
                                this,
                                EOPPOSITE_FEATURE_BASE
                                        - BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH,
                                null, msgs);
            msgs = basicSetDataPath(newDataPath, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH,
                    newDataPath, newDataPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getCorrelationPropertyRef() {
        return correlationPropertyRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCorrelationPropertyRef(QName newCorrelationPropertyRef) {
        QName oldCorrelationPropertyRef = correlationPropertyRef;
        correlationPropertyRef = newCorrelationPropertyRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                    Notification.SET,
                    BpmnPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF,
                    oldCorrelationPropertyRef, correlationPropertyRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
            int featureID, NotificationChain msgs) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
            return basicSetDataPath(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
            return getDataPath();
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
            return getCorrelationPropertyRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
            setDataPath((FormalExpression) newValue);
            return;
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
            setCorrelationPropertyRef((QName) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
            setDataPath((FormalExpression) null);
            return;
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
            setCorrelationPropertyRef(CORRELATION_PROPERTY_REF_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
            return dataPath != null;
        case BpmnPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
            return CORRELATION_PROPERTY_REF_EDEFAULT == null ? correlationPropertyRef != null
                    : !CORRELATION_PROPERTY_REF_EDEFAULT
                            .equals(correlationPropertyRef);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (correlationPropertyRef: "); //$NON-NLS-1$
        result.append(correlationPropertyRef);
        result.append(')');
        return result.toString();
    }

} //CorrelationPropertyBindingImpl
