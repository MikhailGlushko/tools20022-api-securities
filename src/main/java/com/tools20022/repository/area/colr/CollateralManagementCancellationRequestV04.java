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

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.choice.Reference2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.CollateralCancellationReason1;
import com.tools20022.repository.msg.Obligation4;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CollateralManagementCancellationRequest message is sent by:<br>
 * - the collateral taker or its collateral manager to the collateral giver or
 * its collateral manager,<br>
 * - the collateral giver or its collateral manager to the collateral taker or
 * its collateral manager<br>
 * This message is used to request the cancellation of a previously sent
 * MarginCallRequest message, MarginCallResponse message, CollateralProposal
 * message, CollateralProposalResponse message, MarginCallDisputeNotification
 * message or a CollateralSubstitutionRequest message.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CollateralManagementCancellationRequest message is used to request the
 * cancellation of a collateral message. When requesting the cancellation of a
 * message there must be a cancellation reason specified.<br>
 * When the CollateralManagementCancellationRequest message is used to cancel a
 * collateral message the reference of the original message must be specified.
 * The rejection or acceptance of a CollateralManagementCancellationRequest
 * message is made using a CollateralManagementCancellationStatus message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmTransactionIdentification
 * CollateralManagementCancellationRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmReference
 * CollateralManagementCancellationRequestV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmObligation
 * CollateralManagementCancellationRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmCancellationReason
 * CollateralManagementCancellationRequestV04.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmSupplementaryData
 * CollateralManagementCancellationRequestV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollMgmtCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.005.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralManagementCancellationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CollateralManagementCancellationRequest message is sent by:\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager,\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nThis message is used to request the cancellation of a previously sent MarginCallRequest message, MarginCallResponse message, CollateralProposal message, CollateralProposalResponse message, MarginCallDisputeNotification message or a CollateralSubstitutionRequest message.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralManagementCancellationRequest message is used to request the cancellation of a collateral message. When requesting the cancellation of a message there must be a cancellation reason specified.\r\nWhen the CollateralManagementCancellationRequest message is used to cancel a collateral message the reference of the original message must be specified. The rejection or acceptance of a CollateralManagementCancellationRequest message is made using a CollateralManagementCancellationStatus message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralManagementCancellationRequestV04", propOrder = {"transactionIdentification", "reference", "obligation", "cancellationReason", "supplementaryData"})
public class CollateralManagementCancellationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as know by the instructing
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationRequestV04.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Reference2Choice reference;
	/**
	 * Reference to the message advised to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the message advised to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message advised to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Reference2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationRequestV04.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Obligation4 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationRequestV04.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralCancellationReason1 cancellationReason;
	/**
	 * It is used to detail the reason for the cancellation of a previously sent
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationReason1
	 * CollateralCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is used to detail the reason for the cancellation of a previously sent request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "It is used to detail the reason for the cancellation of a previously sent request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CollateralCancellationReason1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationRequestV04.class.getMethod("getCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationRequestV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralManagementCancellationRequestV04";
				definition = "Scope\r\nThe CollateralManagementCancellationRequest message is sent by:\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager,\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nThis message is used to request the cancellation of a previously sent MarginCallRequest message, MarginCallResponse message, CollateralProposal message, CollateralProposalResponse message, MarginCallDisputeNotification message or a CollateralSubstitutionRequest message.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralManagementCancellationRequest message is used to request the cancellation of a collateral message. When requesting the cancellation of a message there must be a cancellation reason specified.\r\nWhen the CollateralManagementCancellationRequest message is used to cancel a collateral message the reference of the original message must be specified. The rejection or acceptance of a CollateralManagementCancellationRequest message is made using a CollateralManagementCancellationStatus message.";
				rootElement = "Document";
				xmlTag = "CollMgmtCxlReq";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.mmTransactionIdentification,
						com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.mmReference, com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.mmObligation,
						com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.mmCancellationReason, com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "005";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralManagementCancellationRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "Ref", required = true)
	public Reference2Choice getReference() {
		return reference;
	}

	public void setReference(Reference2Choice reference) {
		this.reference = reference;
	}

	@XmlElement(name = "Oblgtn", required = true)
	public Obligation4 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation4 obligation) {
		this.obligation = obligation;
	}

	@XmlElement(name = "CxlRsn", required = true)
	public CollateralCancellationReason1 getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CollateralCancellationReason1 cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.005.04.04")
	static public class Document {
		@XmlElement(name = "CollMgmtCxlReq", required = true)
		public CollateralManagementCancellationRequestV04 messageBody;
	}
}