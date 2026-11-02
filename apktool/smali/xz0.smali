.class public final Lxz0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/view/View;

.field public b:Z

.field public c:Lm01;

.field public d:Ld94;

.field public e:Lyv6;

.field public f:Lfx8;

.field public final g:Lj73;

.field public final h:Lpf6;

.field public final i:Landroid/content/res/Configuration;

.field public final j:Ly05;

.field public final k:Lra;

.field public final l:Lbi;

.field public final m:Ldq;

.field public final n:Liu0;

.field public final o:Lei2;

.field public final p:Ly05;

.field public final q:Lez2;

.field public final r:Lei;

.field public final s:Lp34;

.field public final t:Ly74;

.field public final u:Lvm0;

.field public v:I

.field public final w:Lo7;

.field public x:Lug;

.field public final y:Lwz0;


# direct methods
.method public constructor <init>(Lxz0;Landroid/view/View;Lm01;Ld94;Lyv6;Lfx8;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p1, Lxz0;->a:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lxz0;->a:Landroid/view/View;

    .line 24
    .line 25
    iput-object p3, p0, Lxz0;->c:Lm01;

    .line 26
    .line 27
    iput-object p4, p0, Lxz0;->d:Ld94;

    .line 28
    .line 29
    iput-object p5, p0, Lxz0;->e:Lyv6;

    .line 30
    .line 31
    iput-object p6, p0, Lxz0;->f:Lfx8;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p3, p1, Lxz0;->g:Lj73;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p3, Lj73;

    .line 42
    .line 43
    invoke-direct {p3}, Lj73;-><init>()V

    .line 44
    .line 45
    .line 46
    :goto_1
    iput-object p3, p0, Lxz0;->g:Lj73;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p3, p1, Lxz0;->h:Lpf6;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    new-instance p3, Lpf6;

    .line 54
    .line 55
    invoke-direct {p3}, Lpf6;-><init>()V

    .line 56
    .line 57
    .line 58
    :goto_2
    iput-object p3, p0, Lxz0;->h:Lpf6;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object p3, p1, Lxz0;->i:Landroid/content/res/Configuration;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    new-instance p3, Landroid/content/res/Configuration;

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-direct {p3, p4}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 83
    .line 84
    .line 85
    :goto_3
    iput-object p3, p0, Lxz0;->i:Landroid/content/res/Configuration;

    .line 86
    .line 87
    if-eqz v1, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object p3, p1, Lxz0;->j:Ly05;

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    new-instance p4, Landroid/content/res/Configuration;

    .line 96
    .line 97
    invoke-direct {p4, p3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p4}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    :goto_4
    iput-object p3, p0, Lxz0;->j:Ly05;

    .line 105
    .line 106
    const/4 p3, 0x0

    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p4, p1, Lxz0;->k:Lra;

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    new-instance p4, Lra;

    .line 116
    .line 117
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object p5

    .line 121
    invoke-direct {p4, p3, p3}, Lra;-><init>(BZ)V

    .line 122
    .line 123
    .line 124
    const-string p6, "accessibility"

    .line 125
    .line 126
    invoke-virtual {p5, p6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p5

    .line 130
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast p5, Landroid/view/accessibility/AccessibilityManager;

    .line 134
    .line 135
    :goto_5
    iput-object p4, p0, Lxz0;->k:Lra;

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object p4, p1, Lxz0;->l:Lbi;

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    new-instance p4, Lbi;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p5

    .line 151
    invoke-direct {p4, p5}, Lbi;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    :goto_6
    iput-object p4, p0, Lxz0;->l:Lbi;

    .line 155
    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p4, p1, Lxz0;->m:Ldq;

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_7
    new-instance p4, Ldq;

    .line 165
    .line 166
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    const/16 p6, 0x8

    .line 171
    .line 172
    invoke-direct {p4, p5, p6}, Ldq;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    :goto_7
    iput-object p4, p0, Lxz0;->m:Ldq;

    .line 176
    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object p4, p1, Lxz0;->n:Liu0;

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_8
    new-instance p5, Lkb;

    .line 186
    .line 187
    invoke-direct {p5, p4}, Lkb;-><init>(Ldq;)V

    .line 188
    .line 189
    .line 190
    move-object p4, p5

    .line 191
    :goto_8
    iput-object p4, p0, Lxz0;->n:Liu0;

    .line 192
    .line 193
    if-eqz v1, :cond_9

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object p3, p1, Lxz0;->o:Lei2;

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_9
    new-instance p4, Lra;

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    const/4 p5, 0x1

    .line 207
    invoke-direct {p4, p5, p3}, Lra;-><init>(BZ)V

    .line 208
    .line 209
    .line 210
    move-object p3, p4

    .line 211
    :goto_9
    iput-object p3, p0, Lxz0;->o:Lei2;

    .line 212
    .line 213
    if-eqz v1, :cond_a

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object p3, p1, Lxz0;->p:Ly05;

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_a
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    invoke-static {p3}, Lw45;->C(Landroid/content/Context;)Lhi2;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    sget-object p4, Llh4;->x0:Llh4;

    .line 230
    .line 231
    new-instance p5, Lrh5;

    .line 232
    .line 233
    invoke-direct {p5, p3, p4}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 234
    .line 235
    .line 236
    move-object p3, p5

    .line 237
    :goto_a
    iput-object p3, p0, Lxz0;->p:Ly05;

    .line 238
    .line 239
    if-eqz p1, :cond_b

    .line 240
    .line 241
    iget-object v0, p1, Lxz0;->a:Landroid/view/View;

    .line 242
    .line 243
    :cond_b
    if-ne p2, v0, :cond_c

    .line 244
    .line 245
    iget-object p3, p1, Lxz0;->q:Lez2;

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_c
    new-instance p3, Lso5;

    .line 249
    .line 250
    invoke-direct {p3, p2}, Lso5;-><init>(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    :goto_b
    iput-object p3, p0, Lxz0;->q:Lez2;

    .line 254
    .line 255
    if-eqz v1, :cond_d

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object p2, p1, Lxz0;->r:Lei;

    .line 261
    .line 262
    goto :goto_c

    .line 263
    :cond_d
    new-instance p3, Lei;

    .line 264
    .line 265
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-direct {p3, p2}, Lei;-><init>(Landroid/view/ViewConfiguration;)V

    .line 274
    .line 275
    .line 276
    move-object p2, p3

    .line 277
    :goto_c
    iput-object p2, p0, Lxz0;->r:Lei;

    .line 278
    .line 279
    if-eqz p1, :cond_e

    .line 280
    .line 281
    iget-object p2, p1, Lxz0;->s:Lp34;

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_e
    new-instance p2, Lp34;

    .line 285
    .line 286
    invoke-direct {p2}, Lp34;-><init>()V

    .line 287
    .line 288
    .line 289
    :goto_d
    iput-object p2, p0, Lxz0;->s:Lp34;

    .line 290
    .line 291
    new-instance p2, Ly74;

    .line 292
    .line 293
    invoke-direct {p2}, Ly74;-><init>()V

    .line 294
    .line 295
    .line 296
    iput-object p2, p0, Lxz0;->t:Ly74;

    .line 297
    .line 298
    if-eqz p1, :cond_f

    .line 299
    .line 300
    iget-object p1, p1, Lxz0;->u:Lvm0;

    .line 301
    .line 302
    goto :goto_e

    .line 303
    :cond_f
    new-instance p1, Lvm0;

    .line 304
    .line 305
    invoke-direct {p1}, Lvm0;-><init>()V

    .line 306
    .line 307
    .line 308
    :goto_e
    iput-object p1, p0, Lxz0;->u:Lvm0;

    .line 309
    .line 310
    new-instance p1, Lo7;

    .line 311
    .line 312
    const/16 p2, 0x16

    .line 313
    .line 314
    invoke-direct {p1, p0, p2}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 315
    .line 316
    .line 317
    iput-object p1, p0, Lxz0;->w:Lo7;

    .line 318
    .line 319
    new-instance p1, Lwz0;

    .line 320
    .line 321
    invoke-direct {p1, p0}, Lwz0;-><init>(Lxz0;)V

    .line 322
    .line 323
    .line 324
    iput-object p1, p0, Lxz0;->y:Lwz0;

    .line 325
    .line 326
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/AndroidComposeView;Lzy0;Llp2;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x761ec9f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v5}, Llp2;->X(I)Llp2;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x4

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    move v5, v6

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v5, 0x2

    .line 27
    :goto_0
    or-int/2addr v5, v4

    .line 28
    invoke-virtual {v3, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    const/16 v7, 0x20

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v7, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v5, v7

    .line 40
    invoke-virtual {v3, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    const/16 v7, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v7, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v5, v7

    .line 52
    and-int/lit16 v7, v5, 0x93

    .line 53
    .line 54
    const/16 v8, 0x92

    .line 55
    .line 56
    const/4 v9, 0x1

    .line 57
    if-eq v7, v8, :cond_3

    .line 58
    .line 59
    move v7, v9

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/4 v7, 0x0

    .line 62
    :goto_3
    and-int/2addr v5, v9

    .line 63
    invoke-virtual {v3, v5, v7}, Llp2;->N(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_14

    .line 68
    .line 69
    sget v5, Lg46;->inspection_slot_table_set:I

    .line 70
    .line 71
    invoke-virtual {v1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    instance-of v7, v5, Ljava/util/Set;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    if-eqz v7, :cond_5

    .line 79
    .line 80
    instance-of v7, v5, Lqv3;

    .line 81
    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    instance-of v7, v5, Law3;

    .line 85
    .line 86
    if-eqz v7, :cond_5

    .line 87
    .line 88
    :cond_4
    check-cast v5, Ljava/util/Set;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    move-object v5, v8

    .line 92
    :goto_4
    if-nez v5, :cond_9

    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    instance-of v7, v5, Landroid/view/View;

    .line 99
    .line 100
    if-eqz v7, :cond_6

    .line 101
    .line 102
    check-cast v5, Landroid/view/View;

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_6
    move-object v5, v8

    .line 106
    :goto_5
    if-eqz v5, :cond_7

    .line 107
    .line 108
    sget v7, Lg46;->inspection_slot_table_set:I

    .line 109
    .line 110
    invoke-virtual {v5, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    goto :goto_6

    .line 115
    :cond_7
    move-object v5, v8

    .line 116
    :goto_6
    instance-of v7, v5, Ljava/util/Set;

    .line 117
    .line 118
    if-eqz v7, :cond_a

    .line 119
    .line 120
    instance-of v7, v5, Lqv3;

    .line 121
    .line 122
    if-eqz v7, :cond_8

    .line 123
    .line 124
    instance-of v7, v5, Law3;

    .line 125
    .line 126
    if-eqz v7, :cond_a

    .line 127
    .line 128
    :cond_8
    move-object v8, v5

    .line 129
    check-cast v8, Ljava/util/Set;

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    move-object v8, v5

    .line 133
    :cond_a
    :goto_7
    if-eqz v8, :cond_b

    .line 134
    .line 135
    invoke-virtual {v3}, Llp2;->v()Lo01;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-interface {v8, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iput-boolean v9, v3, Llp2;->q:Z

    .line 143
    .line 144
    iput-boolean v9, v3, Llp2;->C:Z

    .line 145
    .line 146
    iget-object v5, v3, Llp2;->c:Lyb7;

    .line 147
    .line 148
    invoke-virtual {v5}, Lyb7;->b()V

    .line 149
    .line 150
    .line 151
    iget-object v5, v3, Llp2;->H:Lyb7;

    .line 152
    .line 153
    invoke-virtual {v5}, Lyb7;->b()V

    .line 154
    .line 155
    .line 156
    iget-object v5, v3, Llp2;->I:Lbc7;

    .line 157
    .line 158
    iget-object v7, v5, Lbc7;->a:Lyb7;

    .line 159
    .line 160
    iget-object v9, v7, Lyb7;->l0:Ljava/util/HashMap;

    .line 161
    .line 162
    iput-object v9, v5, Lbc7;->e:Ljava/util/HashMap;

    .line 163
    .line 164
    iget-object v7, v7, Lyb7;->m0:Lvz4;

    .line 165
    .line 166
    iput-object v7, v5, Lbc7;->f:Lvz4;

    .line 167
    .line 168
    :cond_b
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v3, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    sget-object v9, Lzz0;->a:Lbe;

    .line 181
    .line 182
    if-nez v5, :cond_c

    .line 183
    .line 184
    if-ne v7, v9, :cond_d

    .line 185
    .line 186
    :cond_c
    new-instance v7, Lzx8;

    .line 187
    .line 188
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 189
    .line 190
    .line 191
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_d
    check-cast v7, Lzx8;

    .line 198
    .line 199
    sget-object v5, Lrd4;->a:Lox1;

    .line 200
    .line 201
    invoke-virtual {v0}, Lxz0;->d()Ld94;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-virtual {v5, v10}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    sget-object v5, Lvd4;->a:Lq06;

    .line 210
    .line 211
    invoke-virtual {v0}, Lxz0;->g()V

    .line 212
    .line 213
    .line 214
    iget-object v10, v0, Lxz0;->e:Lyv6;

    .line 215
    .line 216
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v10}, Lq06;->a(Ljava/lang/Object;)Lt06;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    sget-object v5, Lpc;->d:Lox1;

    .line 224
    .line 225
    iget-object v10, v0, Lxz0;->g:Lj73;

    .line 226
    .line 227
    invoke-virtual {v5, v10}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    sget-object v5, Lpc;->e:Lox1;

    .line 232
    .line 233
    iget-object v10, v0, Lxz0;->h:Lpf6;

    .line 234
    .line 235
    invoke-virtual {v5, v10}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    sget-object v5, Ly01;->v:Lox1;

    .line 240
    .line 241
    invoke-virtual {v3, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    if-nez v10, :cond_e

    .line 250
    .line 251
    if-ne v15, v9, :cond_f

    .line 252
    .line 253
    :cond_e
    new-instance v15, Ly0;

    .line 254
    .line 255
    const/16 v10, 0x12

    .line 256
    .line 257
    invoke-direct {v15, v0, v10}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v15}, Llp2;->g0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_f
    check-cast v15, Lgn2;

    .line 264
    .line 265
    invoke-virtual {v5, v15}, Lq06;->c(Lgn2;)Lt06;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    sget-object v5, Lpc;->b:Lox1;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    invoke-virtual {v5, v10}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 276
    .line 277
    .line 278
    move-result-object v16

    .line 279
    sget-object v5, Lre3;->a:Lox1;

    .line 280
    .line 281
    invoke-virtual {v5, v8}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    sget-object v5, Lpc;->a:Lox1;

    .line 286
    .line 287
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getConfiguration()Landroid/content/res/Configuration;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-virtual {v5, v8}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 292
    .line 293
    .line 294
    move-result-object v18

    .line 295
    sget-object v5, Lmv6;->a:Lox1;

    .line 296
    .line 297
    invoke-virtual {v3, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    if-nez v8, :cond_10

    .line 306
    .line 307
    if-ne v10, v9, :cond_11

    .line 308
    .line 309
    :cond_10
    new-instance v10, Llb;

    .line 310
    .line 311
    const/4 v8, 0x3

    .line 312
    invoke-direct {v10, v1, v8}, Llb;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_11
    check-cast v10, Lgn2;

    .line 319
    .line 320
    invoke-virtual {v5, v10}, Lq06;->c(Lgn2;)Lt06;

    .line 321
    .line 322
    .line 323
    move-result-object v19

    .line 324
    sget-object v5, Lpc;->f:Lox1;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-virtual {v5, v8}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 331
    .line 332
    .line 333
    move-result-object v20

    .line 334
    sget-object v5, Ly01;->x:Lox1;

    .line 335
    .line 336
    invoke-virtual {v3, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    invoke-virtual {v3}, Llp2;->K()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    if-nez v8, :cond_12

    .line 345
    .line 346
    if-ne v10, v9, :cond_13

    .line 347
    .line 348
    :cond_12
    new-instance v10, Llb;

    .line 349
    .line 350
    invoke-direct {v10, v1, v6}, Llb;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3, v10}, Llp2;->g0(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :cond_13
    check-cast v10, Lgn2;

    .line 357
    .line 358
    invoke-virtual {v5, v10}, Lq06;->c(Lgn2;)Lt06;

    .line 359
    .line 360
    .line 361
    move-result-object v21

    .line 362
    sget-object v5, Ly01;->t:Lox1;

    .line 363
    .line 364
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewConfiguration()Lfw8;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-virtual {v5, v6}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 369
    .line 370
    .line 371
    move-result-object v22

    .line 372
    sget-object v5, Lz03;->a:Lox1;

    .line 373
    .line 374
    invoke-virtual {v5, v7}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 375
    .line 376
    .line 377
    move-result-object v23

    .line 378
    filled-new-array/range {v11 .. v23}, [Lt06;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    new-instance v6, Lvz0;

    .line 383
    .line 384
    invoke-direct {v6, v1, v0, v2}, Lvz0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lxz0;Lzy0;)V

    .line 385
    .line 386
    .line 387
    const v7, 0x4e86c15f

    .line 388
    .line 389
    .line 390
    invoke-static {v7, v6, v3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    const/16 v7, 0x38

    .line 395
    .line 396
    invoke-static {v5, v6, v3, v7}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_14
    invoke-virtual {v3}, Llp2;->Q()V

    .line 401
    .line 402
    .line 403
    :goto_8
    invoke-virtual {v3}, Llp2;->r()Lj86;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    if-eqz v3, :cond_15

    .line 408
    .line 409
    new-instance v5, Lvz0;

    .line 410
    .line 411
    invoke-direct {v5, v0, v1, v2, v4}, Lvz0;-><init>(Lxz0;Landroidx/compose/ui/platform/AndroidComposeView;Lzy0;I)V

    .line 412
    .line 413
    .line 414
    iput-object v5, v3, Lj86;->d:Lrn2;

    .line 415
    .line 416
    :cond_15
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Lxz0;->v:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lxz0;->v:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lxz0;->v:I

    .line 11
    .line 12
    :cond_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lxz0;->a:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lxz0;->y:Lwz0;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lxz0;->t:Ly74;

    .line 26
    .line 27
    iget-object v1, p0, Ly74;->b:Lrh5;

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Ly74;->a:Ldn2;

    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final c()Lm01;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxz0;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxz0;->c:Lm01;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Ld94;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxz0;->g()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxz0;->d:Ld94;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public final e()V
    .locals 5

    .line 1
    iget v0, p0, Lxz0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lxz0;->v:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lxz0;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lxz0;->y:Lwz0;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, v1}, Lxz0;->f(Landroid/content/res/Configuration;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v3, p0, Lxz0;->t:Ly74;

    .line 36
    .line 37
    iget-object v4, v3, Ly74;->c:Lrh5;

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v4, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v3, Ly74;->b:Lrh5;

    .line 47
    .line 48
    iget-object p0, p0, Lxz0;->w:Lo7;

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    iput-object p0, v3, Ly74;->a:Ldn2;

    .line 53
    .line 54
    :cond_0
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lo7;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v2}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final f(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxz0;->i:Landroid/content/res/Configuration;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v1, p0, Lxz0;->g:Lj73;

    .line 10
    .line 11
    iget-object v1, v1, Lj73;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lh73;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget v2, v2, Lh73;->b:I

    .line 48
    .line 49
    invoke-static {v0, v2}, Landroid/content/res/Configuration;->needNewResources(II)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget-object v1, p0, Lxz0;->j:Ly05;

    .line 60
    .line 61
    new-instance v2, Landroid/content/res/Configuration;

    .line 62
    .line 63
    invoke-direct {v2, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v2}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lxz0;->h:Lpf6;

    .line 70
    .line 71
    monitor-enter p1

    .line 72
    :try_start_0
    iget-object v1, p1, Lpf6;->a:Lvz4;

    .line 73
    .line 74
    invoke-virtual {v1}, Lvz4;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    monitor-exit p1

    .line 78
    const/high16 p1, 0x10000000

    .line 79
    .line 80
    and-int/2addr p1, v0

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Lxz0;->p:Ly05;

    .line 84
    .line 85
    iget-object v1, p0, Lxz0;->a:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, Lw45;->C(Landroid/content/Context;)Lhi2;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {p1, v1}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    const p1, 0x2fff1d80

    .line 99
    .line 100
    .line 101
    and-int/2addr p1, v0

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    iget-object p1, p0, Lxz0;->t:Ly74;

    .line 105
    .line 106
    iget-object p0, p0, Lxz0;->w:Lo7;

    .line 107
    .line 108
    iget-object p1, p1, Ly74;->b:Lrh5;

    .line 109
    .line 110
    if-eqz p1, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0}, Lo7;->invoke()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p1, p0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    monitor-exit p1

    .line 122
    throw p0

    .line 123
    :cond_4
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lxz0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lxz0;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Lxz0;->c:Lm01;

    .line 9
    .line 10
    iget-object v1, p0, Lxz0;->a:Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    invoke-static {v1}, Lq29;->a(Landroid/view/View;)Lm01;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    instance-of v3, v2, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast v2, Landroid/view/View;

    .line 32
    .line 33
    invoke-static {v2}, Lq29;->a(Landroid/view/View;)Lm01;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v2}, Lts7;->d(Landroid/view/View;)Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v1}, Lq29;->b(Landroid/view/View;)Lp86;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    iput-object v0, p0, Lxz0;->c:Lm01;

    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Lxz0;->d:Ld94;

    .line 51
    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    invoke-static {v1}, Lus7;->b(Landroid/view/View;)Ld94;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iput-object v0, p0, Lxz0;->d:Ld94;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const-string p0, "Composed into a View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 64
    .line 65
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    :goto_2
    iget-object v0, p0, Lxz0;->e:Lyv6;

    .line 70
    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    invoke-static {v1}, Lys7;->d(Landroid/view/View;)Lyv6;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    iput-object v0, p0, Lxz0;->e:Lyv6;

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    const-string p0, "Composed into a View which doesn\'t propagate ViewTreeSavedStateRegistryOwner!"

    .line 83
    .line 84
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_7
    :goto_3
    iget-object v0, p0, Lxz0;->f:Lfx8;

    .line 89
    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    invoke-static {v1}, Lgs8;->j(Landroid/view/View;)Lfx8;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lxz0;->f:Lfx8;

    .line 97
    .line 98
    :cond_8
    return-void
.end method
