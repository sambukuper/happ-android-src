.class public final Lx53;
.super Lhq8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final A:Lu53;


# instance fields
.field public final q:I

.field public final r:Ljava/util/concurrent/atomic/AtomicReference;

.field public final s:I

.field public t:Landroid/util/Rational;

.field public final u:Lix6;

.field public v:Lb57;

.field public w:Lf63;

.field public x:Lg18;

.field public y:Lc57;

.field public final z:Lk42;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu53;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx53;->A:Lu53;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ly53;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lhq8;-><init>(Ler8;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lx53;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lx53;->s:I

    .line 14
    .line 15
    iput-object v0, p0, Lx53;->t:Landroid/util/Rational;

    .line 16
    .line 17
    new-instance p1, Lk42;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lx53;->z:Lk42;

    .line 23
    .line 24
    iget-object p1, p0, Lhq8;->h:Ler8;

    .line 25
    .line 26
    check-cast p1, Ly53;

    .line 27
    .line 28
    sget-object v1, Ly53;->Y:Lzx;

    .line 29
    .line 30
    invoke-interface {p1, v1}, Lb76;->h(Lzx;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lx53;->q:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v1, 0x1

    .line 50
    iput v1, p0, Lx53;->q:I

    .line 51
    .line 52
    :goto_0
    sget-object v1, Ly53;->j0:Lzx;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {p1, v1, v2}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v1, Ly53;->k0:Lzx;

    .line 69
    .line 70
    invoke-interface {p1, v1, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lv53;

    .line 75
    .line 76
    new-instance v0, Lix6;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Lix6;-><init>(Lv53;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lx53;->u:Lix6;

    .line 82
    .line 83
    return-void
.end method

.method public static L(ILjava/util/List;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method


# virtual methods
.method public final A(Liz;Liz;)Liz;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const-string p2, "ImageCapture"

    .line 8
    .line 9
    invoke-static {p2}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lhq8;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iget-object v0, p0, Lhq8;->h:Ler8;

    .line 17
    .line 18
    check-cast v0, Ly53;

    .line 19
    .line 20
    invoke-virtual {p0, p2, v0, p1}, Lx53;->J(Ljava/lang/String;Ly53;Liz;)Lb57;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lx53;->v:Lb57;

    .line 25
    .line 26
    invoke-virtual {p2}, Lb57;->c()Lf57;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aget-object p2, p2, v1

    .line 42
    .line 43
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p0, p2}, Lhq8;->G(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lhq8;->q()V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx53;->u:Lix6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lix6;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lix6;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lx53;->x:Lg18;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lg18;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lx53;->I(Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0}, Lhq8;->e()Lqh0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0, v0}, Lqh0;->e(Lv53;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final I(Z)V
    .locals 2

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx53;->y:Lc57;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lc57;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lx53;->y:Lc57;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lx53;->w:Lf63;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lf63;->l()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lx53;->w:Lf63;

    .line 22
    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lx53;->x:Lg18;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Lg18;->a()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lx53;->x:Lg18;

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0}, Lhq8;->e()Lqh0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Lqh0;->a()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final J(Ljava/lang/String;Ly53;Liz;)Lb57;
    .locals 12

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {}, Ls08;->b()V

    .line 7
    .line 8
    .line 9
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    iget-object v1, p3, Liz;->a:Landroid/util/Size;

    .line 13
    .line 14
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-interface {v2}, Lcj0;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    xor-int/2addr v2, v3

    .line 27
    iget-object v4, p0, Lx53;->w:Lf63;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-static {v5, v2}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    iget-object v4, p0, Lx53;->w:Lf63;

    .line 36
    .line 37
    invoke-virtual {v4}, Lf63;->l()V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Lcj0;->c()Lxi0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v6, 0x3

    .line 49
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    instance-of v8, v4, La7;

    .line 58
    .line 59
    const/16 v9, 0x1005

    .line 60
    .line 61
    if-nez v8, :cond_2

    .line 62
    .line 63
    :cond_1
    :goto_0
    move-object v11, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v8, v4

    .line 66
    check-cast v8, La7;

    .line 67
    .line 68
    iget-object v8, v8, La7;->Z:Lih0;

    .line 69
    .line 70
    sget-object v10, Lih0;->c:Lzx;

    .line 71
    .line 72
    sget-object v11, Lhr8;->a:Lfr8;

    .line 73
    .line 74
    invoke-interface {v8, v10, v11}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    check-cast v8, Lhr8;

    .line 79
    .line 80
    sget-object v10, Lgr8;->X:Lgr8;

    .line 81
    .line 82
    invoke-interface {v8, v10, v3}, Lhr8;->a(Lgr8;I)Ll11;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    sget-object v10, Li63;->z:Lzx;

    .line 89
    .line 90
    check-cast v8, Lqd5;

    .line 91
    .line 92
    iget-object v11, v8, Lqd5;->X:Ljava/util/TreeMap;

    .line 93
    .line 94
    invoke-virtual {v11, v10}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-nez v11, :cond_3

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    new-instance v11, Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v10}, Lqd5;->d(Lzx;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_5

    .line 124
    .line 125
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    check-cast v10, Landroid/util/Pair;

    .line 130
    .line 131
    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v10, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-ne v10, v9, :cond_4

    .line 140
    .line 141
    invoke-virtual {v11, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_5
    :goto_1
    const/4 v8, 0x2

    .line 145
    if-eqz v11, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    new-instance v11, Ljava/util/HashSet;

    .line 149
    .line 150
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    move-object v10, v4

    .line 159
    check-cast v10, Laj0;

    .line 160
    .line 161
    invoke-interface {v10}, Laj0;->w()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    goto :goto_2

    .line 174
    :cond_7
    move v9, p1

    .line 175
    :goto_2
    if-eqz v9, :cond_8

    .line 176
    .line 177
    invoke-virtual {v11, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_8
    if-eqz v4, :cond_9

    .line 181
    .line 182
    check-cast v4, Laj0;

    .line 183
    .line 184
    invoke-interface {v4}, Laj0;->v()Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-nez v7, :cond_a

    .line 193
    .line 194
    :cond_9
    move v4, p1

    .line 195
    goto :goto_3

    .line 196
    :cond_a
    invoke-interface {v4}, Laj0;->w()Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    const/16 v7, 0x20

    .line 201
    .line 202
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    :goto_3
    if-eqz v4, :cond_b

    .line 211
    .line 212
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v11, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    :cond_b
    :goto_4
    iget-object v4, p0, Lhq8;->h:Ler8;

    .line 223
    .line 224
    sget-object v6, Ly53;->g0:Lzx;

    .line 225
    .line 226
    invoke-interface {v4, v6, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-interface {v11, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    new-instance v7, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    const-string v9, "The specified output format ("

    .line 242
    .line 243
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iget-object v9, p0, Lhq8;->h:Ler8;

    .line 247
    .line 248
    invoke-interface {v9, v6, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v0, ") is not supported by current configuration. Supported output formats: "

    .line 265
    .line 266
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v4, v0}, Lmb6;->o(ZLjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, p0, Lhq8;->h:Ler8;

    .line 280
    .line 281
    sget-object v4, Ly53;->l0:Lzx;

    .line 282
    .line 283
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    invoke-interface {v0, v4, v6}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/Boolean;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_c

    .line 296
    .line 297
    invoke-virtual {p2}, Ly53;->n()I

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-interface {v0}, Lcj0;->h()Lih0;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-interface {v0}, Lih0;->u()V

    .line 309
    .line 310
    .line 311
    :cond_c
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v0, :cond_d

    .line 316
    .line 317
    :try_start_0
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-interface {v0}, Lcj0;->s()Laj0;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-interface {v0}, Laj0;->o()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    instance-of v4, v0, Landroid/hardware/camera2/CameraCharacteristics;

    .line 330
    .line 331
    if-eqz v4, :cond_d

    .line 332
    .line 333
    check-cast v0, Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    .line 335
    move-object v5, v0

    .line 336
    :catch_0
    :cond_d
    new-instance v0, Lf63;

    .line 337
    .line 338
    invoke-direct {v0, p2, v1, v5, v2}, Lf63;-><init>(Ly53;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Z)V

    .line 339
    .line 340
    .line 341
    iput-object v0, p0, Lx53;->w:Lf63;

    .line 342
    .line 343
    iget-object p2, p0, Lx53;->x:Lg18;

    .line 344
    .line 345
    if-nez p2, :cond_e

    .line 346
    .line 347
    iget-object p2, p0, Lhq8;->h:Ler8;

    .line 348
    .line 349
    sget-object v0, Ler8;->d0:Lzx;

    .line 350
    .line 351
    new-instance v1, Lcr8;

    .line 352
    .line 353
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-interface {p2, v0, v1}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p2

    .line 360
    check-cast p2, Lcr8;

    .line 361
    .line 362
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    iget-object p2, p0, Lx53;->z:Lk42;

    .line 366
    .line 367
    new-instance v0, Lg18;

    .line 368
    .line 369
    invoke-direct {v0, p2}, Lg18;-><init>(Lk42;)V

    .line 370
    .line 371
    .line 372
    iput-object v0, p0, Lx53;->x:Lg18;

    .line 373
    .line 374
    move-object p2, v0

    .line 375
    :cond_e
    iget-object v0, p0, Lx53;->w:Lf63;

    .line 376
    .line 377
    invoke-static {}, Ls08;->b()V

    .line 378
    .line 379
    .line 380
    iput-object v0, p2, Lg18;->Y:Lf63;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-static {}, Ls08;->b()V

    .line 386
    .line 387
    .line 388
    iget-object v0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Llr;

    .line 391
    .line 392
    invoke-static {}, Ls08;->b()V

    .line 393
    .line 394
    .line 395
    iget-object v1, v0, Llr;->Y:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v1, Lz76;

    .line 398
    .line 399
    if-eqz v1, :cond_f

    .line 400
    .line 401
    move v1, v3

    .line 402
    goto :goto_5

    .line 403
    :cond_f
    move v1, p1

    .line 404
    :goto_5
    const-string v2, "The ImageReader is not initialized."

    .line 405
    .line 406
    invoke-static {v2, v1}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 407
    .line 408
    .line 409
    iget-object v0, v0, Llr;->Y:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, Lz76;

    .line 412
    .line 413
    iget-object v1, v0, Lz76;->Z:Ljava/lang/Object;

    .line 414
    .line 415
    monitor-enter v1

    .line 416
    :try_start_1
    iput-object p2, v0, Lz76;->h0:Ljava/lang/Object;

    .line 417
    .line 418
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 419
    iget-object p2, p0, Lx53;->w:Lf63;

    .line 420
    .line 421
    iget-object v0, p3, Liz;->a:Landroid/util/Size;

    .line 422
    .line 423
    iget-object v1, p2, Lf63;->Y:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v1, Ly53;

    .line 426
    .line 427
    invoke-static {v1, v0}, Lb57;->d(Ler8;Landroid/util/Size;)Lb57;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    iget-object p2, p2, Lf63;->f0:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast p2, Lxx;

    .line 434
    .line 435
    iget-object v1, p2, Lxx;->a:Lv73;

    .line 436
    .line 437
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    sget-object v2, Lpx1;->d:Lpx1;

    .line 441
    .line 442
    invoke-static {v1}, Lfz;->a(Lwg1;)Ly5;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iput-object v2, v1, Ly5;->h0:Ljava/lang/Object;

    .line 447
    .line 448
    invoke-virtual {v1}, Ly5;->u()Lfz;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iget-object v4, v0, La57;->a:Ljava/util/LinkedHashSet;

    .line 453
    .line 454
    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    iget-object v1, p2, Lxx;->f:Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-le v1, v3, :cond_10

    .line 464
    .line 465
    iget-object v1, p2, Lxx;->b:Lv73;

    .line 466
    .line 467
    if-eqz v1, :cond_10

    .line 468
    .line 469
    invoke-static {v1}, Lfz;->a(Lwg1;)Ly5;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    iput-object v2, v1, Ly5;->h0:Ljava/lang/Object;

    .line 474
    .line 475
    invoke-virtual {v1}, Ly5;->u()Lfz;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    iget-object v2, v0, La57;->a:Ljava/util/LinkedHashSet;

    .line 480
    .line 481
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    :cond_10
    iget-object p2, p2, Lxx;->c:Lv73;

    .line 485
    .line 486
    if-eqz p2, :cond_11

    .line 487
    .line 488
    invoke-static {p2}, Lfz;->a(Lwg1;)Ly5;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    invoke-virtual {p2}, Ly5;->u()Lfz;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    iput-object p2, v0, La57;->i:Lfz;

    .line 497
    .line 498
    :cond_11
    iget p2, p3, Liz;->d:I

    .line 499
    .line 500
    iput p2, v0, La57;->h:I

    .line 501
    .line 502
    iget p2, p0, Lx53;->q:I

    .line 503
    .line 504
    if-ne p2, v8, :cond_12

    .line 505
    .line 506
    iget-boolean p2, p3, Liz;->g:Z

    .line 507
    .line 508
    if-nez p2, :cond_12

    .line 509
    .line 510
    invoke-virtual {p0}, Lhq8;->e()Lqh0;

    .line 511
    .line 512
    .line 513
    move-result-object p2

    .line 514
    invoke-interface {p2, v0}, Lqh0;->b(Lb57;)V

    .line 515
    .line 516
    .line 517
    :cond_12
    iget-object p2, p3, Liz;->f:Ll11;

    .line 518
    .line 519
    if-eqz p2, :cond_13

    .line 520
    .line 521
    iget-object p3, v0, La57;->b:Lxm0;

    .line 522
    .line 523
    invoke-virtual {p3, p2}, Lxm0;->d(Ll11;)V

    .line 524
    .line 525
    .line 526
    :cond_13
    iget-object p2, p0, Lx53;->y:Lc57;

    .line 527
    .line 528
    if-eqz p2, :cond_14

    .line 529
    .line 530
    invoke-virtual {p2}, Lc57;->b()V

    .line 531
    .line 532
    .line 533
    :cond_14
    new-instance p2, Lc57;

    .line 534
    .line 535
    new-instance p3, Lt53;

    .line 536
    .line 537
    invoke-direct {p3, p0, p1}, Lt53;-><init>(Ljava/lang/Object;B)V

    .line 538
    .line 539
    .line 540
    invoke-direct {p2, p3}, Lc57;-><init>(Ld57;)V

    .line 541
    .line 542
    .line 543
    iput-object p2, p0, Lx53;->y:Lc57;

    .line 544
    .line 545
    iput-object p2, v0, La57;->f:Lc57;

    .line 546
    .line 547
    return-object v0

    .line 548
    :catchall_0
    move-exception p0

    .line 549
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 550
    throw p0
.end method

.method public final K()I
    .locals 3

    .line 1
    iget-object v0, p0, Lx53;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lx53;->s:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lhq8;->h:Ler8;

    .line 11
    .line 12
    check-cast p0, Ly53;

    .line 13
    .line 14
    sget-object v1, Ly53;->Z:Lzx;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {p0, v1, v2}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    return v1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method

.method public final g(ZLhr8;)Ler8;
    .locals 3

    .line 1
    sget-object v0, Lx53;->A:Lu53;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu53;->a:Ly53;

    .line 7
    .line 8
    invoke-interface {v0}, Ler8;->s()Lgr8;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, p0, Lx53;->q:I

    .line 13
    .line 14
    invoke-interface {p2, v1, v2}, Lhr8;->a(Lgr8;I)Ll11;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {p2, v0}, Ll11;->q(Ll11;Ll11;)Lqd5;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_0
    if-nez p2, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-virtual {p0, p2}, Lx53;->m(Ll11;)Ldr8;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lh53;

    .line 33
    .line 34
    new-instance p1, Ly53;

    .line 35
    .line 36
    iget-object p0, p0, Lh53;->Y:Lk05;

    .line 37
    .line 38
    invoke-static {p0}, Lqd5;->c(Ll11;)Lqd5;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, Ly53;-><init>(Lqd5;)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final m(Ll11;)Ldr8;
    .locals 1

    .line 1
    new-instance p0, Lh53;

    .line 2
    .line 3
    invoke-static {p1}, Lk05;->k(Ll11;)Lk05;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p1, v0}, Lh53;-><init>(Lk05;B)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Attached camera cannot be null"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lmb6;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lx53;->K()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Llg0;->c()Lxi0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lxi0;->j()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, -0x1

    .line 33
    :goto_0
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-string p0, "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"

    .line 37
    .line 38
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhq8;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ImageCapture:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final u()V
    .locals 3

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx53;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lx53;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lhq8;->e()Lqh0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Lx53;->K()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {v1, v2}, Lqh0;->d(I)V

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :goto_0
    iget-object v0, p0, Lx53;->u:Lix6;

    .line 34
    .line 35
    invoke-virtual {p0}, Lhq8;->e()Lqh0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0, v0}, Lqh0;->e(Lv53;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p0
.end method

.method public final v(Laj0;Ldr8;)Ler8;
    .locals 12

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x23

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x100

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Lhq8;->g:Ljava/util/HashSet;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    move v7, v6

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lru2;

    .line 40
    .line 41
    instance-of v9, v8, Lc63;

    .line 42
    .line 43
    if-eqz v9, :cond_0

    .line 44
    .line 45
    check-cast v8, Lc63;

    .line 46
    .line 47
    iget-boolean v7, v8, Lc63;->a:Z

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    sget-object v8, Ly53;->g0:Lzx;

    .line 55
    .line 56
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v5, v8, v7}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-interface {p1}, Laj0;->s()Li26;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-class v5, Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;

    .line 68
    .line 69
    invoke-virtual {p1, v5}, Li26;->a(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const-string v5, "ImageCapture"

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    sget-object v8, Ly53;->i0:Lzx;

    .line 84
    .line 85
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {v7, v8, v9}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {p1, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v8, v9}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    :goto_1
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 116
    .line 117
    sget-object v8, Ly53;->i0:Lzx;

    .line 118
    .line 119
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {p1, v8, v9}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-virtual {v7, v10}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    const/4 v10, 0x1

    .line 130
    const/4 v11, 0x0

    .line 131
    if-eqz v7, :cond_7

    .line 132
    .line 133
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-nez v7, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-interface {v7}, Lcj0;->h()Lih0;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v7}, Lih0;->u()V

    .line 149
    .line 150
    .line 151
    :goto_2
    sget-object v7, Ly53;->f0:Lzx;

    .line 152
    .line 153
    invoke-virtual {p1, v7, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Ljava/lang/Integer;

    .line 158
    .line 159
    if-eqz v7, :cond_6

    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-eq v7, v3, :cond_6

    .line 166
    .line 167
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    move v6, v10

    .line 172
    :goto_3
    if-nez v6, :cond_7

    .line 173
    .line 174
    invoke-static {v5}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v8, v9}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_7
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    sget-object v5, Ly53;->f0:Lzx;

    .line 185
    .line 186
    invoke-virtual {p1, v5, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    check-cast p1, Ljava/lang/Integer;

    .line 191
    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-nez v0, :cond_8

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-interface {p0}, Lcj0;->h()Lih0;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p0}, Lih0;->u()V

    .line 210
    .line 211
    .line 212
    :goto_4
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    sget-object v0, Le63;->p:Lzx;

    .line 217
    .line 218
    if-eqz v6, :cond_9

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {p0, v0, p1}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_6

    .line 233
    .line 234
    :cond_a
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    sget-object p1, Ly53;->g0:Lzx;

    .line 239
    .line 240
    invoke-virtual {p0, p1, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    const/4 v5, 0x2

    .line 245
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-static {p0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-eqz p0, :cond_b

    .line 254
    .line 255
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    sget-object p1, Le63;->p:Lzx;

    .line 260
    .line 261
    invoke-virtual {p0, p1, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_6

    .line 265
    .line 266
    :cond_b
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-virtual {p0, p1, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    const/4 v5, 0x3

    .line 275
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {p0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    if-eqz p0, :cond_c

    .line 284
    .line 285
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    sget-object p1, Le63;->p:Lzx;

    .line 290
    .line 291
    invoke-virtual {p0, p1, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    sget-object p1, Le63;->q:Lzx;

    .line 299
    .line 300
    invoke-virtual {p0, p1, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_6

    .line 304
    .line 305
    :cond_c
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0, p1, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    if-eqz p0, :cond_d

    .line 322
    .line 323
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    sget-object p1, Le63;->p:Lzx;

    .line 328
    .line 329
    const/16 v0, 0x1005

    .line 330
    .line 331
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {p0, p1, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    sget-object p1, Le63;->r:Lzx;

    .line 343
    .line 344
    sget-object v0, Lpx1;->c:Lpx1;

    .line 345
    .line 346
    invoke-virtual {p0, p1, v0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_d
    if-eqz v6, :cond_e

    .line 351
    .line 352
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    sget-object p1, Le63;->p:Lzx;

    .line 357
    .line 358
    invoke-virtual {p0, p1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_e
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    sget-object p1, Li63;->z:Lzx;

    .line 367
    .line 368
    invoke-virtual {p0, p1, v11}, Lqd5;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    check-cast p0, Ljava/util/List;

    .line 373
    .line 374
    if-nez p0, :cond_f

    .line 375
    .line 376
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    sget-object p1, Le63;->p:Lzx;

    .line 381
    .line 382
    invoke-virtual {p0, p1, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_f
    invoke-static {v3, p0}, Lx53;->L(ILjava/util/List;)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_10

    .line 391
    .line 392
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    sget-object p1, Le63;->p:Lzx;

    .line 397
    .line 398
    invoke-virtual {p0, p1, v4}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_10
    invoke-static {v1, p0}, Lx53;->L(ILjava/util/List;)Z

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    if-eqz p0, :cond_11

    .line 407
    .line 408
    invoke-interface {p2}, Lk62;->b()Lk05;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    sget-object p1, Le63;->p:Lzx;

    .line 413
    .line 414
    invoke-virtual {p0, p1, v2}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :cond_11
    :goto_6
    invoke-interface {p2}, Ldr8;->d()Ler8;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    return-object p0
.end method

.method public final w(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhq8;->h:Ler8;

    .line 2
    .line 3
    check-cast v0, Li63;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Li63;->H(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lhq8;->D(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    iget-object v1, p0, Lx53;->t:Landroid/util/Rational;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-static {v0}, Lw39;->m0(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {p1}, Lw39;->m0(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    sub-int/2addr p1, v0

    .line 29
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object v0, p0, Lx53;->t:Landroid/util/Rational;

    .line 34
    .line 35
    const/16 v1, 0x5a

    .line 36
    .line 37
    if-eq p1, v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x10e

    .line 40
    .line 41
    if-ne p1, v1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance p1, Landroid/util/Rational;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/util/Rational;->getNumerator()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0}, Landroid/util/Rational;->getDenominator()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-direct {p1, v1, v0}, Landroid/util/Rational;-><init>(II)V

    .line 55
    .line 56
    .line 57
    :goto_0
    move-object v0, p1

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    new-instance p1, Landroid/util/Rational;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/util/Rational;->getDenominator()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v0}, Landroid/util/Rational;->getNumerator()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-direct {p1, v1, v0}, Landroid/util/Rational;-><init>(II)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :goto_2
    iput-object v0, p0, Lx53;->t:Landroid/util/Rational;

    .line 77
    .line 78
    :cond_3
    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx53;->u:Lix6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lix6;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lix6;->a()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lx53;->x:Lg18;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lg18;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final z(Ll11;)Liz;
    .locals 3

    .line 1
    iget-object v0, p0, Lx53;->v:Lb57;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb57;->a(Ll11;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx53;->v:Lb57;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb57;->c()Lf57;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lhq8;->G(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lhq8;->i:Liz;

    .line 39
    .line 40
    invoke-virtual {p0}, Liz;->b()Lxy0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, Lxy0;->b()Liz;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
