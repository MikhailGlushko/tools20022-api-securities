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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.Cancellation10Choice;
import com.tools20022.repository.codeset.TransferInFunction1Code;
import com.tools20022.repository.msg.CopyInformation4;
import com.tools20022.repository.msg.MarketPracticeVersion1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.References20;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, a transfer agent, sends the
 * TransferInCancellationRequest message to the executing party, for example, a
 * transfer agent, to request the cancellation of a previously sent
 * TransferInInstruction.<br>
 * <b>Usage</b><br>
 * The TransferInCancellationRequest message is used to request cancellation of
 * a previously sent TransferInInstruction.<br>
 * There are two ways to specify the transfer cancellation request. Either:<br>
 * - the transfer reference of the original transfer is quoted, or,<br>
 * - all the details of the original transfer (this includes TransferReference)
 * are quoted but this is not recommended.<br>
 * The message identification of the TransferInInstruction message in which the
 * transfer was conveyed may also be quoted in PreviousReference. It is also
 * possible to request the cancellation of a TransferInInstruction message by
 * quoting its message identification in PreviousReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmMessageIdentification
 * TransferInCancellationRequestV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmReferences
 * TransferInCancellationRequestV07.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmFunction
 * TransferInCancellationRequestV07.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmCancellation
 * TransferInCancellationRequestV07.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmMarketPracticeVersion
 * TransferInCancellationRequestV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07#mmCopyDetails
 * TransferInCancellationRequestV07.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TrfInCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.006.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInCancellationRequestV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, a transfer agent, sends the TransferInCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferInInstruction.\r\nUsage\r\nThe TransferInCancellationRequest message is used to request cancellation of a previously sent TransferInInstruction.\r\nThere are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferInInstruction message in which the transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferInInstruction message by quoting its message identification in PreviousReference."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransferInCancellationRequestV07", propOrder = {"messageIdentification", "references", "function", "cancellation", "marketPracticeVersion", "copyDetails"})
public class TransferInCancellationRequestV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<References20> references;
	/**
	 * Reference to the transaction identifier issued by the counterparty.
	 * Building block may also be used to reference a previous transaction, or
	 * tie a set of messages together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References20
	 * References20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by the counterparty. Building block may also be used to reference a previous transaction, or tie a set of messages together.";
			minOccurs = 0;
			complexType_lazy = () -> References20.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransferInFunction1Code function;
	/**
	 * Function of the transfer-in, that is, whether the message is used as a
	 * request to cancel a previously sent instruction or as a cancellation of a
	 * previously sent advice and request for information. The absence of
	 * Function indicates the message is a request to cancel a previously sent
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransferInFunction1Code
	 * TransferInFunction1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Function of the transfer-in, that is, whether the message is used as a request to cancel a previously sent instruction or as a cancellation of a previously sent advice and request for information. The absence of Function indicates the message is a request to cancel a previously sent instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFunction = new MMMessageBuildingBlock() {
		{
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Function of the transfer-in, that is, whether the message is used as a request to cancel a previously sent instruction or as a cancellation of a previously sent advice and request for information. The absence of Function indicates the message is a request to cancel a previously sent instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransferInFunction1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getFunction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Cancellation10Choice> cancellation;
	/**
	 * Choice between cancellation by reference or by transfer details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Cancellation10Choice
	 * Cancellation10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between cancellation by reference or by transfer details."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Choice between cancellation by reference or by transfer details.";
			minOccurs = 1;
			complexType_lazy = () -> Cancellation10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getCancellation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CopyInformation4 copyDetails;
	/**
	 * Information provided when the message is a copy of a previous message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation4
	 * CopyInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransferInCancellationRequestV07.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferInCancellationRequestV07";
				definition = "Scope\r\nAn instructing party, for example, a transfer agent, sends the TransferInCancellationRequest message to the executing party, for example, a transfer agent, to request the cancellation of a previously sent TransferInInstruction.\r\nUsage\r\nThe TransferInCancellationRequest message is used to request cancellation of a previously sent TransferInInstruction.\r\nThere are two ways to specify the transfer cancellation request. Either:\r\n- the transfer reference of the original transfer is quoted, or,\r\n- all the details of the original transfer (this includes TransferReference) are quoted but this is not recommended.\r\nThe message identification of the TransferInInstruction message in which the transfer was conveyed may also be quoted in PreviousReference. It is also possible to request the cancellation of a TransferInInstruction message by quoting its message identification in PreviousReference.";
				rootElement = "Document";
				xmlTag = "TrfInCxlReq";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmReferences, com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmFunction,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmCancellation, com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferInCancellationRequestV07.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "006";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferInCancellationRequestV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "Refs")
	public List<References20> getReferences() {
		return references;
	}

	public void setReferences(List<References20> references) {
		this.references = references;
	}

	@XmlElement(name = "Fctn")
	public TransferInFunction1Code getFunction() {
		return function;
	}

	public void setFunction(TransferInFunction1Code function) {
		this.function = function;
	}

	@XmlElement(name = "Cxl", required = true)
	public List<Cancellation10Choice> getCancellation() {
		return cancellation;
	}

	public void setCancellation(List<Cancellation10Choice> cancellation) {
		this.cancellation = cancellation;
	}

	@XmlElement(name = "MktPrctcVrsn")
	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	@XmlElement(name = "CpyDtls")
	public CopyInformation4 getCopyDetails() {
		return copyDetails;
	}

	public void setCopyDetails(CopyInformation4 copyDetails) {
		this.copyDetails = copyDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.006.07.07")
	static public class Document {
		@XmlElement(name = "TrfInCxlReq", required = true)
		public TransferInCancellationRequestV07 messageBody;
	}
}