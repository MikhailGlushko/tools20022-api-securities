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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.EntitlementAssessment3;

/**
 * At least one message element in the list SecuritiesBlockingDeadline,
 * SecuritiesBlockingMarketDeadline, SecuritiesBlockingSTPDeadline,
 * SecuritiesBlockingPeriodEndDate, EntitlementFixingDate,
 * RegistrationSecuritiesDeadline, RegistrationSecuritiesSTPDeadline,
 * RegistrationSecuritiesMarketDeadline, RegistrationParticipationDeadline,
 * RegistrationParticipationSTPDeadline, RegistrationParticipationMarketDeadline
 * must be present. More than one message element in the list may be present.
 */
public class ConstraintEntitlementAssesment1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3
	 * EntitlementAssessment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementAssesment1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one message element in the list SecuritiesBlockingDeadline, SecuritiesBlockingMarketDeadline, SecuritiesBlockingSTPDeadline, SecuritiesBlockingPeriodEndDate, EntitlementFixingDate, RegistrationSecuritiesDeadline, RegistrationSecuritiesSTPDeadline, RegistrationSecuritiesMarketDeadline, RegistrationParticipationDeadline, RegistrationParticipationSTPDeadline, RegistrationParticipationMarketDeadline must be present. More than one message element in the list may be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<EntitlementAssessment3> forEntitlementAssessment3 = new MMConstraint<EntitlementAssessment3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementAssesment1Rule";
			definition = "At least one message element in the list SecuritiesBlockingDeadline, SecuritiesBlockingMarketDeadline, SecuritiesBlockingSTPDeadline, SecuritiesBlockingPeriodEndDate, EntitlementFixingDate, RegistrationSecuritiesDeadline, RegistrationSecuritiesSTPDeadline, RegistrationSecuritiesMarketDeadline, RegistrationParticipationDeadline, RegistrationParticipationSTPDeadline, RegistrationParticipationMarketDeadline must be present. More than one message element in the list may be present.";
			owner_lazy = () -> EntitlementAssessment3.mmObject();
		}

		@Override
		public void executeValidator(EntitlementAssessment3 obj) throws Exception {
			checkEntitlementAssessment3(obj);
		}
	};

	/**
	 * At least one message element in the list SecuritiesBlockingDeadline,
	 * SecuritiesBlockingMarketDeadline, SecuritiesBlockingSTPDeadline,
	 * SecuritiesBlockingPeriodEndDate, EntitlementFixingDate,
	 * RegistrationSecuritiesDeadline, RegistrationSecuritiesSTPDeadline,
	 * RegistrationSecuritiesMarketDeadline, RegistrationParticipationDeadline,
	 * RegistrationParticipationSTPDeadline,
	 * RegistrationParticipationMarketDeadline must be present. More than one
	 * message element in the list may be present.
	 */
	public static void checkEntitlementAssessment3(EntitlementAssessment3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}