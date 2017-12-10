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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information provided when the message is a copy of a previous message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation4#mmCopyIndicator
 * CopyInformation4.mmCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CopyInformation4#mmOriginalReceiver
 * CopyInformation4.mmOriginalReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07#mmCopyDetails
 * ReversalOfTransferOutConfirmationV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07#mmCopyDetails
 * TransferOutCancellationRequestV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmCopyDetails
 * TransferInConfirmationV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmCopyDetails
 * TransferOutConfirmationV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmCopyDetails
 * TransferInCancellationRequestV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmCopyDetails
 * TransferOutInstructionV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmCopyDetails
 * TransferInInstructionV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07#mmCopyDetails
 * ReversalOfTransferInConfirmationV07.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmCopyDetails
 * SubscriptionBulkOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmCopyDetails
 * RedemptionBulkOrderV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#mmCopyDetails
 * SubscriptionBulkOrderCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmCopyDetails
 * RedemptionOrderV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmCopyDetails
 * SubscriptionOrderCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmCopyDetails
 * RedemptionBulkOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#mmCopyDetails
 * RedemptionBulkOrderCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmCopyDetails
 * SwitchOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmCopyDetails
 * SubscriptionOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * SubscriptionOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#mmCopyDetails
 * SwitchOrderCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmCopyDetails
 * SwitchOrderV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * RedemptionOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmCopyDetails
 * RedemptionOrderConfirmationV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#mmCopyDetails
 * RedemptionOrderCancellationRequestV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmCopyDetails
 * SubscriptionBulkOrderV04.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmCopyDetails
 * SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmCopyDetails
 * SubscriptionOrderV04.mmCopyDetails}</li>
 * </ul>
 * </li>
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
 * "CopyInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information provided when the message is a copy of a previous message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CopyInformation4", propOrder = {"copyIndicator", "originalReceiver"})
public class CopyInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator copyIndicator;
	/**
	 * Indicates whether the message is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the message is a copy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation4.mmObject();
			isDerived = false;
			xmlTag = "CpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyIndicator";
			definition = "Indicates whether the message is a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected AnyBICIdentifier originalReceiver;
	/**
	 * Original receiver of the message, if this message is a copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlRcvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalReceiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original receiver of the message, if this message is a copy."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalReceiver = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CopyInformation4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlRcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalReceiver";
			definition = "Original receiver of the message, if this message is a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CopyInformation4.mmCopyIndicator, CopyInformation4.mmOriginalReceiver);
				messageBuildingBlock_lazy = () -> Arrays.asList(ReversalOfTransferOutConfirmationV07.mmCopyDetails, TransferOutCancellationRequestV07.mmCopyDetails, TransferInConfirmationV07.mmCopyDetails,
						TransferOutConfirmationV07.mmCopyDetails, TransferInCancellationRequestV07.mmCopyDetails, TransferOutInstructionV07.mmCopyDetails, TransferInInstructionV07.mmCopyDetails,
						ReversalOfTransferInConfirmationV07.mmCopyDetails, SubscriptionBulkOrderConfirmationV04.mmCopyDetails, RedemptionBulkOrderV04.mmCopyDetails, SubscriptionBulkOrderCancellationRequestV04.mmCopyDetails,
						RedemptionOrderV04.mmCopyDetails, SubscriptionOrderCancellationRequestV04.mmCopyDetails, RedemptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails, RedemptionBulkOrderConfirmationV04.mmCopyDetails,
						RedemptionBulkOrderCancellationRequestV04.mmCopyDetails, SwitchOrderConfirmationV04.mmCopyDetails, SubscriptionOrderConfirmationV04.mmCopyDetails,
						SubscriptionOrderConfirmationCancellationInstructionV02.mmCopyDetails, SwitchOrderCancellationRequestV04.mmCopyDetails, SwitchOrderV04.mmCopyDetails,
						RedemptionOrderConfirmationCancellationInstructionV02.mmCopyDetails, RedemptionOrderConfirmationV04.mmCopyDetails, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmCopyDetails,
						RedemptionOrderCancellationRequestV04.mmCopyDetails, SubscriptionBulkOrderV04.mmCopyDetails, SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails, SubscriptionOrderV04.mmCopyDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CopyInformation4";
				definition = "Information provided when the message is a copy of a previous message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CpyInd", required = true)
	public YesNoIndicator getCopyIndicator() {
		return copyIndicator;
	}

	public void setCopyIndicator(YesNoIndicator copyIndicator) {
		this.copyIndicator = copyIndicator;
	}

	@XmlElement(name = "OrgnlRcvr")
	public AnyBICIdentifier getOriginalReceiver() {
		return originalReceiver;
	}

	public void setOriginalReceiver(AnyBICIdentifier originalReceiver) {
		this.originalReceiver = originalReceiver;
	}
}