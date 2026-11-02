.class public final Lfg1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static final i(Landroid/view/ViewGroup;Lml2;)Lfg1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lml2;->J()Lk42;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget p1, Lt36;->special_effects_controller_view_tag:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Lfg1;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    check-cast p1, Lfg1;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Lfg1;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lfg1;-><init>(Landroid/view/ViewGroup;)V

    .line 30
    .line 31
    .line 32
    sget v0, Lt36;->special_effects_controller_view_tag:I

    .line 33
    .line 34
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method public static j(Ljava/util/ArrayList;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :cond_0
    :goto_0
    move v2, v1

    .line 7
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v3, :cond_4

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lxe7;

    .line 19
    .line 20
    iget-object v3, v2, Lxe7;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_3

    .line 27
    .line 28
    iget-object v2, v2, Lxe7;->k:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lwe7;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    instance-of v3, v3, Ldg1;

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    :cond_3
    move v2, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    if-eqz v2, :cond_6

    .line 63
    .line 64
    new-instance v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lxe7;

    .line 84
    .line 85
    iget-object v2, v2, Lxe7;->k:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_6

    .line 96
    .line 97
    return v1

    .line 98
    :cond_6
    return v4
.end method


# virtual methods
.method public final a(Lxe7;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lxe7;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lxe7;->a:Lze7;

    .line 9
    .line 10
    iget-object v1, p1, Lxe7;->c:Lqk2;

    .line 11
    .line 12
    invoke-virtual {v1}, Lqk2;->O()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Lze7;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    iput-boolean p0, p1, Lxe7;->i:Z

    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, Lze7;->Z:Lze7;

    .line 10
    .line 11
    sget-object v3, Lze7;->X:Lwe5;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v5, v1

    .line 21
    check-cast v5, Lxe7;

    .line 22
    .line 23
    iget-object v6, v5, Lxe7;->c:Lqk2;

    .line 24
    .line 25
    iget-object v6, v6, Lqk2;->J0:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v6}, Lwe5;->d(Landroid/view/View;)Lze7;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    if-ne v6, v2, :cond_0

    .line 38
    .line 39
    iget-object v5, v5, Lxe7;->a:Lze7;

    .line 40
    .line 41
    if-eq v5, v2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v1, v4

    .line 45
    :goto_0
    check-cast v1, Lxe7;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    move-object v6, v5

    .line 66
    check-cast v6, Lxe7;

    .line 67
    .line 68
    iget-object v7, v6, Lxe7;->c:Lqk2;

    .line 69
    .line 70
    iget-object v7, v7, Lqk2;->J0:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v7}, Lwe5;->d(Landroid/view/View;)Lze7;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-eq v7, v2, :cond_2

    .line 83
    .line 84
    iget-object v6, v6, Lxe7;->a:Lze7;

    .line 85
    .line 86
    if-ne v6, v2, :cond_2

    .line 87
    .line 88
    move-object v4, v5

    .line 89
    :cond_3
    check-cast v4, Lxe7;

    .line 90
    .line 91
    const/4 v0, 0x2

    .line 92
    invoke-static {v0}, Lml2;->K(I)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    new-instance v2, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Lxe7;

    .line 119
    .line 120
    iget-object v3, v3, Lxe7;->c:Lqk2;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, Lxe7;

    .line 137
    .line 138
    iget-object v5, v5, Lxe7;->c:Lqk2;

    .line 139
    .line 140
    iget-object v5, v5, Lqk2;->M0:Lnk2;

    .line 141
    .line 142
    iget-object v6, v3, Lqk2;->M0:Lnk2;

    .line 143
    .line 144
    iget v7, v6, Lnk2;->b:I

    .line 145
    .line 146
    iput v7, v5, Lnk2;->b:I

    .line 147
    .line 148
    iget v7, v6, Lnk2;->c:I

    .line 149
    .line 150
    iput v7, v5, Lnk2;->c:I

    .line 151
    .line 152
    iget v7, v6, Lnk2;->d:I

    .line 153
    .line 154
    iput v7, v5, Lnk2;->d:I

    .line 155
    .line 156
    iget v6, v6, Lnk2;->e:I

    .line 157
    .line 158
    iput v6, v5, Lnk2;->e:I

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/4 v4, 0x0

    .line 170
    if-eqz v3, :cond_6

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lxe7;

    .line 177
    .line 178
    new-instance v5, Lbg1;

    .line 179
    .line 180
    invoke-direct {v5, v3, p2}, Lbg1;-><init>(Lxe7;Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    new-instance v5, Leg1;

    .line 187
    .line 188
    invoke-direct {v5, v3}, Lcw0;-><init>(Lxe7;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    new-instance v5, Lyf1;

    .line 195
    .line 196
    invoke-direct {v5, p0, v3, v4}, Lyf1;-><init>(Lfg1;Lxe7;B)V

    .line 197
    .line 198
    .line 199
    iget-object v3, v3, Lxe7;->d:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    :cond_7
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_8

    .line 219
    .line 220
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    move-object v3, v2

    .line 225
    check-cast v3, Leg1;

    .line 226
    .line 227
    invoke-virtual {v3}, Lcw0;->w0()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-nez v3, :cond_7

    .line 232
    .line 233
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_8
    new-instance p2, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_9

    .line 251
    .line 252
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Leg1;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_9
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    if-eqz p2, :cond_a

    .line 271
    .line 272
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    check-cast p2, Leg1;

    .line 277
    .line 278
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_a
    new-instance p1, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    new-instance p2, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_b

    .line 301
    .line 302
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    check-cast v3, Lbg1;

    .line 307
    .line 308
    iget-object v3, v3, Lcw0;->X:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v3, Lxe7;

    .line 311
    .line 312
    iget-object v3, v3, Lxe7;->k:Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-static {p2, v3}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_b
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    move v2, v4

    .line 327
    :cond_c
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_11

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    check-cast v3, Lbg1;

    .line 338
    .line 339
    iget-object v5, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 340
    .line 341
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    iget-object v6, v3, Lcw0;->X:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v6, Lxe7;

    .line 348
    .line 349
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v5}, Lbg1;->F0(Landroid/content/Context;)Lmj0;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-nez v5, :cond_d

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_d
    iget-object v5, v5, Lmj0;->Z:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v5, Landroid/animation/AnimatorSet;

    .line 362
    .line 363
    if-nez v5, :cond_e

    .line 364
    .line 365
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_e
    iget-object v5, v6, Lxe7;->c:Lqk2;

    .line 370
    .line 371
    iget-object v7, v6, Lxe7;->k:Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    if-nez v7, :cond_f

    .line 378
    .line 379
    invoke-static {v0}, Lml2;->K(I)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_c

    .line 384
    .line 385
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_f
    iget-object v2, v6, Lxe7;->a:Lze7;

    .line 390
    .line 391
    sget-object v5, Lze7;->f0:Lze7;

    .line 392
    .line 393
    if-ne v2, v5, :cond_10

    .line 394
    .line 395
    iput-boolean v4, v6, Lxe7;->i:Z

    .line 396
    .line 397
    :cond_10
    new-instance v2, Ldg1;

    .line 398
    .line 399
    invoke-direct {v2, v3}, Ldg1;-><init>(Lbg1;)V

    .line 400
    .line 401
    .line 402
    iget-object v3, v6, Lxe7;->j:Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    const/4 v2, 0x1

    .line 408
    goto :goto_7

    .line 409
    :cond_11
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    :cond_12
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    if-eqz p1, :cond_15

    .line 418
    .line 419
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    check-cast p1, Lbg1;

    .line 424
    .line 425
    iget-object v1, p1, Lcw0;->X:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v1, Lxe7;

    .line 428
    .line 429
    iget-object v3, v1, Lxe7;->c:Lqk2;

    .line 430
    .line 431
    if-nez p2, :cond_13

    .line 432
    .line 433
    invoke-static {v0}, Lml2;->K(I)Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_12

    .line 438
    .line 439
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_13
    if-eqz v2, :cond_14

    .line 444
    .line 445
    invoke-static {v0}, Lml2;->K(I)Z

    .line 446
    .line 447
    .line 448
    move-result p1

    .line 449
    if-eqz p1, :cond_12

    .line 450
    .line 451
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_14
    new-instance v3, Lag1;

    .line 456
    .line 457
    invoke-direct {v3, p1}, Lag1;-><init>(Lbg1;)V

    .line 458
    .line 459
    .line 460
    iget-object p1, v1, Lxe7;->j:Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_15
    return-void
.end method

.method public final c(Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lxe7;

    .line 21
    .line 22
    iget-object v2, v2, Lxe7;->k:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-static {v0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    move v3, v2

    .line 44
    :goto_1
    if-ge v3, v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lwe7;

    .line 51
    .line 52
    iget-object v5, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Lwe7;->b(Landroid/view/ViewGroup;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    move v1, v2

    .line 65
    :goto_2
    if-ge v1, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lxe7;

    .line 72
    .line 73
    invoke-virtual {p0, v3}, Lfg1;->a(Lxe7;)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    :goto_3
    if-ge v2, p1, :cond_4

    .line 88
    .line 89
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lxe7;

    .line 94
    .line 95
    iget-object v1, v0, Lxe7;->k:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Lxe7;->b()V

    .line 104
    .line 105
    .line 106
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    return-void
.end method

.method public final d(Lze7;Lye7;Lwl2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p3, Lwl2;->c:Lqk2;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lfg1;->f(Lqk2;)Lxe7;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget-object v1, p3, Lwl2;->c:Lqk2;

    .line 13
    .line 14
    iget-boolean v2, v1, Lqk2;->o0:Z

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-boolean v2, v1, Lqk2;->n0:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lfg1;->g(Lqk2;)Lxe7;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Lxe7;->d(Lze7;Lye7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :cond_3
    :try_start_1
    new-instance v1, Lxe7;

    .line 39
    .line 40
    invoke-direct {v1, p1, p2, p3}, Lxe7;-><init>(Lze7;Lye7;Lwl2;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Lyf1;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-direct {p1, p0, v1, p2}, Lyf1;-><init>(Lfg1;Lxe7;B)V

    .line 52
    .line 53
    .line 54
    iget-object p2, v1, Lxe7;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance p1, Lyf1;

    .line 60
    .line 61
    const/4 p2, 0x2

    .line 62
    invoke-direct {p1, p0, v1, p2}, Lyf1;-><init>(Lfg1;Lxe7;B)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v1, Lxe7;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    monitor-exit v0

    .line 71
    return-void

    .line 72
    :goto_2
    monitor-exit v0

    .line 73
    throw p0
.end method

.method public final e()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lfg1;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lfg1;->h()V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, p0, Lfg1;->e:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v2, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lxe7;

    .line 52
    .line 53
    iget-object v6, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    iget-object v6, v4, Lxe7;->c:Lqk2;

    .line 62
    .line 63
    iget-boolean v6, v6, Lqk2;->o0:Z

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto/16 :goto_8

    .line 70
    .line 71
    :cond_2
    move v5, v1

    .line 72
    :goto_1
    iput-boolean v5, v4, Lxe7;->g:Z

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_8

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Lxe7;

    .line 90
    .line 91
    iget-boolean v4, p0, Lfg1;->d:Z

    .line 92
    .line 93
    const/4 v6, 0x2

    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    invoke-static {v6}, Lml2;->K(I)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {v3}, Lxe7;->b()V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    invoke-static {v6}, Lml2;->K(I)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_7

    .line 114
    .line 115
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-object v4, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 119
    .line 120
    invoke-virtual {v3, v4}, Lxe7;->a(Landroid/view/ViewGroup;)V

    .line 121
    .line 122
    .line 123
    :goto_3
    iput-boolean v1, p0, Lfg1;->d:Z

    .line 124
    .line 125
    iget-boolean v4, v3, Lxe7;->f:Z

    .line 126
    .line 127
    if-nez v4, :cond_4

    .line 128
    .line 129
    iget-object v4, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_8
    iget-object v2, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_f

    .line 142
    .line 143
    invoke-virtual {p0}, Lfg1;->l()V

    .line 144
    .line 145
    .line 146
    iget-object v2, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 147
    .line 148
    new-instance v3, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    monitor-exit v0

    .line 160
    return-void

    .line 161
    :cond_9
    :try_start_1
    iget-object v2, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 169
    .line 170
    .line 171
    iget-boolean v2, p0, Lfg1;->e:Z

    .line 172
    .line 173
    invoke-virtual {p0, v3, v2}, Lfg1;->b(Ljava/util/ArrayList;Z)V

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, Lfg1;->j(Ljava/util/ArrayList;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    move v6, v5

    .line 185
    :cond_a
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_b

    .line 190
    .line 191
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, Lxe7;

    .line 196
    .line 197
    iget-object v7, v7, Lxe7;->c:Lqk2;

    .line 198
    .line 199
    iget-boolean v7, v7, Lqk2;->o0:Z

    .line 200
    .line 201
    if-nez v7, :cond_a

    .line 202
    .line 203
    move v6, v1

    .line 204
    goto :goto_4

    .line 205
    :cond_b
    if-eqz v6, :cond_c

    .line 206
    .line 207
    if-nez v2, :cond_c

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_c
    move v5, v1

    .line 211
    :goto_5
    iput-boolean v5, p0, Lfg1;->d:Z

    .line 212
    .line 213
    if-nez v6, :cond_d

    .line 214
    .line 215
    invoke-virtual {p0, v3}, Lfg1;->k(Ljava/util/ArrayList;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v3}, Lfg1;->c(Ljava/util/ArrayList;)V

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_d
    if-eqz v2, :cond_e

    .line 223
    .line 224
    invoke-virtual {p0, v3}, Lfg1;->k(Ljava/util/ArrayList;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    move v4, v1

    .line 232
    :goto_6
    if-ge v4, v2, :cond_e

    .line 233
    .line 234
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, Lxe7;

    .line 239
    .line 240
    invoke-virtual {p0, v5}, Lfg1;->a(Lxe7;)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v4, v4, 0x1

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_e
    :goto_7
    iput-boolean v1, p0, Lfg1;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    .line 248
    :cond_f
    monitor-exit v0

    .line 249
    return-void

    .line 250
    :goto_8
    monitor-exit v0

    .line 251
    throw p0
.end method

.method public final f(Lqk2;)Lxe7;
    .locals 3

    .line 1
    iget-object p0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lxe7;

    .line 19
    .line 20
    iget-object v2, v1, Lxe7;->c:Lqk2;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lqk2;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Lxe7;->e:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Lxe7;

    .line 35
    .line 36
    return-object v0
.end method

.method public final g(Lqk2;)Lxe7;
    .locals 3

    .line 1
    iget-object p0, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lxe7;

    .line 19
    .line 20
    iget-object v2, v1, Lxe7;->c:Lqk2;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Lqk2;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Lxe7;->e:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Lxe7;

    .line 35
    .line 36
    return-object v0
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {p0}, Lfg1;->l()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lfg1;->k(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lfg1;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lxe7;

    .line 41
    .line 42
    iput-boolean v5, v4, Lxe7;->g:Z

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_6

    .line 47
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x2

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lxe7;

    .line 63
    .line 64
    invoke-static {v4}, Lml2;->K(I)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    iget-object v4, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 74
    .line 75
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object v4, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Lxe7;->a(Landroid/view/ViewGroup;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iget-object v2, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 88
    .line 89
    new-instance v3, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_4

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Lxe7;

    .line 109
    .line 110
    iput-boolean v5, v6, Lxe7;->g:Z

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Lxe7;

    .line 128
    .line 129
    invoke-static {v4}, Lml2;->K(I)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_6

    .line 134
    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_5
    iget-object v5, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 139
    .line 140
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    :goto_5
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    :cond_6
    iget-object v5, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 147
    .line 148
    invoke-virtual {v3, v5}, Lxe7;->a(Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    monitor-exit v1

    .line 153
    return-void

    .line 154
    :goto_6
    monitor-exit v1

    .line 155
    throw p0
.end method

.method public final k(Ljava/util/ArrayList;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x1

    .line 8
    if-ge v2, v0, :cond_a

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Lxe7;

    .line 15
    .line 16
    iget-object v5, v4, Lxe7;->l:Lwl2;

    .line 17
    .line 18
    iget-object v6, v5, Lwl2;->c:Lqk2;

    .line 19
    .line 20
    iget-boolean v7, v4, Lxe7;->h:Z

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    iput-boolean v3, v4, Lxe7;->h:Z

    .line 27
    .line 28
    iget-object v3, v4, Lxe7;->b:Lye7;

    .line 29
    .line 30
    sget-object v7, Lye7;->Y:Lye7;

    .line 31
    .line 32
    const/4 v8, 0x2

    .line 33
    if-ne v3, v7, :cond_7

    .line 34
    .line 35
    iget-object v3, v6, Lqk2;->J0:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v6}, Lqk2;->g()Lnk2;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    iput-object v3, v7, Lnk2;->k:Landroid/view/View;

    .line 48
    .line 49
    invoke-static {v8}, Lml2;->K(I)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v3, v4, Lxe7;->c:Lqk2;

    .line 62
    .line 63
    invoke-virtual {v3}, Lqk2;->O()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const/4 v7, 0x0

    .line 72
    if-nez v4, :cond_3

    .line 73
    .line 74
    invoke-static {v8}, Lml2;->K(I)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-virtual {v5}, Lwl2;->b()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v7}, Landroid/view/View;->setAlpha(F)V

    .line 90
    .line 91
    .line 92
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    cmpg-float v4, v4, v7

    .line 97
    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_5

    .line 105
    .line 106
    invoke-static {v8}, Lml2;->K(I)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    :cond_4
    const/4 v4, 0x4

    .line 116
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    :cond_5
    iget-object v4, v6, Lqk2;->M0:Lnk2;

    .line 120
    .line 121
    if-nez v4, :cond_6

    .line 122
    .line 123
    const/high16 v4, 0x3f800000    # 1.0f

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    iget v4, v4, Lnk2;->j:F

    .line 127
    .line 128
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    invoke-static {v8}, Lml2;->K(I)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    goto :goto_2

    .line 136
    :cond_7
    sget-object v4, Lye7;->Z:Lye7;

    .line 137
    .line 138
    if-ne v3, v4, :cond_9

    .line 139
    .line 140
    invoke-virtual {v6}, Lqk2;->O()Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {v8}, Lml2;->K(I)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_8

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->clearFocus()V

    .line 164
    .line 165
    .line 166
    :cond_9
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_b

    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, Lxe7;

    .line 190
    .line 191
    iget-object v2, v2, Lxe7;->k:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_b
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Ljava/lang/Iterable;

    .line 202
    .line 203
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    :goto_4
    if-ge v1, v0, :cond_d

    .line 212
    .line 213
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Lwe7;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v4, p0, Lfg1;->a:Landroid/view/ViewGroup;

    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-boolean v5, v2, Lwe7;->a:Z

    .line 228
    .line 229
    if-nez v5, :cond_c

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Lwe7;->d(Landroid/view/ViewGroup;)V

    .line 232
    .line 233
    .line 234
    :cond_c
    iput-boolean v3, v2, Lwe7;->a:Z

    .line 235
    .line 236
    add-int/lit8 v1, v1, 0x1

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_d
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object p0, p0, Lfg1;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lxe7;

    .line 18
    .line 19
    iget-object v1, v0, Lxe7;->b:Lye7;

    .line 20
    .line 21
    sget-object v2, Lye7;->Y:Lye7;

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lxe7;->c:Lqk2;

    .line 26
    .line 27
    invoke-virtual {v1}, Lqk2;->O()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sget-object v2, Lze7;->X:Lwe5;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lwe5;->l(I)Lze7;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, Lye7;->X:Lye7;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Lxe7;->d(Lze7;Lye7;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method
