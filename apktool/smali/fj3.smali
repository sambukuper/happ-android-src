.class public final Lfj3;
.super Lm85;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final Z:[Ljava/lang/Class;

.field public static final f0:[Ljava/lang/Class;


# instance fields
.field public transient X:Lc24;

.field public Y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-class v0, Lxq3;

    .line 2
    .line 3
    const-class v1, Lyq3;

    .line 4
    .line 5
    const-class v2, Les3;

    .line 6
    .line 7
    const-class v3, Loo3;

    .line 8
    .line 9
    const-class v4, Lxr3;

    .line 10
    .line 11
    const-class v5, Lqq3;

    .line 12
    .line 13
    const-class v6, Las3;

    .line 14
    .line 15
    const-class v7, Ljn3;

    .line 16
    .line 17
    const-class v8, Lmp3;

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lfj3;->Z:[Ljava/lang/Class;

    .line 24
    .line 25
    move-object v5, v3

    .line 26
    const-class v3, Lxn3;

    .line 27
    .line 28
    const-class v10, Lqp3;

    .line 29
    .line 30
    move-object v9, v8

    .line 31
    move-object v8, v7

    .line 32
    move-object v7, v6

    .line 33
    move-object v6, v4

    .line 34
    move-object v4, v2

    .line 35
    const-class v2, Lwn3;

    .line 36
    .line 37
    filled-new-array/range {v2 .. v10}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lfj3;->f0:[Ljava/lang/Class;

    .line 42
    .line 43
    :try_start_0
    sget v0, Lpj3;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-static {v0}, Lue3;->J(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static d0(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Lit0;->p(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0

    .line 11
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public static e0(Lvp4;Lvj8;)Lnj7;
    .locals 11

    .line 1
    const-class v0, Lxr3;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxr3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move-object v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-interface {v0}, Lxr3;->use()Lur3;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0}, Lxr3;->include()Ltr3;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v0}, Lxr3;->property()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v0}, Lxr3;->defaultImpl()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-interface {v0}, Lxr3;->visible()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-interface {v0}, Lxr3;->requireTypeIdForSubtypes()Ljd5;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {v7}, Ljd5;->a()Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-interface {v0}, Lxr3;->writeTypeIdForDefaultImpl()Ljd5;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljd5;->a()Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static/range {v2 .. v8}, Lwr3;->a(Lur3;Ltr3;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lwr3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    const-class v2, Lzr3;

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lzr3;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-interface {v2}, Lzr3;->value()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v3, Lxp4;->q0:Lxp4;

    .line 75
    .line 76
    invoke-virtual {p0, v3}, Lvp4;->f(Lxp4;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-static {v2, v3}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lnj7;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    if-nez v0, :cond_3

    .line 88
    .line 89
    :goto_1
    return-object v1

    .line 90
    :cond_3
    iget-object v2, v0, Lwr3;->X:Lur3;

    .line 91
    .line 92
    sget-object v3, Lur3;->Y:Lur3;

    .line 93
    .line 94
    if-ne v2, v3, :cond_4

    .line 95
    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-static/range {v3 .. v9}, Lwr3;->a(Lur3;Ltr3;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lwr3;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p1, Lnj7;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p0}, Lnj7;->b(Lwr3;)V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_4
    new-instance v2, Lnj7;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v0}, Lnj7;->b(Lwr3;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    const-class v3, Lsr3;

    .line 124
    .line 125
    invoke-virtual {p1, v3}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Lsr3;

    .line 130
    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    invoke-interface {v3}, Lsr3;->value()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object v3, Lxp4;->q0:Lxp4;

    .line 142
    .line 143
    invoke-virtual {p0, v3}, Lvp4;->f(Lxp4;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-static {v1, p0}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    move-object v1, p0

    .line 152
    check-cast v1, Lvh8;

    .line 153
    .line 154
    :goto_3
    iget-object p0, v0, Lwr3;->Y:Ltr3;

    .line 155
    .line 156
    sget-object v3, Ltr3;->f0:Ltr3;

    .line 157
    .line 158
    if-ne p0, v3, :cond_7

    .line 159
    .line 160
    instance-of p1, p1, Lal;

    .line 161
    .line 162
    if-eqz p1, :cond_7

    .line 163
    .line 164
    sget-object v5, Ltr3;->X:Ltr3;

    .line 165
    .line 166
    if-ne v5, p0, :cond_6

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    new-instance v3, Lwr3;

    .line 170
    .line 171
    iget-object v4, v0, Lwr3;->X:Lur3;

    .line 172
    .line 173
    iget-object v6, v0, Lwr3;->Z:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v7, v0, Lwr3;->f0:Ljava/lang/Class;

    .line 176
    .line 177
    iget-boolean v8, v0, Lwr3;->g0:Z

    .line 178
    .line 179
    iget-object v9, v0, Lwr3;->h0:Ljava/lang/Boolean;

    .line 180
    .line 181
    iget-object v10, v0, Lwr3;->i0:Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-direct/range {v3 .. v10}, Lwr3;-><init>(Lur3;Ltr3;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 184
    .line 185
    .line 186
    move-object v0, v3

    .line 187
    :cond_7
    :goto_4
    iget-object p0, v0, Lwr3;->f0:Ljava/lang/Class;

    .line 188
    .line 189
    if-eqz p0, :cond_8

    .line 190
    .line 191
    const-class p1, Lvr3;

    .line 192
    .line 193
    if-eq p0, p1, :cond_8

    .line 194
    .line 195
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    :cond_8
    iput-object v1, v2, Lnj7;->d:Lvh8;

    .line 200
    .line 201
    invoke-virtual {v2, v0}, Lnj7;->b(Lwr3;)V

    .line 202
    .line 203
    .line 204
    return-object v2
.end method

.method public static f0(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lit0;->v(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-ne p0, p1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Lit0;->v(Ljava/lang/Class;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-ne p1, p0, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method


# virtual methods
.method public final A(Lvp4;Lgl;Ldh8;)Lnj7;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ldh8;->I0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p3}, Lmb6;->M()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p1, p2}, Lfj3;->e0(Lvp4;Lvj8;)Lnj7;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final B(Lgl;)Lr75;
    .locals 1

    .line 1
    const-class p0, Lmp3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmp3;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lmp3;->value()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    new-instance p0, Lr75;

    .line 16
    .line 17
    invoke-direct {p0, v0, v0}, Lr75;-><init>(BI)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-class p0, Ljn3;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljn3;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-interface {p0}, Ljn3;->value()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    new-instance p0, Lr75;

    .line 35
    .line 36
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, v0, p1}, Lr75;-><init>(BI)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public final C(Lal;)Ljx5;
    .locals 2

    .line 1
    const-class p0, Ltq3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ltq3;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-interface {p0}, Ltq3;->namespace()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p1, v0

    .line 29
    :goto_0
    invoke-interface {p0}, Ltq3;->value()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, p1}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final D(Lgl;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-interface {p0}, Lxq3;->contentConverter()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const-class v0, Lz51;

    .line 24
    .line 25
    if-ne p0, v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object p0

    .line 29
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final E(Lvj8;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-interface {p0}, Lxq3;->converter()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const-class v0, Lz51;

    .line 24
    .line 25
    if-ne p0, v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object p0

    .line 29
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final F(Lal;)[Ljava/lang/String;
    .locals 0

    .line 1
    const-class p0, Lpq3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lpq3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lpq3;->value()[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final G(Lvj8;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lpq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lpq3;->alphabetic()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final H(Lvj8;)Lwq3;
    .locals 0

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lxq3;->typing()Lwq3;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final I(Lvj8;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxq3;->using()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class v0, Lzq3;

    .line 16
    .line 17
    if-eq p0, v0, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-class p0, Lqq3;

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lqq3;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Lqq3;->value()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Lvj8;->N()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Lc75;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {p1, p0, v0, v1}, Lc75;-><init>(Ljava/lang/Class;IB)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public final J(Lvj8;)Ljava/util/List;
    .locals 17

    .line 1
    const-class v0, Ler3;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ler3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    invoke-interface {v0}, Ler3;->value()[Ldr3;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v0}, Ler3;->failOnRepeatedNames()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    invoke-virtual {v1}, Lvj8;->L()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    array-length v5, v3

    .line 32
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    array-length v6, v3

    .line 41
    const/4 v7, 0x0

    .line 42
    :goto_0
    if-ge v7, v6, :cond_6

    .line 43
    .line 44
    aget-object v8, v3, v7

    .line 45
    .line 46
    invoke-interface {v8}, Ldr3;->name()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    const-string v11, "]"

    .line 55
    .line 56
    const-string v12, "] got repeated subtype name ["

    .line 57
    .line 58
    const-string v13, "Annotated type ["

    .line 59
    .line 60
    if-nez v10, :cond_2

    .line 61
    .line 62
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {v13, v0, v12, v9, v11}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v2

    .line 77
    :cond_2
    :goto_1
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    new-instance v10, Lf25;

    .line 81
    .line 82
    invoke-interface {v8}, Ldr3;->value()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    invoke-direct {v10, v14, v9}, Lf25;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-interface {v8}, Ldr3;->names()[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    array-length v10, v9

    .line 97
    const/4 v14, 0x0

    .line 98
    :goto_2
    if-ge v14, v10, :cond_5

    .line 99
    .line 100
    aget-object v15, v9, v14

    .line 101
    .line 102
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v16

    .line 106
    if-nez v16, :cond_4

    .line 107
    .line 108
    invoke-virtual {v5, v15}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v16

    .line 112
    if-nez v16, :cond_3

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-static {v13, v0, v12, v15, v11}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_4
    :goto_3
    invoke-virtual {v5, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    new-instance v2, Lf25;

    .line 127
    .line 128
    invoke-interface {v8}, Ldr3;->value()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-direct {v2, v4, v15}, Lf25;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    goto :goto_2

    .line 142
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    goto :goto_0

    .line 146
    :cond_6
    return-object v1

    .line 147
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 148
    .line 149
    array-length v1, v3

    .line 150
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    array-length v1, v3

    .line 154
    const/4 v2, 0x0

    .line 155
    :goto_4
    if-ge v2, v1, :cond_9

    .line 156
    .line 157
    aget-object v4, v3, v2

    .line 158
    .line 159
    new-instance v5, Lf25;

    .line 160
    .line 161
    invoke-interface {v4}, Ldr3;->value()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-interface {v4}, Ldr3;->name()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-direct {v5, v6, v7}, Lf25;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-interface {v4}, Ldr3;->names()[Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    array-length v6, v5

    .line 180
    const/4 v7, 0x0

    .line 181
    :goto_5
    if-ge v7, v6, :cond_8

    .line 182
    .line 183
    aget-object v8, v5, v7

    .line 184
    .line 185
    new-instance v9, Lf25;

    .line 186
    .line 187
    invoke-interface {v4}, Ldr3;->value()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-direct {v9, v10, v8}, Lf25;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    add-int/lit8 v7, v7, 0x1

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_9
    return-object v0
.end method

.method public final K(Lal;)Ljava/lang/String;
    .locals 0

    .line 1
    const-class p0, Lyr3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyr3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lyr3;->value()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final L(Ll37;Lal;Ldh8;)Lnj7;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lfj3;->e0(Lvp4;Lvj8;)Lnj7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final M(Lgl;)Lc25;
    .locals 4

    .line 1
    const-class p0, Las3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Las3;

    .line 8
    .line 9
    if-eqz p0, :cond_6

    .line 10
    .line 11
    invoke-interface {p0}, Las3;->enabled()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-interface {p0}, Las3;->prefix()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0}, Las3;->suffix()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    move v2, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v2, v1

    .line 39
    :goto_0
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    move v3, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v3, v1

    .line 50
    :goto_1
    if-eqz v2, :cond_4

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    new-instance v0, Ly15;

    .line 55
    .line 56
    invoke-direct {v0, p1, p0}, Ly15;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    new-instance p0, Lz15;

    .line 61
    .line 62
    invoke-direct {p0, p1, v1}, Lz15;-><init>(Ljava/lang/String;B)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_4
    if-eqz v3, :cond_5

    .line 67
    .line 68
    new-instance p1, Lz15;

    .line 69
    .line 70
    invoke-direct {p1, p0, v0}, Lz15;-><init>(Ljava/lang/String;B)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_5
    sget-object p0, Lc25;->X:Lb25;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public final N(Lvj8;)[Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Les3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Les3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Les3;->value()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final O(Lgl;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lxm3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxm3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lxm3;->enabled()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final P(Lhl;)Z
    .locals 0

    .line 1
    iget-object p0, p1, Lgl;->C0:Lyr2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/HashMap;

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    const-class p1, Lxm3;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final Q(Lgl;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lym3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lym3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lym3;->enabled()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final R(Lgl;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lip3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lip3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lip3;->value()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final S(Lgl;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lbs3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbs3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lbs3;->value()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final T(Lhl;)Z
    .locals 0

    .line 1
    const-class p0, Lbs3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbs3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lbs3;->value()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final U(Lgl;)Z
    .locals 0

    .line 1
    const-class p0, Lxo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxo3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxo3;->value()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final V(Lgl;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-class p0, Lnq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnq3;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lnq3;->isRequired()Ljd5;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Ljd5;->Y:Ljd5;

    .line 16
    .line 17
    if-eq p1, v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljd5;->a()Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Lnq3;->required()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final W(Ljava/lang/annotation/Annotation;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, Lfj3;->X:Lc24;

    .line 10
    .line 11
    iget-object v1, p0, Lc24;->X:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast v1, Lwu5;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lwu5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-class v1, Lgj3;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v1, 0x1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    move p1, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, Lc24;->X:Ljava/io/Serializable;

    .line 40
    .line 41
    check-cast p0, Lwu5;

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1, v1}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-object v1, p1

    .line 47
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0
.end method

.method public final X(Lal;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    const-class p0, Lap3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lap3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lap3;->value()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final Z(Lgl;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p1, Lgl;->C0:Lyr2;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/HashMap;

    .line 10
    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const-class p1, Lrr3;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final a(Lvp4;Lal;Ljava/util/ArrayList;)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v1, Lal;->K0:Ltm;

    .line 8
    .line 9
    iget-object v4, v1, Lal;->C0:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v5, Lbn3;

    .line 12
    .line 13
    invoke-interface {v3, v5}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lbn3;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_f

    .line 22
    .line 23
    :cond_0
    invoke-interface {v3}, Lbn3;->prepend()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-interface {v3}, Lbn3;->attrs()[Lzm3;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    array-length v7, v6

    .line 32
    const/4 v8, 0x0

    .line 33
    move-object v11, v8

    .line 34
    const/4 v10, 0x0

    .line 35
    :goto_0
    sget-object v12, Ldp3;->g0:Ldp3;

    .line 36
    .line 37
    if-ge v10, v7, :cond_b

    .line 38
    .line 39
    if-nez v11, :cond_1

    .line 40
    .line 41
    const-class v11, Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v0, v11}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    :cond_1
    aget-object v13, v6, v10

    .line 48
    .line 49
    invoke-interface {v13}, Lzm3;->required()Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    if-eqz v14, :cond_2

    .line 54
    .line 55
    sget-object v14, Lix5;->h0:Lix5;

    .line 56
    .line 57
    :goto_1
    move-object/from16 v19, v14

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    sget-object v14, Lix5;->i0:Lix5;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    invoke-interface {v13}, Lzm3;->value()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    invoke-interface {v13}, Lzm3;->propName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    const/16 p0, 0x0

    .line 72
    .line 73
    invoke-interface {v13}, Lzm3;->propNamespace()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v16

    .line 81
    if-eqz v16, :cond_3

    .line 82
    .line 83
    sget-object v9, Ljx5;->f0:Ljx5;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_3
    if-eqz v9, :cond_5

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    if-eqz v16, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    invoke-static {v15, v9}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    :goto_3
    invoke-static {v15}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    :goto_4
    iget-object v15, v9, Ljx5;->X:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v15

    .line 110
    if-eqz v15, :cond_6

    .line 111
    .line 112
    invoke-static {v14}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    :cond_6
    move-object/from16 v18, v9

    .line 117
    .line 118
    new-instance v9, Lmy8;

    .line 119
    .line 120
    invoke-direct {v9, v1, v4, v14, v11}, Lmy8;-><init>(Lpi8;Ljava/lang/Class;Ljava/lang/String;Ldh8;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v13}, Lzm3;->include()Ldp3;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    sget v15, Lm97;->h0:I

    .line 128
    .line 129
    if-eqz v13, :cond_9

    .line 130
    .line 131
    if-ne v13, v12, :cond_7

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_7
    sget-object v15, Lep3;->g0:Lep3;

    .line 135
    .line 136
    if-eq v13, v12, :cond_8

    .line 137
    .line 138
    new-instance v12, Lep3;

    .line 139
    .line 140
    invoke-direct {v12, v13, v8, v8, v8}, Lep3;-><init>(Ldp3;Ldp3;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_8
    sget-object v12, Lep3;->g0:Lep3;

    .line 145
    .line 146
    :goto_5
    move-object/from16 v20, v12

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_9
    :goto_6
    sget-object v12, Le50;->X:Lep3;

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :goto_7
    new-instance v15, Lm97;

    .line 153
    .line 154
    invoke-virtual {v0}, Lvp4;->d()Lm85;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    move-object/from16 v17, v9

    .line 159
    .line 160
    invoke-direct/range {v15 .. v20}, Lm97;-><init>(Lm85;Lgl;Ljx5;Lix5;Lep3;)V

    .line 161
    .line 162
    .line 163
    iget-object v9, v1, Lal;->K0:Ltm;

    .line 164
    .line 165
    new-instance v12, Lvv;

    .line 166
    .line 167
    invoke-direct {v12, v14, v15, v9, v11}, Lvv;-><init>(Ljava/lang/String;Lm97;Ltm;Ldh8;)V

    .line 168
    .line 169
    .line 170
    if-eqz v5, :cond_a

    .line 171
    .line 172
    invoke-interface {v2, v10, v12}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_a
    invoke-interface {v2, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_b
    const/16 p0, 0x0

    .line 184
    .line 185
    invoke-interface {v3}, Lbn3;->props()[Lan3;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    array-length v3, v2

    .line 190
    if-lez v3, :cond_12

    .line 191
    .line 192
    aget-object v2, v2, p0

    .line 193
    .line 194
    invoke-interface {v2}, Lan3;->required()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_c

    .line 199
    .line 200
    sget-object v3, Lix5;->h0:Lix5;

    .line 201
    .line 202
    :goto_9
    move-object/from16 v17, v3

    .line 203
    .line 204
    goto :goto_a

    .line 205
    :cond_c
    sget-object v3, Lix5;->i0:Lix5;

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :goto_a
    invoke-interface {v2}, Lan3;->name()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-interface {v2}, Lan3;->namespace()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_d

    .line 221
    .line 222
    sget-object v3, Ljx5;->f0:Ljx5;

    .line 223
    .line 224
    goto :goto_c

    .line 225
    :cond_d
    if-eqz v5, :cond_f

    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_e

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_e
    invoke-static {v3, v5}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    goto :goto_c

    .line 239
    :cond_f
    :goto_b
    invoke-static {v3}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_c
    invoke-interface {v2}, Lan3;->type()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {v0, v5}, Lvp4;->c(Ljava/lang/Class;)Ldh8;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    new-instance v15, Lmy8;

    .line 252
    .line 253
    iget-object v6, v3, Ljx5;->X:Ljava/lang/String;

    .line 254
    .line 255
    invoke-direct {v15, v1, v4, v6, v5}, Lmy8;-><init>(Lpi8;Ljava/lang/Class;Ljava/lang/String;Ldh8;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v2}, Lan3;->include()Ldp3;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    sget v4, Lm97;->h0:I

    .line 263
    .line 264
    if-eqz v1, :cond_11

    .line 265
    .line 266
    if-eq v1, v12, :cond_11

    .line 267
    .line 268
    sget-object v4, Lep3;->g0:Lep3;

    .line 269
    .line 270
    if-eq v1, v12, :cond_10

    .line 271
    .line 272
    new-instance v4, Lep3;

    .line 273
    .line 274
    invoke-direct {v4, v1, v8, v8, v8}, Lep3;-><init>(Ldp3;Ldp3;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 275
    .line 276
    .line 277
    goto :goto_d

    .line 278
    :cond_10
    sget-object v4, Lep3;->g0:Lep3;

    .line 279
    .line 280
    :goto_d
    move-object/from16 v18, v4

    .line 281
    .line 282
    goto :goto_e

    .line 283
    :cond_11
    sget-object v4, Le50;->X:Lep3;

    .line 284
    .line 285
    goto :goto_d

    .line 286
    :goto_e
    new-instance v13, Lm97;

    .line 287
    .line 288
    invoke-virtual {v0}, Lvp4;->d()Lm85;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    move-object/from16 v16, v3

    .line 293
    .line 294
    invoke-direct/range {v13 .. v18}, Lm97;-><init>(Lm85;Lgl;Ljx5;Lix5;Lep3;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v2}, Lan3;->value()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    sget-object v2, Lxp4;->q0:Lxp4;

    .line 302
    .line 303
    invoke-virtual {v0, v2}, Lvp4;->f(Lxp4;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-static {v1, v0}, Lit0;->g(Ljava/lang/Class;Z)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Lvv;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    const-string v0, "Should not be called on this type"

    .line 317
    .line 318
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    :goto_f
    return-void
.end method

.method public final a0(Lvp4;Lvj8;Ldh8;)Ldh8;
    .locals 19

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v0, v0, Lvp4;->Y:Ll20;

    .line 8
    .line 9
    iget-object v0, v0, Ll20;->X:Luh8;

    .line 10
    .line 11
    const-class v3, Lxq3;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lxq3;

    .line 18
    .line 19
    const-class v4, Lyq3;

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lyq3;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v3}, Lxq3;->as()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v6}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    :goto_0
    if-nez v6, :cond_1

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v4}, Lyq3;->value()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-static {v6}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :cond_1
    const/4 v7, 0x0

    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    invoke-virtual {v2, v6}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_2

    .line 60
    .line 61
    invoke-virtual {v2}, Ldh8;->R0()Ldh8;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v8, v2, Ldh8;->j0:Ljava/lang/Class;

    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v6}, Luh8;->f(Ldh8;Ljava/lang/Class;)Ldh8;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-virtual {v8, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0, v2, v6, v7}, Luh8;->g(Ldh8;Ljava/lang/Class;Z)Ldh8;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    goto :goto_2

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-static {v8, v6}, Lfj3;->f0(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_5

    .line 100
    .line 101
    invoke-virtual {v2}, Ldh8;->R0()Ldh8;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const-string v0, "Cannot refine serialization type %s into %s; types not related"

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v3, Lpp3;

    .line 121
    .line 122
    invoke-direct {v3, v5, v0}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1}, Lvj8;->L()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    filled-new-array {v2, v3, v1, v4}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "Failed to widen type %s with annotation (value %s), from \'%s\': %s"

    .line 143
    .line 144
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-instance v2, Lpp3;

    .line 149
    .line 150
    invoke-direct {v2, v5, v1, v0}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    throw v2

    .line 154
    :cond_6
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    instance-of v6, v2, Ltp4;

    .line 158
    .line 159
    if-eqz v6, :cond_e

    .line 160
    .line 161
    move-object v6, v2

    .line 162
    check-cast v6, Ltp4;

    .line 163
    .line 164
    iget-object v8, v6, Ltp4;->s0:Ldh8;

    .line 165
    .line 166
    if-nez v3, :cond_7

    .line 167
    .line 168
    move-object v9, v5

    .line 169
    goto :goto_3

    .line 170
    :cond_7
    invoke-interface {v3}, Lxq3;->keyAs()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-static {v9}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    :goto_3
    if-nez v9, :cond_8

    .line 179
    .line 180
    if-eqz v4, :cond_8

    .line 181
    .line 182
    invoke-interface {v4}, Lyq3;->key()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-static {v9}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    :cond_8
    if-eqz v9, :cond_e

    .line 191
    .line 192
    invoke-virtual {v8, v9}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_9

    .line 197
    .line 198
    invoke-virtual {v8}, Ldh8;->R0()Ldh8;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :goto_4
    move-object v14, v2

    .line 203
    goto :goto_5

    .line 204
    :cond_9
    iget-object v10, v8, Ldh8;->j0:Ljava/lang/Class;

    .line 205
    .line 206
    :try_start_1
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    if-eqz v11, :cond_a

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-static {v8, v9}, Luh8;->f(Ldh8;Ljava/lang/Class;)Ldh8;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    goto :goto_4

    .line 220
    :cond_a
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    if-eqz v11, :cond_b

    .line 225
    .line 226
    invoke-virtual {v0, v8, v9, v7}, Luh8;->g(Ldh8;Ljava/lang/Class;Z)Ldh8;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    goto :goto_4

    .line 231
    :catch_1
    move-exception v0

    .line 232
    goto :goto_6

    .line 233
    :cond_b
    invoke-static {v10, v9}, Lfj3;->f0(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-eqz v10, :cond_d

    .line 238
    .line 239
    invoke-virtual {v8}, Ldh8;->R0()Ldh8;

    .line 240
    .line 241
    .line 242
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 243
    goto :goto_4

    .line 244
    :goto_5
    if-ne v14, v8, :cond_c

    .line 245
    .line 246
    move-object v2, v6

    .line 247
    goto :goto_7

    .line 248
    :cond_c
    new-instance v9, Ltp4;

    .line 249
    .line 250
    iget-object v10, v6, Ldh8;->j0:Ljava/lang/Class;

    .line 251
    .line 252
    iget-object v11, v6, Ldh8;->q0:Lgh8;

    .line 253
    .line 254
    iget-object v12, v6, Ldh8;->o0:Ldh8;

    .line 255
    .line 256
    iget-object v13, v6, Ldh8;->p0:[Ldh8;

    .line 257
    .line 258
    iget-object v15, v6, Ltp4;->t0:Ldh8;

    .line 259
    .line 260
    iget-object v2, v6, Ldh8;->l0:Ljava/lang/Object;

    .line 261
    .line 262
    iget-object v8, v6, Ldh8;->m0:Ljava/lang/Object;

    .line 263
    .line 264
    iget-boolean v6, v6, Ldh8;->n0:Z

    .line 265
    .line 266
    move-object/from16 v16, v2

    .line 267
    .line 268
    move/from16 v18, v6

    .line 269
    .line 270
    move-object/from16 v17, v8

    .line 271
    .line 272
    invoke-direct/range {v9 .. v18}, Ltp4;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 273
    .line 274
    .line 275
    move-object v2, v9

    .line 276
    goto :goto_7

    .line 277
    :cond_d
    :try_start_2
    const-string v0, "Cannot refine serialization key type %s into %s; types not related"

    .line 278
    .line 279
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    filled-new-array {v8, v3}, [Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v3, Lpp3;

    .line 292
    .line 293
    invoke-direct {v3, v5, v0}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v3
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 297
    :goto_6
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v1}, Lvj8;->L()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    filled-new-array {v2, v3, v1, v4}, [Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    const-string v2, "Failed to widen key type of %s with concrete-type annotation (value %s), from \'%s\': %s"

    .line 314
    .line 315
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    new-instance v2, Lpp3;

    .line 320
    .line 321
    invoke-direct {v2, v5, v1, v0}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    throw v2

    .line 325
    :cond_e
    :goto_7
    invoke-virtual {v2}, Ldh8;->z0()Ldh8;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    if-eqz v6, :cond_15

    .line 330
    .line 331
    if-nez v3, :cond_f

    .line 332
    .line 333
    move-object v3, v5

    .line 334
    goto :goto_8

    .line 335
    :cond_f
    invoke-interface {v3}, Lxq3;->contentAs()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-static {v3}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    :goto_8
    if-nez v3, :cond_10

    .line 344
    .line 345
    if-eqz v4, :cond_10

    .line 346
    .line 347
    invoke-interface {v4}, Lyq3;->content()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-static {v3}, Lfj3;->d0(Ljava/lang/Class;)Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    :cond_10
    if-eqz v3, :cond_15

    .line 356
    .line 357
    invoke-virtual {v6, v3}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    if-eqz v4, :cond_11

    .line 362
    .line 363
    invoke-virtual {v6}, Ldh8;->R0()Ldh8;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    goto :goto_9

    .line 368
    :cond_11
    iget-object v4, v6, Ldh8;->j0:Ljava/lang/Class;

    .line 369
    .line 370
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-eqz v8, :cond_12

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v6, v3}, Luh8;->f(Ldh8;Ljava/lang/Class;)Ldh8;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    goto :goto_9

    .line 384
    :cond_12
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    if-eqz v8, :cond_13

    .line 389
    .line 390
    invoke-virtual {v0, v6, v3, v7}, Luh8;->g(Ldh8;Ljava/lang/Class;Z)Ldh8;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    goto :goto_9

    .line 395
    :catch_2
    move-exception v0

    .line 396
    goto :goto_a

    .line 397
    :cond_13
    invoke-static {v4, v3}, Lfj3;->f0(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_14

    .line 402
    .line 403
    invoke-virtual {v6}, Ldh8;->R0()Ldh8;

    .line 404
    .line 405
    .line 406
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    .line 407
    :goto_9
    invoke-virtual {v2, v0}, Ldh8;->O0(Ldh8;)Ldh8;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    return-object v0

    .line 412
    :cond_14
    :try_start_4
    const-string v0, "Cannot refine serialization content type %s into %s; types not related"

    .line 413
    .line 414
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    filled-new-array {v6, v4}, [Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    new-instance v4, Lpp3;

    .line 427
    .line 428
    invoke-direct {v4, v5, v0}, Lpp3;-><init>(Leq2;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw v4
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    .line 432
    :goto_a
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v1}, Lvj8;->L()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    filled-new-array {v2, v3, v1, v4}, [Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    const-string v2, "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from \'%s\': %s"

    .line 449
    .line 450
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    new-instance v2, Lpp3;

    .line 455
    .line 456
    invoke-direct {v2, v5, v1, v0}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    throw v2

    .line 460
    :cond_15
    return-object v2
.end method

.method public final b(Lal;Lhz8;)Lhz8;
    .locals 12

    .line 1
    const-class p0, Lin3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lin3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-object p2

    .line 14
    :cond_0
    iget-object p1, p2, Lhz8;->X:Lhn3;

    .line 15
    .line 16
    iget-object v0, p2, Lhz8;->g0:Lhn3;

    .line 17
    .line 18
    iget-object v1, p2, Lhz8;->f0:Lhn3;

    .line 19
    .line 20
    iget-object v2, p2, Lhz8;->Z:Lhn3;

    .line 21
    .line 22
    iget-object v3, p2, Lhz8;->Y:Lhn3;

    .line 23
    .line 24
    invoke-interface {p0}, Lin3;->getterVisibility()Lhn3;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    sget-object v5, Lhn3;->f0:Lhn3;

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    move-object v7, p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v7, v4

    .line 35
    :goto_0
    invoke-interface {p0}, Lin3;->isGetterVisibility()Lhn3;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v5, :cond_2

    .line 40
    .line 41
    move-object v8, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v8, p1

    .line 44
    :goto_1
    invoke-interface {p0}, Lin3;->setterVisibility()Lhn3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v5, :cond_3

    .line 49
    .line 50
    move-object v9, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move-object v9, p1

    .line 53
    :goto_2
    invoke-interface {p0}, Lin3;->creatorVisibility()Lhn3;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v5, :cond_4

    .line 58
    .line 59
    move-object v10, v1

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move-object v10, p1

    .line 62
    :goto_3
    invoke-interface {p0}, Lin3;->fieldVisibility()Lhn3;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v5, :cond_5

    .line 67
    .line 68
    move-object v11, v0

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    move-object v11, p0

    .line 71
    :goto_4
    iget-object p0, p2, Lhz8;->X:Lhn3;

    .line 72
    .line 73
    if-ne v7, p0, :cond_6

    .line 74
    .line 75
    if-ne v8, v3, :cond_6

    .line 76
    .line 77
    if-ne v9, v2, :cond_6

    .line 78
    .line 79
    if-ne v10, v1, :cond_6

    .line 80
    .line 81
    if-ne v11, v0, :cond_6

    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_6
    new-instance v6, Lhz8;

    .line 85
    .line 86
    invoke-direct/range {v6 .. v11}, Lhz8;-><init>(Lhn3;Lhn3;Lhn3;Lhn3;Lhn3;)V

    .line 87
    .line 88
    .line 89
    return-object v6
.end method

.method public final b0(Lhl;Lhl;)Lhl;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lhl;->I0(I)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {p2, p0}, Lhl;->I0(I)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_3

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-class v1, Ljava/lang/String;

    .line 31
    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    :goto_0
    return-object p1

    .line 37
    :cond_2
    if-ne p0, v1, :cond_3

    .line 38
    .line 39
    :goto_1
    return-object p2

    .line 40
    :cond_3
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final c(Lvj8;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxq3;->contentUsing()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class p1, Lzq3;

    .line 16
    .line 17
    if-eq p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final d(Ll37;Lul;)Lnn3;
    .locals 1

    .line 1
    const-class v0, Lon3;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lon3;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p2}, Lon3;->mode()Lnn3;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget-object v0, Lnn3;->X:Lnn3;

    .line 18
    .line 19
    if-eq p2, v0, :cond_1

    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_1
    :goto_0
    iget-boolean p0, p0, Lfj3;->Y:Z

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    sget-object p0, Lxp4;->n0:Lxp4;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lvp4;->f(Lxp4;)Z

    .line 29
    .line 30
    .line 31
    :cond_2
    return-object p2
.end method

.method public final e(Lal;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Ls22;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ls22;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ls22;->value()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final f(Lal;[Ljava/lang/Enum;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lal;->A0()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lel;

    .line 25
    .line 26
    const-class v1, Lnq3;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lnq3;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Lnq3;->value()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v0, v0, Lel;->D0:Ljava/lang/reflect/Field;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    array-length p1, p2

    .line 53
    const/4 v0, 0x0

    .line 54
    :goto_1
    if-ge v0, p1, :cond_3

    .line 55
    .line 56
    aget-object v1, p2, v0

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    aput-object v1, p3, v0

    .line 71
    .line 72
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    return-object p3
.end method

.method public final g(Lvj8;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Ljo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljo3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljo3;->value()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final h(Lvj8;)Lno3;
    .locals 12

    .line 1
    const-class p0, Loo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Loo3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lno3;

    .line 14
    .line 15
    invoke-interface {p0}, Loo3;->pattern()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p0}, Loo3;->shape()Lmo3;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {p0}, Loo3;->locale()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {p0}, Loo3;->timezone()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {p0}, Loo3;->with()[Lko3;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0}, Loo3;->without()[Lko3;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    array-length v6, p1

    .line 40
    const/4 v7, 0x0

    .line 41
    move v8, v7

    .line 42
    move v9, v8

    .line 43
    :goto_0
    const/4 v10, 0x1

    .line 44
    if-ge v8, v6, :cond_1

    .line 45
    .line 46
    aget-object v11, p1, v8

    .line 47
    .line 48
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    shl-int/2addr v10, v11

    .line 53
    or-int/2addr v9, v10

    .line 54
    add-int/lit8 v8, v8, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    array-length p1, v5

    .line 58
    move v6, v7

    .line 59
    :goto_1
    if-ge v7, p1, :cond_2

    .line 60
    .line 61
    aget-object v8, v5, v7

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    shl-int v8, v10, v8

    .line 68
    .line 69
    or-int/2addr v6, v8

    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance v5, Llo3;

    .line 74
    .line 75
    invoke-direct {v5, v9, v6}, Llo3;-><init>(II)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0}, Loo3;->lenient()Ljd5;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljd5;->a()Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {p0}, Loo3;->radix()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-direct/range {v0 .. v7}, Lno3;-><init>(Ljava/lang/String;Lmo3;Ljava/lang/String;Ljava/lang/String;Llo3;Ljava/lang/Boolean;I)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method

.method public final i(Lgl;)Ljj3;
    .locals 4

    .line 1
    const-class p0, Lkj3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkj3;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-interface {p0}, Lkj3;->value()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p0}, Lkj3;->useInput()Ljd5;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljd5;->a()Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {p0}, Lkj3;->optional()Ljd5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljd5;->a()Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v3, ""

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :goto_0
    if-nez v0, :cond_2

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    if-nez p0, :cond_2

    .line 48
    .line 49
    sget-object p0, Ljj3;->f0:Ljj3;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    new-instance v1, Ljj3;

    .line 53
    .line 54
    invoke-direct {v1, v0, v2, p0}, Ljj3;-><init>(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 55
    .line 56
    .line 57
    move-object p0, v1

    .line 58
    :goto_1
    iget-object v0, p0, Ljj3;->X:Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    instance-of v1, p1, Lhl;

    .line 64
    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Lvj8;->N()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    check-cast p1, Lhl;

    .line 77
    .line 78
    invoke-virtual {p1}, Lhl;->G0()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    iget-object p1, p1, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    goto :goto_2

    .line 95
    :cond_5
    const/4 v1, 0x0

    .line 96
    invoke-virtual {p1, v1}, Lhl;->I0(I)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    :goto_3
    return-object p0

    .line 111
    :cond_6
    new-instance v0, Ljj3;

    .line 112
    .line 113
    iget-object v1, p0, Ljj3;->Y:Ljava/lang/Boolean;

    .line 114
    .line 115
    iget-object p0, p0, Ljj3;->Z:Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-direct {v0, p1, v1, p0}, Ljj3;-><init>(Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method

.method public final j(Lgl;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfj3;->i(Lgl;)Ljj3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object p0, p0, Ljj3;->X:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p0
.end method

.method public final k(Lvj8;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxq3;->keyUsing()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class p1, Lzq3;

    .line 16
    .line 17
    if-eq p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final l(Lgl;)Ljx5;
    .locals 2

    .line 1
    const-class p0, Lbr3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbr3;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lbr3;->value()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p0}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    :goto_0
    const-class v0, Lnq3;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnq3;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-interface {v0}, Lnq3;->namespace()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v1, p0

    .line 54
    :goto_1
    invoke-interface {v0}, Lnq3;->value()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0, v1}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_3
    if-nez p0, :cond_5

    .line 64
    .line 65
    sget-object p0, Lfj3;->f0:[Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lgl;->D0([Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    return-object v1

    .line 75
    :cond_5
    :goto_2
    sget-object p0, Ljx5;->f0:Ljx5;

    .line 76
    .line 77
    return-object p0
.end method

.method public final m(Lgl;)Ljx5;
    .locals 2

    .line 1
    const-class p0, Lto3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lto3;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lto3;->value()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    :goto_0
    const-class v0, Lnq3;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnq3;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-interface {v0}, Lnq3;->namespace()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object v1, p0

    .line 54
    :goto_1
    invoke-interface {v0}, Lnq3;->value()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0, v1}, Ljx5;->b(Ljava/lang/String;Ljava/lang/String;)Ljx5;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_3
    if-nez p0, :cond_5

    .line 64
    .line 65
    sget-object p0, Lfj3;->Z:[Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lgl;->D0([Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    return-object v1

    .line 75
    :cond_5
    :goto_2
    sget-object p0, Ljx5;->f0:Ljx5;

    .line 76
    .line 77
    return-object p0
.end method

.method public final n(Lal;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Ltp3;

    .line 2
    .line 3
    iget-object p1, p1, Lal;->K0:Ltm;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Ltm;->a(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ltp3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ltp3;->value()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final o(Lgl;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p0, Lxq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxq3;->nullsUsing()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class p1, Lzq3;

    .line 16
    .line 17
    if-eq p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final p(Lvj8;)Lf85;
    .locals 6

    .line 1
    const-class p0, Lvo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvo3;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lvo3;->generator()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-class v0, Le85;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p0}, Lvo3;->property()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Ljx5;->a(Ljava/lang/String;)Ljx5;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v0, Lf85;

    .line 29
    .line 30
    invoke-interface {p0}, Lvo3;->scope()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {p0}, Lvo3;->generator()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {p0}, Lvo3;->resolver()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-direct/range {v0 .. v5}, Lf85;-><init>(Ljx5;Ljava/lang/Class;Ljava/lang/Class;ZLjava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public final q(Lvj8;Lf85;)Lf85;
    .locals 6

    .line 1
    const-class p0, Lwo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwo3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-object p2

    .line 12
    :cond_0
    if-nez p2, :cond_1

    .line 13
    .line 14
    sget-object p2, Lf85;->f:Lf85;

    .line 15
    .line 16
    :cond_1
    invoke-interface {p0}, Lwo3;->alwaysAsId()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    iget-boolean p0, p2, Lf85;->e:Z

    .line 21
    .line 22
    if-ne p0, v4, :cond_2

    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_2
    new-instance v0, Lf85;

    .line 26
    .line 27
    iget-object v1, p2, Lf85;->a:Ljx5;

    .line 28
    .line 29
    iget-object v2, p2, Lf85;->d:Ljava/lang/Class;

    .line 30
    .line 31
    iget-object v3, p2, Lf85;->b:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v5, p2, Lf85;->c:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-direct/range {v0 .. v5}, Lf85;-><init>(Ljx5;Ljava/lang/Class;Ljava/lang/Class;ZLjava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final r(Lvj8;)Lmq3;
    .locals 0

    .line 1
    const-class p0, Lnq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lnq3;->access()Lmq3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final s(Lvp4;Lgl;Ldh8;)Lnj7;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ldh8;->z0()Ldh8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Lfj3;->e0(Lvp4;Lvj8;)Lnj7;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Must call method with a container or reference type (got "

    .line 13
    .line 14
    const-string p1, ")"

    .line 15
    .line 16
    invoke-static {p0, p3, p1}, Lio/sentry/c2;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final t(Lgl;)Ljava/lang/String;
    .locals 0

    .line 1
    const-class p0, Lnq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnq3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0}, Lnq3;->defaultValue()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    :cond_1
    return-object p0
.end method

.method public final u(Lgl;)Ljava/lang/String;
    .locals 0

    .line 1
    const-class p0, Loq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Loq3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Loq3;->value()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final v(Lvj8;)Lyo3;
    .locals 6

    .line 1
    const-class p0, Lzo3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzo3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lyo3;->h0:Lyo3;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p1, Lyo3;->h0:Lyo3;

    .line 15
    .line 16
    invoke-interface {p0}, Lzo3;->value()[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    array-length v0, p1

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    .line 28
    .line 29
    array-length v1, p1

    .line 30
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 31
    .line 32
    .line 33
    array-length v1, p1

    .line 34
    move v2, v5

    .line 35
    :goto_0
    if-ge v2, v1, :cond_2

    .line 36
    .line 37
    aget-object v3, p1, v2

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    move-object v1, v0

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    :goto_2
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_3
    invoke-interface {p0}, Lzo3;->ignoreUnknown()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-interface {p0}, Lzo3;->allowGetters()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-interface {p0}, Lzo3;->allowSetters()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    sget-object p0, Lyo3;->h0:Lyo3;

    .line 63
    .line 64
    iget-boolean p1, p0, Lyo3;->Y:Z

    .line 65
    .line 66
    if-ne v2, p1, :cond_5

    .line 67
    .line 68
    iget-boolean p1, p0, Lyo3;->Z:Z

    .line 69
    .line 70
    if-ne v3, p1, :cond_5

    .line 71
    .line 72
    iget-boolean p1, p0, Lyo3;->f0:Z

    .line 73
    .line 74
    if-ne v4, p1, :cond_5

    .line 75
    .line 76
    iget-boolean p1, p0, Lyo3;->g0:Z

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    :cond_4
    return-object p0

    .line 89
    :cond_5
    new-instance v0, Lyo3;

    .line 90
    .line 91
    invoke-direct/range {v0 .. v5}, Lyo3;-><init>(Ljava/util/Set;ZZZZ)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method public final w(Lvj8;)Lyo3;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfj3;->v(Lvj8;)Lyo3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final x(Lvj8;)Lep3;
    .locals 6

    .line 1
    const-class p0, Lfp3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfp3;

    .line 8
    .line 9
    sget-object v0, Ldp3;->g0:Ldp3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lep3;->g0:Lep3;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v1, Lep3;->g0:Lep3;

    .line 17
    .line 18
    invoke-interface {p0}, Lfp3;->value()Ldp3;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {p0}, Lfp3;->content()Ldp3;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-ne v2, v0, :cond_1

    .line 27
    .line 28
    if-ne v3, v0, :cond_1

    .line 29
    .line 30
    move-object p0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-interface {p0}, Lfp3;->valueFilter()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v4, 0x0

    .line 37
    const-class v5, Ljava/lang/Void;

    .line 38
    .line 39
    if-ne v1, v5, :cond_2

    .line 40
    .line 41
    move-object v1, v4

    .line 42
    :cond_2
    invoke-interface {p0}, Lfp3;->contentFilter()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v5, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    move-object v4, p0

    .line 50
    :goto_0
    new-instance p0, Lep3;

    .line 51
    .line 52
    invoke-direct {p0, v2, v3, v1, v4}, Lep3;-><init>(Ldp3;Ldp3;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object v1, p0, Lep3;->X:Ldp3;

    .line 56
    .line 57
    if-ne v1, v0, :cond_8

    .line 58
    .line 59
    const-class v0, Lxq3;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lxq3;

    .line 66
    .line 67
    if-eqz p1, :cond_8

    .line 68
    .line 69
    invoke-interface {p1}, Lxq3;->include()Lvq3;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_7

    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    if-eq p1, v0, :cond_6

    .line 81
    .line 82
    const/4 v0, 0x2

    .line 83
    if-eq p1, v0, :cond_5

    .line 84
    .line 85
    const/4 v0, 0x3

    .line 86
    if-eq p1, v0, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    sget-object p1, Ldp3;->Z:Ldp3;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lep3;->b(Ldp3;)Lep3;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    sget-object p1, Ldp3;->f0:Ldp3;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Lep3;->b(Ldp3;)Lep3;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_6
    sget-object p1, Ldp3;->Y:Ldp3;

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lep3;->b(Ldp3;)Lep3;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_7
    sget-object p1, Ldp3;->X:Ldp3;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lep3;->b(Ldp3;)Lep3;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    :cond_8
    :goto_2
    return-object p0
.end method

.method public final y(Lvj8;)Lgp3;
    .locals 5

    .line 1
    const-class p0, Lhp3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lvj8;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhp3;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lgp3;->Z:Lgp3;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p1, Lgp3;

    .line 15
    .line 16
    invoke-interface {p0}, Lhp3;->value()[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    array-length v1, v0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    .line 27
    .line 28
    array-length v2, v0

    .line 29
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 30
    .line 31
    .line 32
    array-length v2, v0

    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v2, :cond_3

    .line 35
    .line 36
    aget-object v4, v0, v3

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 45
    .line 46
    :cond_3
    invoke-interface {p0}, Lhp3;->order()Ljd5;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljd5;->a()Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {p1, v1, p0}, Lgp3;-><init>(Ljava/util/Set;Ljava/lang/Boolean;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method

.method public final z(Lgl;)Ljava/lang/Integer;
    .locals 0

    .line 1
    const-class p0, Lnq3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lgl;->C(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnq3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lnq3;->index()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 p1, -0x1

    .line 16
    if-eq p0, p1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
