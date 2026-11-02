.class public final Ldo2;
.super Lm0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final n0:Lqs0;

.field public static final o0:Lqs0;


# instance fields
.field public final g0:Lve4;

.field public final h0:Ltf5;

.field public final i0:Lso2;

.field public final j0:I

.field public final k0:Lco2;

.field public final l0:Lfo2;

.field public final m0:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lqs0;

    .line 2
    .line 3
    sget-object v1, Lug7;->k:Lfk2;

    .line 4
    .line 5
    const-string v2, "Function"

    .line 6
    .line 7
    invoke-static {v2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldo2;->n0:Lqs0;

    .line 15
    .line 16
    new-instance v0, Lqs0;

    .line 17
    .line 18
    sget-object v1, Lug7;->i:Lfk2;

    .line 19
    .line 20
    const-string v2, "KFunction"

    .line 21
    .line 22
    invoke-static {v2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v1, v2}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ldo2;->o0:Lqs0;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lve4;Loa0;Lso2;I)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, p4}, Lso2;->a(I)Lv15;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, p1, v0}, Lm0;-><init>(Lve4;Lv15;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldo2;->g0:Lve4;

    .line 12
    .line 13
    iput-object p2, p0, Ldo2;->h0:Ltf5;

    .line 14
    .line 15
    iput-object p3, p0, Ldo2;->i0:Lso2;

    .line 16
    .line 17
    iput p4, p0, Ldo2;->j0:I

    .line 18
    .line 19
    new-instance p2, Lco2;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Lco2;-><init>(Ldo2;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Ldo2;->k0:Lco2;

    .line 25
    .line 26
    new-instance p2, Lfo2;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p2, p1, p0, p3}, Lfo2;-><init>(Lve4;Lm0;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Ldo2;->l0:Lfo2;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p2, Lkf3;

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    invoke-direct {p2, p3, p4, p3}, Lif3;-><init>(III)V

    .line 43
    .line 44
    .line 45
    new-instance p3, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 p4, 0xa

    .line 48
    .line 49
    invoke-static {p2, p4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result p4

    .line 53
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lif3;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    :goto_0
    move-object p4, p2

    .line 61
    check-cast p4, Ljf3;

    .line 62
    .line 63
    iget-boolean v0, p4, Ljf3;->Z:Z

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    invoke-virtual {p4}, Ljf3;->nextInt()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v1, "P"

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-static {p4}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget-object v1, p0, Ldo2;->g0:Lve4;

    .line 94
    .line 95
    sget-object v2, Lrt8;->f0:Lrt8;

    .line 96
    .line 97
    invoke-static {p0, v2, p4, v0, v1}, Lii8;->K0(Lm0;Lrt8;Lv15;ILve4;)Lii8;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    sget-object p4, Ldn8;->a:Ldn8;

    .line 105
    .line 106
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    const-string p2, "R"

    .line 111
    .line 112
    invoke-static {p2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    iget-object p4, p0, Ldo2;->g0:Lve4;

    .line 121
    .line 122
    sget-object v0, Lrt8;->g0:Lrt8;

    .line 123
    .line 124
    invoke-static {p0, v0, p2, p3, p4}, Lii8;->K0(Lm0;Lrt8;Lv15;ILve4;)Lii8;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, Ldo2;->m0:Ljava/util/List;

    .line 136
    .line 137
    iget-object p0, p0, Ldo2;->i0:Lso2;

    .line 138
    .line 139
    sget-object p1, Leo2;->X:Lk42;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    sget-object p1, Loo2;->d:Loo2;

    .line 148
    .line 149
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    sget-object p1, Lro2;->d:Lro2;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_2

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    sget-object p1, Lpo2;->d:Lpo2;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_3

    .line 172
    .line 173
    :goto_1
    return-void

    .line 174
    :cond_3
    sget-object p1, Lqo2;->d:Lqo2;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    return-void
.end method


# virtual methods
.method public final B()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    sget-object p0, Lgl1;->e:Lfl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final g0()Lus0;
    .locals 0

    .line 1
    sget-object p0, Lus0;->Y:Lus0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()Lsm;
    .locals 0

    .line 1
    sget-object p0, Loy1;->f0:Lrm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 0

    .line 1
    sget-object p0, Lke7;->G:Lg55;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ldo2;->m0:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Ldo2;->k0:Lco2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    sget-object p0, Lfx4;->g0:Lfx4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final o0()Let4;
    .locals 0

    .line 1
    sget-object p0, Ldt4;->b:Ldt4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldo2;->h0:Ltf5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s0(Lz14;)Let4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldo2;->l0:Lfo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t0()Lgs0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm0;->getName()Lv15;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final u0()Lft8;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final v0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final w0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final y0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
