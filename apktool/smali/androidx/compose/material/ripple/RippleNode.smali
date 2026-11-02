.class public abstract Landroidx/compose/material/ripple/RippleNode;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Lrv1;
.implements Lw24;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008 \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/material/ripple/RippleNode;",
        "Ljx4;",
        "Ls01;",
        "Lrv1;",
        "Lw24;",
        "Lfw0;",
        "color",
        "Lfw0;",
        "material-ripple_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final color:Lfw0;

.field public final q0:Lxz4;

.field public final r0:Z

.field public final s0:F

.field public final t0:Landroidx/compose/material3/a;

.field public u0:Lwg;

.field public v0:F

.field public w0:J

.field public x0:Z

.field public final y0:Lj05;


# direct methods
.method public constructor <init>(Lxz4;ZFLandroidx/compose/material3/b;Landroidx/compose/material3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->q0:Lxz4;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/material/ripple/RippleNode;->r0:Z

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/material/ripple/RippleNode;->s0:F

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/material/ripple/RippleNode;->color:Lfw0;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/material/ripple/RippleNode;->t0:Landroidx/compose/material3/a;

    .line 13
    .line 14
    const-wide/16 p1, 0x0

    .line 15
    .line 16
    iput-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->w0:J

    .line 17
    .line 18
    new-instance p1, Lj05;

    .line 19
    .line 20
    invoke-direct {p1}, Lj05;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->y0:Lj05;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljy2;

    .line 6
    .line 7
    const/16 v2, 0x18

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v3, v2}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Y0(Lht5;)V
    .locals 11

    .line 1
    instance-of v0, p1, Lft5;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, Lft5;

    .line 7
    .line 8
    iget-wide v4, p0, Landroidx/compose/material/ripple/RippleNode;->w0:J

    .line 9
    .line 10
    iget p1, p0, Landroidx/compose/material/ripple/RippleNode;->v0:F

    .line 11
    .line 12
    check-cast p0, Lig;

    .line 13
    .line 14
    iget-object v0, p0, Lig;->z0:Lel6;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    sget-object v0, Lpc;->f:Lox1;

    .line 21
    .line 22
    invoke-static {p0, v0}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    :goto_0
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    move-object v3, v0

    .line 33
    check-cast v3, Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    instance-of v6, v3, Landroid/view/View;

    .line 40
    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    move-object v0, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string p0, "Couldn\'t find a valid parent for "

    .line 46
    .line 47
    const-string p1, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    .line 48
    .line 49
    invoke-static {p0, v0, p1}, Lem7;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    check-cast v0, Landroid/view/ViewGroup;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    move v6, v1

    .line 60
    :goto_1
    if-ge v6, v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    instance-of v8, v7, Lel6;

    .line 67
    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    check-cast v7, Lel6;

    .line 71
    .line 72
    move-object v0, v7

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    new-instance v3, Lel6;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-direct {v3, v6}, Lel6;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    move-object v0, v3

    .line 90
    :goto_2
    iput-object v0, p0, Lig;->z0:Lel6;

    .line 91
    .line 92
    :goto_3
    iget-object v3, v0, Lel6;->g0:Ljava/util/ArrayList;

    .line 93
    .line 94
    iget-object v6, v0, Lel6;->i0:Lxd6;

    .line 95
    .line 96
    iget-object v7, v6, Lxd6;->Y:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    iget-object v8, v6, Lxd6;->Y:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    iget-object v6, v6, Lxd6;->Z:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-virtual {v7, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Lgl6;

    .line 113
    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_5
    iget-object v7, v0, Lel6;->h0:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    const/4 v10, 0x0

    .line 127
    if-eqz v9, :cond_6

    .line 128
    .line 129
    move-object v7, v10

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    :goto_4
    check-cast v7, Lgl6;

    .line 136
    .line 137
    if-nez v7, :cond_b

    .line 138
    .line 139
    iget v7, v0, Lel6;->j0:I

    .line 140
    .line 141
    invoke-static {v3}, Li21;->G(Ljava/util/List;)I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    if-le v7, v9, :cond_7

    .line 146
    .line 147
    new-instance v7, Lgl6;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-direct {v7, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    iget v7, v0, Lel6;->j0:I

    .line 164
    .line 165
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object v7, v3

    .line 170
    check-cast v7, Lgl6;

    .line 171
    .line 172
    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lig;

    .line 177
    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    iput-object v10, v3, Lig;->A0:Lgl6;

    .line 181
    .line 182
    invoke-static {v3}, Lz68;->W(Lrv1;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    check-cast v9, Lgl6;

    .line 190
    .line 191
    if-eqz v9, :cond_8

    .line 192
    .line 193
    invoke-interface {v6, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    check-cast v9, Lig;

    .line 198
    .line 199
    :cond_8
    invoke-interface {v8, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7}, Lgl6;->c()V

    .line 203
    .line 204
    .line 205
    :cond_9
    :goto_5
    iget v3, v0, Lel6;->j0:I

    .line 206
    .line 207
    iget-byte v9, v0, Lel6;->f0:B

    .line 208
    .line 209
    add-int/lit8 v9, v9, -0x1

    .line 210
    .line 211
    if-ge v3, v9, :cond_a

    .line 212
    .line 213
    add-int/lit8 v3, v3, 0x1

    .line 214
    .line 215
    iput v3, v0, Lel6;->j0:I

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_a
    iput v1, v0, Lel6;->j0:I

    .line 219
    .line 220
    :cond_b
    :goto_6
    invoke-interface {v8, p0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-interface {v6, v7, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    :goto_7
    invoke-static {p1}, Lnr4;->O(F)I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    iget-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->color:Lfw0;

    .line 231
    .line 232
    invoke-interface {p1}, Lfw0;->a()J

    .line 233
    .line 234
    .line 235
    move-result-wide v8

    .line 236
    iget-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->t0:Landroidx/compose/material3/a;

    .line 237
    .line 238
    invoke-virtual {p1}, Landroidx/compose/material3/a;->invoke()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move p1, v1

    .line 242
    move-object v1, v7

    .line 243
    move-wide v7, v8

    .line 244
    new-instance v9, Lhg;

    .line 245
    .line 246
    invoke-direct {v9, p0, p1}, Lhg;-><init>(Ljava/lang/Object;B)V

    .line 247
    .line 248
    .line 249
    iget-boolean v3, p0, Landroidx/compose/material/ripple/RippleNode;->r0:Z

    .line 250
    .line 251
    invoke-virtual/range {v1 .. v9}, Lgl6;->b(Lft5;ZJIJLhg;)V

    .line 252
    .line 253
    .line 254
    iput-object v1, p0, Lig;->A0:Lgl6;

    .line 255
    .line 256
    invoke-static {p0}, Lz68;->W(Lrv1;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_c
    instance-of v0, p1, Lgt5;

    .line 261
    .line 262
    if-eqz v0, :cond_d

    .line 263
    .line 264
    check-cast p0, Lig;

    .line 265
    .line 266
    iget-object p0, p0, Lig;->A0:Lgl6;

    .line 267
    .line 268
    if-eqz p0, :cond_e

    .line 269
    .line 270
    invoke-virtual {p0}, Lgl6;->d()V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_d
    instance-of p1, p1, Let5;

    .line 275
    .line 276
    if-eqz p1, :cond_e

    .line 277
    .line 278
    check-cast p0, Lig;

    .line 279
    .line 280
    iget-object p0, p0, Lig;->A0:Lgl6;

    .line 281
    .line 282
    if-eqz p0, :cond_e

    .line 283
    .line 284
    invoke-virtual {p0}, Lgl6;->d()V

    .line 285
    .line 286
    .line 287
    :cond_e
    return-void
.end method

.method public final a(J)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/material/ripple/RippleNode;->x0:Z

    .line 3
    .line 4
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 9
    .line 10
    invoke-static {p1, p2}, Lu15;->R(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->w0:J

    .line 15
    .line 16
    iget p1, p0, Landroidx/compose/material/ripple/RippleNode;->s0:F

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-wide p1, p0, Landroidx/compose/material/ripple/RippleNode;->w0:J

    .line 25
    .line 26
    invoke-static {p1, p2}, Lua7;->d(J)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {p1, p2}, Lua7;->b(J)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    int-to-long v1, p2

    .line 39
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    int-to-long p1, p1

    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    shl-long/2addr v1, v3

    .line 47
    const-wide v3, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long/2addr p1, v3

    .line 53
    or-long/2addr p1, v1

    .line 54
    invoke-static {p1, p2}, Lz85;->c(J)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/high16 p2, 0x40000000    # 2.0f

    .line 59
    .line 60
    div-float/2addr p1, p2

    .line 61
    iget-boolean p2, p0, Landroidx/compose/material/ripple/RippleNode;->r0:Z

    .line 62
    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    const/high16 p2, 0x41200000    # 10.0f

    .line 66
    .line 67
    invoke-interface {v0, p2}, Lfi1;->h0(F)F

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    add-float/2addr p1, p2

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-interface {v0, p1}, Lfi1;->h0(F)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    :cond_1
    :goto_0
    iput p1, p0, Landroidx/compose/material/ripple/RippleNode;->v0:F

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/compose/material/ripple/RippleNode;->y0:Lj05;

    .line 80
    .line 81
    iget-object p2, p1, Lj05;->a:[Ljava/lang/Object;

    .line 82
    .line 83
    iget v0, p1, Lj05;->b:I

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    :goto_1
    if-ge v1, v0, :cond_2

    .line 87
    .line 88
    aget-object v2, p2, v1

    .line 89
    .line 90
    check-cast v2, Lht5;

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Landroidx/compose/material/ripple/RippleNode;->Y0(Lht5;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {p1}, Lj05;->d()V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 14

    .line 1
    iget-object v0, p1, Lp34;->X:Lum0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lp34;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleNode;->u0:Lwg;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget v5, p0, Landroidx/compose/material/ripple/RippleNode;->v0:F

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/material/ripple/RippleNode;->color:Lfw0;

    .line 13
    .line 14
    invoke-interface {v2}, Lfw0;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-object v4, v1, Lwg;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Loi;

    .line 21
    .line 22
    invoke-virtual {v4}, Loi;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v6, 0x0

    .line 33
    cmpl-float v6, v4, v6

    .line 34
    .line 35
    if-lez v6, :cond_1

    .line 36
    .line 37
    invoke-static {v4, v2, v3}, Ldw0;->b(FJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-boolean v1, v1, Lwg;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Lsv1;->e()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-static {v1, v2}, Lua7;->d(J)F

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-interface {v0}, Lsv1;->e()J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-static {v1, v2}, Lua7;->b(J)F

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    iget-object v1, v0, Lum0;->Y:Llr;

    .line 62
    .line 63
    invoke-virtual {v1}, Llr;->p()J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    invoke-virtual {v1}, Llr;->k()Lsm0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, Lsm0;->g()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v2, v1, Llr;->Y:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lwl6;

    .line 77
    .line 78
    iget-object v2, v2, Lwl6;->Y:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Llr;

    .line 81
    .line 82
    invoke-virtual {v2}, Llr;->k()Lsm0;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v11, 0x1

    .line 89
    invoke-interface/range {v6 .. v11}, Lsm0;->m(FFFFI)V

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    const/16 v9, 0x7c

    .line 94
    .line 95
    const-wide/16 v6, 0x0

    .line 96
    .line 97
    move-object v2, p1

    .line 98
    invoke-static/range {v2 .. v9}, Lsv1;->o0(Lsv1;JFJLtv1;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v12, v13}, Lp61;->w(Llr;J)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    move-object p0, v0

    .line 107
    invoke-static {v1, v12, v13}, Lp61;->w(Llr;J)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_0
    move-object v2, p1

    .line 112
    const/4 v8, 0x0

    .line 113
    const/16 v9, 0x7c

    .line 114
    .line 115
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    invoke-static/range {v2 .. v9}, Lsv1;->o0(Lsv1;JFJLtv1;I)V

    .line 118
    .line 119
    .line 120
    :cond_1
    :goto_0
    check-cast p0, Lig;

    .line 121
    .line 122
    iget-object p1, v0, Lum0;->Y:Llr;

    .line 123
    .line 124
    invoke-virtual {p1}, Llr;->k()Lsm0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, Lig;->A0:Lgl6;

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    iget-wide v2, p0, Landroidx/compose/material/ripple/RippleNode;->w0:J

    .line 133
    .line 134
    iget v1, p0, Landroidx/compose/material/ripple/RippleNode;->v0:F

    .line 135
    .line 136
    invoke-static {v1}, Lnr4;->O(F)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    iget-object v4, p0, Landroidx/compose/material/ripple/RippleNode;->color:Lfw0;

    .line 141
    .line 142
    invoke-interface {v4}, Lfw0;->a()J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    iget-object p0, p0, Landroidx/compose/material/ripple/RippleNode;->t0:Landroidx/compose/material3/a;

    .line 147
    .line 148
    invoke-virtual {p0}, Landroidx/compose/material3/a;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v0 .. v5}, Lgl6;->e(IJJ)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1}, Lfb;->b(Lsm0;)Landroid/graphics/Canvas;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {v0, p0}, Lgl6;->draw(Landroid/graphics/Canvas;)V

    .line 159
    .line 160
    .line 161
    :cond_2
    return-void
.end method
