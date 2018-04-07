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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountManagementStatusReportV06;
import com.tools20022.repository.area.acmt.AccountModificationInstructionV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the implementation and version.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmName
 * MarketPracticeVersion1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmDate
 * MarketPracticeVersion1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1#mmNumber
 * MarketPracticeVersion1.mmNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMarketPracticeVersion
 * AccountDetailsConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmMarketPracticeVersion
 * AccountModificationInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmMarketPracticeVersion
 * AccountOpeningInstructionV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmMarketPracticeVersion
 * AccountManagementStatusReportV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08#mmMarketPracticeVersion
 * ReversalOfTransferOutConfirmationV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmMarketPracticeVersion
 * TransferInConfirmationV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmMarketPracticeVersion
 * PortfolioTransferInstructionV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08#mmMarketPracticeVersion
 * PortfolioTransferCancellationRequestV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08#mmMarketPracticeVersion
 * TransferOutCancellationRequestV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmMarketPracticeVersion
 * TransferInInstructionV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmMarketPracticeVersion
 * PortfolioTransferConfirmationV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmMarketPracticeVersion
 * AccountHoldingInformationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmMarketPracticeVersion
 * TransferOutConfirmationV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08#mmMarketPracticeVersion
 * TransferInCancellationRequestV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmMarketPracticeVersion
 * TransferOutInstructionV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMarketPracticeVersion
 * TransferCancellationStatusReportV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmMarketPracticeVersion
 * AccountHoldingInformationRequestV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08#mmMarketPracticeVersion
 * ReversalOfTransferInConfirmationV08.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV06#mmMarketPracticeVersion
 * RequestForTransferStatusReportV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmMarketPracticeVersion
 * TransferInstructionStatusReportV06.mmMarketPracticeVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketPracticeVersion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the implementation and version."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarketPracticeVersion1", propOrder = {"name", "date", "number"})
public class MarketPracticeVersion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm", required = true)
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketPracticeVersion1, Max35Text> mmName = new MMMessageAttribute<MarketPracticeVersion1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Market practice, for example, “UKTRANSFERS”, “FINDELSLT”.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MarketPracticeVersion1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(MarketPracticeVersion1 obj, Max35Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Dt")
	protected ISOYearMonth date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month, for example, 2013-06."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketPracticeVersion1, Optional<ISOYearMonth>> mmDate = new MMMessageAttribute<MarketPracticeVersion1, Optional<ISOYearMonth>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Year and month, for example, 2013-06.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public Optional<ISOYearMonth> getValue(MarketPracticeVersion1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(MarketPracticeVersion1 obj, Optional<ISOYearMonth> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Nb")
	protected Max35Text number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the market practice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarketPracticeVersion1, Optional<Max35Text>> mmNumber = new MMMessageAttribute<MarketPracticeVersion1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MarketPracticeVersion1.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Version of the market practice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MarketPracticeVersion1 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(MarketPracticeVersion1 obj, Optional<Max35Text> value) {
			obj.setNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarketPracticeVersion1.mmName, com.tools20022.repository.msg.MarketPracticeVersion1.mmDate,
						com.tools20022.repository.msg.MarketPracticeVersion1.mmNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmMarketPracticeVersion, AccountModificationInstructionV07.mmMarketPracticeVersion, AccountOpeningInstructionV07.mmMarketPracticeVersion,
						AccountManagementStatusReportV06.mmMarketPracticeVersion, ReversalOfTransferOutConfirmationV08.mmMarketPracticeVersion, TransferInConfirmationV08.mmMarketPracticeVersion,
						PortfolioTransferInstructionV08.mmMarketPracticeVersion, PortfolioTransferCancellationRequestV08.mmMarketPracticeVersion, TransferOutCancellationRequestV08.mmMarketPracticeVersion,
						TransferInInstructionV08.mmMarketPracticeVersion, PortfolioTransferConfirmationV08.mmMarketPracticeVersion, AccountHoldingInformationV06.mmMarketPracticeVersion, TransferOutConfirmationV08.mmMarketPracticeVersion,
						TransferInCancellationRequestV08.mmMarketPracticeVersion, TransferOutInstructionV08.mmMarketPracticeVersion, TransferCancellationStatusReportV06.mmMarketPracticeVersion,
						AccountHoldingInformationRequestV05.mmMarketPracticeVersion, ReversalOfTransferInConfirmationV08.mmMarketPracticeVersion, RequestForTransferStatusReportV06.mmMarketPracticeVersion,
						TransferInstructionStatusReportV06.mmMarketPracticeVersion);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketPracticeVersion1";
				definition = "Identifies the implementation and version.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getName() {
		return name;
	}

	public MarketPracticeVersion1 setName(Max35Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<ISOYearMonth> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public MarketPracticeVersion1 setDate(ISOYearMonth date) {
		this.date = date;
		return this;
	}

	public Optional<Max35Text> getNumber() {
		return number == null ? Optional.empty() : Optional.of(number);
	}

	public MarketPracticeVersion1 setNumber(Max35Text number) {
		this.number = number;
		return this;
	}
}