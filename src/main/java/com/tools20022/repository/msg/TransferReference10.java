/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference of a transfer and of a transfer confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmMasterReference
 * TransferReference10.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmTransferReference
 * TransferReference10.mmTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmClientReference
 * TransferReference10.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmTransferConfirmationReference
 * TransferReference10.mmTransferConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferReference10#mmCounterpartyReference
 * TransferReference10.mmCounterpartyReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferReference10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reference of a transfer and of a transfer confirmation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransferReference10", propOrder = {"masterReference", "transferReference", "clientReference", "transferConfirmationReference", "counterpartyReference"})
public class TransferReference10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual transfers as
	 * assigned by the instructing party. This identifier links the individual
	 * transfers together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> TransferReference10.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferReference;
	/**
	 * Unique and unambiguous identifier for a transfer instruction, as assigned
	 * by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> TransferReference10.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference7 clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the transfer as assigned by the underlying client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> TransferReference10.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	protected Max35Text transferConfirmationReference;
	/**
	 * Unique and unambiguous identifier for a transfer execution, as assigned
	 * by a confirming party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransferReference10.mmObject();
			isDerived = false;
			xmlTag = "TrfConfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationReference";
			definition = "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference7 counterpartyReference;
	/**
	 * Unambiguous identification of the transfer allocated by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferReference10
	 * TransferReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransferReference10.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransferReference10.mmMasterReference, TransferReference10.mmTransferReference, TransferReference10.mmClientReference, TransferReference10.mmTransferConfirmationReference,
						TransferReference10.mmCounterpartyReference);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferReference10";
				definition = "Reference of a transfer and of a transfer confirmation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MstrRef")
	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "TrfRef")
	public Max35Text getTransferReference() {
		return transferReference;
	}

	public void setTransferReference(Max35Text transferReference) {
		this.transferReference = transferReference;
	}

	@XmlElement(name = "ClntRef")
	public AdditionalReference7 getClientReference() {
		return clientReference;
	}

	public void setClientReference(com.tools20022.repository.msg.AdditionalReference7 clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "TrfConfRef")
	public Max35Text getTransferConfirmationReference() {
		return transferConfirmationReference;
	}

	public void setTransferConfirmationReference(Max35Text transferConfirmationReference) {
		this.transferConfirmationReference = transferConfirmationReference;
	}

	@XmlElement(name = "CtrPtyRef")
	public AdditionalReference7 getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference7 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}
}