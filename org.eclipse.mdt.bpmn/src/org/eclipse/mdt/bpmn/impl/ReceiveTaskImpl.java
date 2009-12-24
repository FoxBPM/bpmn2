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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.ReceiveTask;
import org.eclipse.mdt.bpmn.ServiceImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.ReceiveTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveTaskImpl extends TaskImpl implements ReceiveTask {
    /**
     * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected static final ServiceImplementation IMPLEMENTATION_EDEFAULT = ServiceImplementation.WEB_SERVICE;

    /**
     * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementation()
     * @generated
     * @ordered
     */
    protected ServiceImplementation implementation = IMPLEMENTATION_EDEFAULT;

    /**
     * This is true if the Implementation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean implementationESet;

    /**
     * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected static final boolean INSTANTIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiate()
     * @generated
     * @ordered
     */
    protected boolean instantiate = INSTANTIATE_EDEFAULT;

    /**
     * This is true if the Instantiate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean instantiateESet;

    /**
     * The default value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageRef()
     * @generated
     * @ordered
     */
    protected static final QName MESSAGE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageRef()
     * @generated
     * @ordered
     */
    protected QName messageRef = MESSAGE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationRef()
     * @generated
     * @ordered
     */
    protected static final QName OPERATION_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationRef()
     * @generated
     * @ordered
     */
    protected QName operationRef = OPERATION_REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReceiveTaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getReceiveTask();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation getImplementation() {
        return implementation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImplementation(ServiceImplementation newImplementation) {
        ServiceImplementation oldImplementation = implementation;
        implementation = newImplementation == null ? IMPLEMENTATION_EDEFAULT
                : newImplementation;
        boolean oldImplementationESet = implementationESet;
        implementationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RECEIVE_TASK__IMPLEMENTATION,
                    oldImplementation, implementation, !oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetImplementation() {
        ServiceImplementation oldImplementation = implementation;
        boolean oldImplementationESet = implementationESet;
        implementation = IMPLEMENTATION_EDEFAULT;
        implementationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.RECEIVE_TASK__IMPLEMENTATION,
                    oldImplementation, IMPLEMENTATION_EDEFAULT,
                    oldImplementationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetImplementation() {
        return implementationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInstantiate() {
        return instantiate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiate(boolean newInstantiate) {
        boolean oldInstantiate = instantiate;
        instantiate = newInstantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RECEIVE_TASK__INSTANTIATE, oldInstantiate,
                    instantiate, !oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetInstantiate() {
        boolean oldInstantiate = instantiate;
        boolean oldInstantiateESet = instantiateESet;
        instantiate = INSTANTIATE_EDEFAULT;
        instantiateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.RECEIVE_TASK__INSTANTIATE, oldInstantiate,
                    INSTANTIATE_EDEFAULT, oldInstantiateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetInstantiate() {
        return instantiateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getMessageRef() {
        return messageRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageRef(QName newMessageRef) {
        QName oldMessageRef = messageRef;
        messageRef = newMessageRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RECEIVE_TASK__MESSAGE_REF, oldMessageRef,
                    messageRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getOperationRef() {
        return operationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperationRef(QName newOperationRef) {
        QName oldOperationRef = operationRef;
        operationRef = newOperationRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RECEIVE_TASK__OPERATION_REF, oldOperationRef,
                    operationRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.RECEIVE_TASK__IMPLEMENTATION:
            return getImplementation();
        case BpmnPackage.RECEIVE_TASK__INSTANTIATE:
            return isInstantiate();
        case BpmnPackage.RECEIVE_TASK__MESSAGE_REF:
            return getMessageRef();
        case BpmnPackage.RECEIVE_TASK__OPERATION_REF:
            return getOperationRef();
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
        case BpmnPackage.RECEIVE_TASK__IMPLEMENTATION:
            setImplementation((ServiceImplementation) newValue);
            return;
        case BpmnPackage.RECEIVE_TASK__INSTANTIATE:
            setInstantiate((Boolean) newValue);
            return;
        case BpmnPackage.RECEIVE_TASK__MESSAGE_REF:
            setMessageRef((QName) newValue);
            return;
        case BpmnPackage.RECEIVE_TASK__OPERATION_REF:
            setOperationRef((QName) newValue);
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
        case BpmnPackage.RECEIVE_TASK__IMPLEMENTATION:
            unsetImplementation();
            return;
        case BpmnPackage.RECEIVE_TASK__INSTANTIATE:
            unsetInstantiate();
            return;
        case BpmnPackage.RECEIVE_TASK__MESSAGE_REF:
            setMessageRef(MESSAGE_REF_EDEFAULT);
            return;
        case BpmnPackage.RECEIVE_TASK__OPERATION_REF:
            setOperationRef(OPERATION_REF_EDEFAULT);
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
        case BpmnPackage.RECEIVE_TASK__IMPLEMENTATION:
            return isSetImplementation();
        case BpmnPackage.RECEIVE_TASK__INSTANTIATE:
            return isSetInstantiate();
        case BpmnPackage.RECEIVE_TASK__MESSAGE_REF:
            return MESSAGE_REF_EDEFAULT == null ? messageRef != null
                    : !MESSAGE_REF_EDEFAULT.equals(messageRef);
        case BpmnPackage.RECEIVE_TASK__OPERATION_REF:
            return OPERATION_REF_EDEFAULT == null ? operationRef != null
                    : !OPERATION_REF_EDEFAULT.equals(operationRef);
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
        result.append(" (implementation: "); //$NON-NLS-1$
        if (implementationESet)
            result.append(implementation);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", instantiate: "); //$NON-NLS-1$
        if (instantiateESet)
            result.append(instantiate);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", messageRef: "); //$NON-NLS-1$
        result.append(messageRef);
        result.append(", operationRef: "); //$NON-NLS-1$
        result.append(operationRef);
        result.append(')');
        return result.toString();
    }

} //ReceiveTaskImpl
