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
import com.tools20022.repository.msg.SecuritiesCertificate3;
import com.tools20022.repository.msg.SecuritiesCertificate4;

/**
 * If Number is ISO 8532 (Format for transmission of certificate numbers), then
 * Issuer and SchemeName must not be used.
 */
public class ConstraintISO8532AndIssuerSchemeNameRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3
	 * SecuritiesCertificate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO8532AndIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Number is ISO 8532 (Format for transmission of certificate numbers), then Issuer and SchemeName must not be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate3> forSecuritiesCertificate3 = new MMConstraint<SecuritiesCertificate3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO8532AndIssuerSchemeNameRule";
			definition = "If Number is ISO 8532 (Format for transmission of certificate numbers), then Issuer and SchemeName must not be used.";
			owner_lazy = () -> SecuritiesCertificate3.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesCertificate3 obj) throws Exception {
			checkSecuritiesCertificate3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4
	 * SecuritiesCertificate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO8532AndIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Number is ISO 8532 (Format for transmission of certificate numbers), then Issuer and SchemeName must not be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate4> forSecuritiesCertificate4 = new MMConstraint<SecuritiesCertificate4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO8532AndIssuerSchemeNameRule";
			definition = "If Number is ISO 8532 (Format for transmission of certificate numbers), then Issuer and SchemeName must not be used.";
			owner_lazy = () -> SecuritiesCertificate4.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesCertificate4 obj) throws Exception {
			checkSecuritiesCertificate4(obj);
		}
	};

	/**
	 * If Number is ISO 8532 (Format for transmission of certificate numbers),
	 * then Issuer and SchemeName must not be used.
	 */
	public static void checkSecuritiesCertificate3(SecuritiesCertificate3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Number is ISO 8532 (Format for transmission of certificate numbers),
	 * then Issuer and SchemeName must not be used.
	 */
	public static void checkSecuritiesCertificate4(SecuritiesCertificate4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}