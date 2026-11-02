.class public abstract Lvm8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbq0;

    .line 2
    .line 3
    const/16 v1, 0x61

    .line 4
    .line 5
    const/16 v2, 0x7a

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lbq0;-><init>(CC)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lbq0;

    .line 11
    .line 12
    const/16 v2, 0x41

    .line 13
    .line 14
    const/16 v3, 0x5a

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lbq0;-><init>(CC)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lwv0;->F0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0x5b

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/16 v2, 0x5d

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/16 v3, 0x27

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    filled-new-array {v1, v2, v3}, [Ljava/lang/Character;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0, v1}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lvm8;->a:Ljava/util/ArrayList;

    .line 54
    .line 55
    return-void
.end method

.method public static final a(Lmd4;Ljava/lang/String;)V
    .locals 16

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v2, v1, [Ljava/util/List;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aput-object v0, v2, v3

    .line 11
    .line 12
    invoke-static {v2}, Li21;->N([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v4, ""

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    move v6, v3

    .line 24
    move v7, v6

    .line 25
    move v10, v7

    .line 26
    move-object v9, v4

    .line 27
    move-object v8, v5

    .line 28
    :goto_0
    if-ge v6, v2, :cond_10

    .line 29
    .line 30
    move-object/from16 v11, p1

    .line 31
    .line 32
    invoke-virtual {v11, v6}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    if-nez v8, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    if-ne v12, v13, :cond_1

    .line 44
    .line 45
    add-int/lit8 v7, v7, 0x1

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_1
    :goto_1
    const/16 v13, 0x27

    .line 50
    .line 51
    if-eqz v10, :cond_5

    .line 52
    .line 53
    if-ne v12, v13, :cond_4

    .line 54
    .line 55
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, Ljava/util/List;

    .line 60
    .line 61
    if-eqz v10, :cond_3

    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-nez v12, :cond_2

    .line 68
    .line 69
    const-string v9, "\'"

    .line 70
    .line 71
    :cond_2
    new-instance v12, Ltm8;

    .line 72
    .line 73
    invoke-direct {v12, v9}, Ltm8;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v10, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    move v10, v3

    .line 80
    :goto_2
    move-object v9, v4

    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    new-instance v13, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_5
    if-lez v7, :cond_7

    .line 98
    .line 99
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v14

    .line 103
    check-cast v14, Ljava/util/List;

    .line 104
    .line 105
    if-eqz v14, :cond_6

    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-static {v8, v7}, Lvm8;->d(CI)Lqm8;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_6
    move v7, v3

    .line 122
    move-object v8, v5

    .line 123
    :cond_7
    sget-object v14, Lvm8;->a:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    if-nez v14, :cond_8

    .line 134
    .line 135
    new-instance v13, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    goto :goto_3

    .line 148
    :cond_8
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-nez v14, :cond_a

    .line 153
    .line 154
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    check-cast v14, Ljava/util/List;

    .line 159
    .line 160
    if-eqz v14, :cond_9

    .line 161
    .line 162
    new-instance v15, Ltm8;

    .line 163
    .line 164
    invoke-direct {v15, v9}, Ltm8;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_9
    move-object v9, v4

    .line 171
    :cond_a
    if-eq v12, v13, :cond_e

    .line 172
    .line 173
    const/16 v13, 0x5b

    .line 174
    .line 175
    if-eq v12, v13, :cond_d

    .line 176
    .line 177
    const/16 v13, 0x5d

    .line 178
    .line 179
    if-eq v12, v13, :cond_b

    .line 180
    .line 181
    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    move v7, v1

    .line 186
    goto :goto_3

    .line 187
    :cond_b
    invoke-static {v0}, Lbw0;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    check-cast v12, Ljava/util/List;

    .line 192
    .line 193
    if-eqz v12, :cond_c

    .line 194
    .line 195
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    check-cast v13, Ljava/util/List;

    .line 200
    .line 201
    if-eqz v13, :cond_f

    .line 202
    .line 203
    new-instance v14, Lrm8;

    .line 204
    .line 205
    new-instance v15, Lsm8;

    .line 206
    .line 207
    invoke-direct {v15, v12}, Lsm8;-><init>(Ljava/util/List;)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v14, v15}, Lrm8;-><init>(Lsm8;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_c
    const-string v0, "Unmatched closing bracket"

    .line 218
    .line 219
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_d
    new-instance v12, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_e
    move v10, v1

    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :cond_f
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_10
    if-lez v7, :cond_11

    .line 240
    .line 241
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Ljava/util/List;

    .line 246
    .line 247
    if-eqz v1, :cond_11

    .line 248
    .line 249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-static {v2, v7}, Lvm8;->d(CI)Lqm8;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    :cond_11
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_12

    .line 268
    .line 269
    invoke-static {v0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Ljava/util/List;

    .line 274
    .line 275
    if-eqz v1, :cond_12

    .line 276
    .line 277
    new-instance v2, Ltm8;

    .line 278
    .line 279
    invoke-direct {v2, v9}, Ltm8;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    :cond_12
    new-instance v1, Lsm8;

    .line 286
    .line 287
    invoke-static {v0}, Lbw0;->j0(Ljava/util/List;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, Ljava/util/List;

    .line 292
    .line 293
    if-eqz v0, :cond_13

    .line 294
    .line 295
    invoke-direct {v1, v0}, Lsm8;-><init>(Ljava/util/List;)V

    .line 296
    .line 297
    .line 298
    move-object/from16 v0, p0

    .line 299
    .line 300
    invoke-static {v0, v1}, Lvm8;->b(Lcc1;Lum8;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_13
    const-string v0, "Unmatched opening bracket"

    .line 305
    .line 306
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-void
.end method

.method public static final b(Lcc1;Lum8;)V
    .locals 8

    .line 1
    instance-of v0, p1, Ltm8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ltm8;

    .line 6
    .line 7
    iget-object p1, p1, Ltm8;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Lcc1;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of v0, p1, Lsm8;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p1, Lsm8;

    .line 18
    .line 19
    iget-object p1, p1, Lsm8;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lum8;

    .line 36
    .line 37
    invoke-static {p0, v0}, Lvm8;->b(Lcc1;Lum8;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void

    .line 42
    :cond_2
    instance-of v0, p1, Lrm8;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    new-instance v0, Lb58;

    .line 49
    .line 50
    const/16 v3, 0x9

    .line 51
    .line 52
    invoke-direct {v0, v3}, Lb58;-><init>(B)V

    .line 53
    .line 54
    .line 55
    new-array v1, v1, [Lgn2;

    .line 56
    .line 57
    aput-object v0, v1, v2

    .line 58
    .line 59
    new-instance v0, Lpy7;

    .line 60
    .line 61
    check-cast p1, Lrm8;

    .line 62
    .line 63
    const/16 v2, 0xa

    .line 64
    .line 65
    invoke-direct {v0, p1, v2}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v1, v0}, Lz68;->i(Lcc1;[Lgn2;Lgn2;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    instance-of v0, p1, Lqm8;

    .line 73
    .line 74
    if-eqz v0, :cond_1b

    .line 75
    .line 76
    move-object v0, p1

    .line 77
    check-cast v0, Lqm8;

    .line 78
    .line 79
    instance-of v3, v0, Lnm8;

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    instance-of v0, p0, Lac1;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    check-cast p1, Lnm8;

    .line 88
    .line 89
    check-cast p0, Lac1;

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Lnm8;->c(Lac1;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    const-string p0, "A time-based directive "

    .line 96
    .line 97
    const-string v0, " was used in a format builder that doesn\'t support time components"

    .line 98
    .line 99
    invoke-static {p0, p1, v0}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_5
    instance-of v3, v0, Lom8;

    .line 104
    .line 105
    if-eqz v3, :cond_7

    .line 106
    .line 107
    instance-of v0, p0, Lbc1;

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    check-cast p1, Lom8;

    .line 112
    .line 113
    check-cast p0, Lbc1;

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Lom8;->d(Lbc1;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    const-string p0, "A year-month-based directive "

    .line 120
    .line 121
    const-string v0, " was used in a format builder that doesn\'t support year-month components"

    .line 122
    .line 123
    invoke-static {p0, p1, v0}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_7
    instance-of v3, v0, Lhm8;

    .line 128
    .line 129
    if-eqz v3, :cond_9

    .line 130
    .line 131
    instance-of v0, p0, Lzb1;

    .line 132
    .line 133
    if-eqz v0, :cond_8

    .line 134
    .line 135
    check-cast p1, Lhm8;

    .line 136
    .line 137
    check-cast p0, Lzb1;

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Lhm8;->c(Lzb1;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    const-string p0, "A date-based directive "

    .line 144
    .line 145
    const-string v0, " was used in a format builder that doesn\'t support date components"

    .line 146
    .line 147
    invoke-static {p0, p1, v0}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    instance-of v3, v0, Lpm8;

    .line 152
    .line 153
    if-nez v3, :cond_1a

    .line 154
    .line 155
    instance-of v3, v0, Lim8;

    .line 156
    .line 157
    if-eqz v3, :cond_18

    .line 158
    .line 159
    instance-of v0, p0, Lwr8;

    .line 160
    .line 161
    if-eqz v0, :cond_17

    .line 162
    .line 163
    check-cast p1, Lim8;

    .line 164
    .line 165
    check-cast p0, Lwr8;

    .line 166
    .line 167
    iget-byte v0, p1, Lim8;->a:B

    .line 168
    .line 169
    const/4 v3, 0x5

    .line 170
    const/4 v4, 0x3

    .line 171
    const/4 v5, 0x2

    .line 172
    const/4 v6, 0x4

    .line 173
    const/4 v7, 0x0

    .line 174
    packed-switch v0, :pswitch_data_0

    .line 175
    .line 176
    .line 177
    iget v0, p1, Lim8;->b:I

    .line 178
    .line 179
    if-eq v0, v1, :cond_c

    .line 180
    .line 181
    if-eq v0, v5, :cond_c

    .line 182
    .line 183
    if-eq v0, v4, :cond_c

    .line 184
    .line 185
    if-eq v0, v6, :cond_b

    .line 186
    .line 187
    if-ne v0, v3, :cond_a

    .line 188
    .line 189
    invoke-virtual {p1, p0, v2, v1}, Lim8;->c(Lwr8;ZZ)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_a
    invoke-static {p1}, Lvm8;->e(Lqm8;)V

    .line 194
    .line 195
    .line 196
    throw v7

    .line 197
    :cond_b
    new-instance p0, Lim8;

    .line 198
    .line 199
    invoke-direct {p0, v2, v6}, Lim8;-><init>(BI)V

    .line 200
    .line 201
    .line 202
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 203
    .line 204
    .line 205
    throw v7

    .line 206
    :cond_c
    invoke-virtual {p1, p0, v2, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :pswitch_0
    iget v0, p1, Lim8;->b:I

    .line 211
    .line 212
    if-eq v0, v1, :cond_11

    .line 213
    .line 214
    if-eq v0, v5, :cond_10

    .line 215
    .line 216
    if-eq v0, v4, :cond_f

    .line 217
    .line 218
    if-eq v0, v6, :cond_e

    .line 219
    .line 220
    if-ne v0, v3, :cond_d

    .line 221
    .line 222
    invoke-virtual {p1, p0, v2, v1}, Lim8;->c(Lwr8;ZZ)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_d
    invoke-static {p1}, Lvm8;->e(Lqm8;)V

    .line 227
    .line 228
    .line 229
    throw v7

    .line 230
    :cond_e
    invoke-virtual {p1, p0, v2, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_f
    invoke-virtual {p1, p0, v2, v1}, Lim8;->c(Lwr8;ZZ)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_10
    invoke-virtual {p1, p0, v2, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_11
    invoke-virtual {p1, p0, v2, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :pswitch_1
    iget v0, p1, Lim8;->b:I

    .line 247
    .line 248
    if-eq v0, v1, :cond_16

    .line 249
    .line 250
    if-eq v0, v5, :cond_15

    .line 251
    .line 252
    if-eq v0, v4, :cond_14

    .line 253
    .line 254
    if-eq v0, v6, :cond_13

    .line 255
    .line 256
    if-ne v0, v3, :cond_12

    .line 257
    .line 258
    invoke-virtual {p1, p0, v1, v1}, Lim8;->c(Lwr8;ZZ)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_12
    invoke-static {p1}, Lvm8;->e(Lqm8;)V

    .line 263
    .line 264
    .line 265
    throw v7

    .line 266
    :cond_13
    invoke-virtual {p1, p0, v1, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_14
    invoke-virtual {p1, p0, v1, v1}, Lim8;->c(Lwr8;ZZ)V

    .line 271
    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_15
    invoke-virtual {p1, p0, v1, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 275
    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_16
    invoke-virtual {p1, p0, v1, v2}, Lim8;->c(Lwr8;ZZ)V

    .line 279
    .line 280
    .line 281
    :goto_1
    return-void

    .line 282
    :pswitch_2
    invoke-static {p1}, Lvm8;->c(Lqm8;)V

    .line 283
    .line 284
    .line 285
    throw v7

    .line 286
    :cond_17
    const-string p0, "A UTC-offset-based directive "

    .line 287
    .line 288
    const-string v0, " was used in a format builder that doesn\'t support UTC offset components"

    .line 289
    .line 290
    invoke-static {p0, p1, v0}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_18
    instance-of p0, v0, Lkn8;

    .line 295
    .line 296
    if-eqz p0, :cond_19

    .line 297
    .line 298
    const-string p0, "The meaning of the directive \'"

    .line 299
    .line 300
    const-string v0, "\' is unknown"

    .line 301
    .line 302
    invoke-static {p0, p1, v0}, Lio/sentry/c2;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_19
    invoke-static {}, Lb61;->c()V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_1a
    const-string p0, "A time-zone-based directive "

    .line 311
    .line 312
    const-string v0, " was used in a format builder that doesn\'t support time-zone components"

    .line 313
    .line 314
    invoke-static {p0, p1, v0}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_1b
    invoke-static {}, Lb61;->c()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Lqm8;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "The directive \'"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "\' is locale-dependent, but locales are not supported in Kotlin"

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public static final d(CI)Lqm8;
    .locals 1

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    new-instance v0, Lkn8;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lkn8;-><init>(CI)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :pswitch_1
    new-instance p0, Lpm8;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p0, v0, p1}, Lpm8;-><init>(BI)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    new-instance p0, Lom8;

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_3
    new-instance p0, Lim8;

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    invoke-direct {p0, v0, p1}, Lim8;-><init>(BI)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_4
    new-instance p0, Lgm8;

    .line 33
    .line 34
    const/16 v0, 0x9

    .line 35
    .line 36
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_5
    new-instance p0, Lpm8;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, v0, p1}, Lpm8;-><init>(BI)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_6
    new-instance p0, Lom8;

    .line 48
    .line 49
    const/4 v0, 0x7

    .line 50
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_7
    new-instance p0, Lkm8;

    .line 55
    .line 56
    invoke-direct {p0, p1}, Lkm8;-><init>(I)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_8
    new-instance p0, Lom8;

    .line 61
    .line 62
    const/4 v0, 0x4

    .line 63
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_9
    new-instance p0, Lom8;

    .line 68
    .line 69
    const/4 v0, 0x6

    .line 70
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_a
    new-instance p0, Lmm8;

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    invoke-direct {p0, v0, p1}, Lmm8;-><init>(BI)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_b
    new-instance p0, Ljm8;

    .line 82
    .line 83
    const/4 v0, 0x3

    .line 84
    invoke-direct {p0, v0, p1}, Ljm8;-><init>(BI)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_c
    new-instance p0, Ljm8;

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, v0, p1}, Ljm8;-><init>(BI)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_d
    new-instance p0, Lgm8;

    .line 96
    .line 97
    const/4 v0, 0x5

    .line 98
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_e
    new-instance p0, Lgm8;

    .line 103
    .line 104
    const/4 v0, 0x4

    .line 105
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_f
    new-instance p0, Lgm8;

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_10
    new-instance p0, Lgm8;

    .line 117
    .line 118
    const/4 v0, 0x6

    .line 119
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_11
    new-instance p0, Ljm8;

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    invoke-direct {p0, v0, p1}, Ljm8;-><init>(BI)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_12
    new-instance p0, Lim8;

    .line 131
    .line 132
    const/4 v0, 0x3

    .line 133
    invoke-direct {p0, v0, p1}, Lim8;-><init>(BI)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_13
    new-instance p0, Lgm8;

    .line 138
    .line 139
    const/4 v0, 0x7

    .line 140
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 141
    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_14
    new-instance p0, Lim8;

    .line 145
    .line 146
    const/4 v0, 0x1

    .line 147
    invoke-direct {p0, v0, p1}, Lim8;-><init>(BI)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_15
    new-instance p0, Lgm8;

    .line 152
    .line 153
    const/16 v0, 0x8

    .line 154
    .line 155
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_16
    new-instance p0, Lpm8;

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-direct {p0, v0, p1}, Lpm8;-><init>(BI)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_17
    new-instance p0, Lom8;

    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_18
    new-instance p0, Lmm8;

    .line 174
    .line 175
    const/4 v0, 0x0

    .line 176
    invoke-direct {p0, v0, p1}, Lmm8;-><init>(BI)V

    .line 177
    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_19
    new-instance p0, Lom8;

    .line 181
    .line 182
    const/4 v0, 0x3

    .line 183
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 184
    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_1a
    new-instance p0, Lim8;

    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    invoke-direct {p0, v0, p1}, Lim8;-><init>(BI)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_1b
    new-instance p0, Lmm8;

    .line 195
    .line 196
    const/4 v0, 0x2

    .line 197
    invoke-direct {p0, v0, p1}, Lmm8;-><init>(BI)V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_1c
    new-instance p0, Lom8;

    .line 202
    .line 203
    const/4 v0, 0x2

    .line 204
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_1d
    new-instance p0, Lom8;

    .line 209
    .line 210
    const/4 v0, 0x5

    .line 211
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 212
    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_1e
    new-instance p0, Ljm8;

    .line 216
    .line 217
    const/4 v0, 0x2

    .line 218
    invoke-direct {p0, v0, p1}, Ljm8;-><init>(BI)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_1f
    new-instance p0, Lom8;

    .line 223
    .line 224
    const/4 v0, 0x1

    .line 225
    invoke-direct {p0, v0, p1}, Lom8;-><init>(BI)V

    .line 226
    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_20
    new-instance p0, Lgm8;

    .line 230
    .line 231
    const/4 v0, 0x2

    .line 232
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 233
    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_21
    new-instance p0, Lgm8;

    .line 237
    .line 238
    const/4 v0, 0x1

    .line 239
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 240
    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_22
    new-instance p0, Lgm8;

    .line 244
    .line 245
    const/4 v0, 0x3

    .line 246
    invoke-direct {p0, v0, p1}, Lgm8;-><init>(BI)V

    .line 247
    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_23
    new-instance p0, Lmm8;

    .line 251
    .line 252
    const/4 v0, 0x1

    .line 253
    invoke-direct {p0, v0, p1}, Lmm8;-><init>(BI)V

    .line 254
    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_23
        :pswitch_0
        :pswitch_0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_0
        :pswitch_19
        :pswitch_0
        :pswitch_18
        :pswitch_0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final e(Lqm8;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Unknown length "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lqm8;->a()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " for the "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lqm8;->b()C

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " directive"

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "kotlinx.datetime formatting does not support the "

    .line 4
    .line 5
    const-string v2, " field. "

    .line 6
    .line 7
    invoke-static {v1, p0, v2}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string v1, " "

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, ""

    .line 21
    .line 22
    :goto_0
    const-string v1, "Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues"

    .line 23
    .line 24
    invoke-static {p0, p1, v1}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public static final g(Lom8;I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Padding do "

    .line 4
    .line 5
    const-string v2, " digits is not supported for the "

    .line 6
    .line 7
    invoke-static {v1, p1, v2}, Lie2;->l(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lqm8;->b()C

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, " directive"

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method
