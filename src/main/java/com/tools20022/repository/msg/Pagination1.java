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
import com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07;
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV07;
import com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07;
import com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09;
import com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08;
import com.tools20022.repository.area.sese.PortfolioTransferNotificationV05;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Number used to sequence pages when it is not possible for data to be conveyed
 * in a single message and the data has to be split across several pages
 * (messages).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Pagination1#mmPageNumber
 * Pagination1.mmPageNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Pagination1#mmLastPageIndicator
 * Pagination1.mmLastPageIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV07#mmPagination
 * IntraPositionMovementPostingReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09#mmPagination
 * SecuritiesTransactionPendingReportV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07#mmPagination
 * SecuritiesSettlementTransactionAllegementReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05#mmPagination
 * PortfolioTransferNotificationV05.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08#mmPagination
 * SecuritiesTransactionPostingReportV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatementReportV07#mmPagination
 * CorporateActionInstructionStatementReportV07.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmPagination
 * CorporateActionNotificationV08.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV09#mmPagination
 * CorporateActionMovementConfirmationV09.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09#mmPagination
 * CorporateActionMovementPreliminaryAdviceV09.mmPagination}</li>
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
 * "Pagination1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Pagination
 * Pagination}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Pagination1", propOrder = {"pageNumber", "lastPageIndicator"})
public class Pagination1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PgNb", required = true)
	protected Max5NumericText pageNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Pagination1 Pagination1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Page number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Pagination#mmPageNumber
	 * Pagination.mmPageNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Pagination1, Max5NumericText> mmPageNumber = new MMMessageAttribute<Pagination1, Max5NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination1.mmObject();
			isDerived = false;
			xmlTag = "PgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PageNumber";
			definition = "Page number.";
			previousVersion_lazy = () -> Pagination.mmPageNumber;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Max5NumericText getValue(Pagination1 obj) {
			return obj.getPageNumber();
		}

		@Override
		public void setValue(Pagination1 obj, Max5NumericText value) {
			obj.setPageNumber(value);
		}
	};
	@XmlElement(name = "LastPgInd", required = true)
	protected YesNoIndicator lastPageIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Pagination1 Pagination1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPageIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the last page."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Pagination#mmLastPageIndicator
	 * Pagination.mmLastPageIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Pagination1, YesNoIndicator> mmLastPageIndicator = new MMMessageAttribute<Pagination1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Pagination1.mmObject();
			isDerived = false;
			xmlTag = "LastPgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPageIndicator";
			definition = "Indicates the last page.";
			previousVersion_lazy = () -> Pagination.mmLastPageIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Pagination1 obj) {
			return obj.getLastPageIndicator();
		}

		@Override
		public void setValue(Pagination1 obj, YesNoIndicator value) {
			obj.setLastPageIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Pagination1.mmPageNumber, com.tools20022.repository.msg.Pagination1.mmLastPageIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementPostingReportV07.mmPagination, SecuritiesTransactionPendingReportV09.mmPagination, SecuritiesSettlementTransactionAllegementReportV07.mmPagination,
						PortfolioTransferNotificationV05.mmPagination, SecuritiesTransactionPostingReportV08.mmPagination, CorporateActionInstructionStatementReportV07.mmPagination, CorporateActionNotificationV08.mmPagination,
						CorporateActionMovementConfirmationV09.mmPagination, CorporateActionMovementPreliminaryAdviceV09.mmPagination);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Pagination1";
				definition = "Number used to sequence pages when it is not possible for data to be conveyed in a single message and the data has to be split across several pages (messages).";
				previousVersion_lazy = () -> Pagination.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max5NumericText getPageNumber() {
		return pageNumber;
	}

	public Pagination1 setPageNumber(Max5NumericText pageNumber) {
		this.pageNumber = Objects.requireNonNull(pageNumber);
		return this;
	}

	public YesNoIndicator getLastPageIndicator() {
		return lastPageIndicator;
	}

	public Pagination1 setLastPageIndicator(YesNoIndicator lastPageIndicator) {
		this.lastPageIndicator = Objects.requireNonNull(lastPageIndicator);
		return this;
	}
}