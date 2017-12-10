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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.choice.ReportItemStatus1Choice;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * SCOPE<br>
 * <br>
 * An account owner, such as a custodian, central securities depository,
 * international securities depository or transfer agent, sends the
 * SecuritiesBalanceTransparencyReportStatusAdvice message in response to a
 * SecuritiesBalanceTransparencyReport, to accept or reject the statement of
 * holdings as sent in a SecuritiesBalanceTransparencyReport.<br>
 * <br>
 * USAGE<br>
 * The SecuritiesBalanceTransparencyReportStatusAdvice is used to accept
 * (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a
 * previously received SecuritiesBalanceTransparencyReport.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSenderIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmReceiverIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmRelatedStatement
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmStatus
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmNumberOfItemsPerStatus
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSupplementaryData
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalTrnsprncyRptStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.042.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTransparencyReportStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\n\r\nAn account owner, such as a custodian, central securities depository, international securities depository or transfer agent, sends the SecuritiesBalanceTransparencyReportStatusAdvice message in response to a SecuritiesBalanceTransparencyReport, to accept or reject the statement of holdings as sent in a SecuritiesBalanceTransparencyReport.\r\n\r\nUSAGE\r\nThe SecuritiesBalanceTransparencyReportStatusAdvice is used to accept (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a previously received SecuritiesBalanceTransparencyReport."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesBalanceTransparencyReportStatusAdviceV01", propOrder = {"messageIdentification", "senderIdentification", "receiverIdentification", "relatedStatement", "status", "numberOfItemsPerStatus", "supplementaryData"})
public class SecuritiesBalanceTransparencyReportStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Unique and unambiguous identification of the status advice message.
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
	 * "Unique and unambiguous identification of the status advice message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identification of the status advice message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification100 senderIdentification;
	/**
	 * Identification of the party that is the sender of the status advice
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the sender of the status advice message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSenderIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderIdentification";
			definition = "Identification of the party that is the sender of the status advice message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getSenderIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification100 receiverIdentification;
	/**
	 * Identification of the party that is the receiver of the status advice
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the receiver of the status advice message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceiverIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIdentification";
			definition = "Identification of the party that is the receiver of the status advice message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getReceiverIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatementReference1 relatedStatement;
	/**
	 * Reference of the statement for which the status advice has been issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementReference1
	 * StatementReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the statement for which the status advice has been issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedStatement = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStatement";
			definition = "Reference of the statement for which the status advice has been issued.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementReference1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getRelatedStatement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReportItemStatus1Choice status;
	/**
	 * Status of the referenced statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice
	 * ReportItemStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the referenced statement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the referenced statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportItemStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<NumberOfItemsPerStatus1> numberOfItemsPerStatus;
	/**
	 * Number of items for each identical transaction status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
	 * NumberOfItemsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfItmsPerSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfItemsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of items for each identical transaction status."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNumberOfItemsPerStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "NbOfItmsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfItemsPerStatus";
			definition = "Number of items for each identical transaction status.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> NumberOfItemsPerStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getNumberOfItemsPerStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTransparencyReportStatusAdviceV01";
				definition = "SCOPE\r\n\r\nAn account owner, such as a custodian, central securities depository, international securities depository or transfer agent, sends the SecuritiesBalanceTransparencyReportStatusAdvice message in response to a SecuritiesBalanceTransparencyReport, to accept or reject the statement of holdings as sent in a SecuritiesBalanceTransparencyReport.\r\n\r\nUSAGE\r\nThe SecuritiesBalanceTransparencyReportStatusAdvice is used to accept (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a previously received SecuritiesBalanceTransparencyReport.";
				rootElement = "Document";
				xmlTag = "SctiesBalTrnsprncyRptStsAdvc";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement, com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmStatus,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "042";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class;
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

	@XmlElement(name = "SndrId", required = true)
	public PartyIdentification100 getSenderIdentification() {
		return senderIdentification;
	}

	public void setSenderIdentification(PartyIdentification100 senderIdentification) {
		this.senderIdentification = senderIdentification;
	}

	@XmlElement(name = "RcvrId")
	public PartyIdentification100 getReceiverIdentification() {
		return receiverIdentification;
	}

	public void setReceiverIdentification(PartyIdentification100 receiverIdentification) {
		this.receiverIdentification = receiverIdentification;
	}

	@XmlElement(name = "RltdStmt", required = true)
	public StatementReference1 getRelatedStatement() {
		return relatedStatement;
	}

	public void setRelatedStatement(StatementReference1 relatedStatement) {
		this.relatedStatement = relatedStatement;
	}

	@XmlElement(name = "Sts", required = true)
	public ReportItemStatus1Choice getStatus() {
		return status;
	}

	public void setStatus(ReportItemStatus1Choice status) {
		this.status = status;
	}

	@XmlElement(name = "NbOfItmsPerSts")
	public List<NumberOfItemsPerStatus1> getNumberOfItemsPerStatus() {
		return numberOfItemsPerStatus;
	}

	public void setNumberOfItemsPerStatus(List<NumberOfItemsPerStatus1> numberOfItemsPerStatus) {
		this.numberOfItemsPerStatus = numberOfItemsPerStatus;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.042.01.01")
	static public class Document {
		@XmlElement(name = "SctiesBalTrnsprncyRptStsAdvc", required = true)
		public SecuritiesBalanceTransparencyReportStatusAdviceV01 messageBody;
	}
}