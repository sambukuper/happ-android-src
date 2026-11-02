.class public abstract Lms8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lfk2;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfk2;

    .line 2
    .line 3
    const-string v1, "kotlin.jvm.JvmStatic"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lms8;->a:Lfk2;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lro2;->d:Lro2;

    .line 16
    .line 17
    iget-object v2, v1, Lso2;->a:Lfk2;

    .line 18
    .line 19
    iget-object v2, v2, Lfk2;->a:Lgk2;

    .line 20
    .line 21
    iget-object v2, v2, Lgk2;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x2e

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, Lso2;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lms8;->b:Ljava/lang/String;

    .line 41
    .line 42
    return-void
.end method

.method public static final a(Ljava/lang/Object;)Lkb6;
    .locals 2

    .line 1
    instance-of v0, p0, Lo54;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo54;

    .line 6
    .line 7
    invoke-virtual {p0}, Lo54;->f()Lnw3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lms8;->a(Ljava/lang/Object;)Lkb6;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Lkb6;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Lkb6;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Lnd0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    check-cast v0, Lnd0;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnd0;->f()Lxu3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne v0, p0, :cond_2

    .line 36
    .line 37
    move-object v0, v1

    .line 38
    :cond_2
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, Lms8;->a(Ljava/lang/Object;)Lkb6;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_3
    return-object v1
.end method

.method public static final b(Ljava/lang/Object;)Lnb6;
    .locals 2

    .line 1
    instance-of v0, p0, Lnb6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lnb6;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Lmo2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p0, Lmo2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lnd0;->f()Lxu3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    instance-of v0, p0, Lnb6;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p0, Lnb6;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v1
.end method

.method public static final c(Ljava/lang/Object;)Lpb6;
    .locals 2

    .line 1
    instance-of v0, p0, Lo54;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo54;

    .line 6
    .line 7
    invoke-virtual {p0}, Lo54;->f()Lnw3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lms8;->c(Ljava/lang/Object;)Lpb6;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Lpb6;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Lpb6;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Lnx5;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    check-cast v0, Lnx5;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnx5;->f()Lxu3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne v0, p0, :cond_2

    .line 36
    .line 37
    move-object v0, v1

    .line 38
    :cond_2
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, Lms8;->c(Ljava/lang/Object;)Lpb6;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_3
    return-object v1
.end method

.method public static final d(Lzk;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lzk;->getAnnotations()Lsm;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lgm;

    .line 28
    .line 29
    invoke-interface {v1}, Lgm;->getSource()Lke7;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    instance-of v3, v2, Lga6;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    check-cast v2, Lga6;

    .line 38
    .line 39
    iget-object v1, v2, Lga6;->X:Ljava/lang/annotation/Annotation;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    instance-of v3, v2, Lhr6;

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    check-cast v2, Lhr6;

    .line 47
    .line 48
    iget-object v1, v2, Lhr6;->X:Lxa6;

    .line 49
    .line 50
    instance-of v2, v1, Lja6;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    check-cast v1, Lja6;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v1, v3

    .line 59
    :goto_1
    if-eqz v1, :cond_3

    .line 60
    .line 61
    iget-object v1, v1, Lja6;->a:Ljava/lang/annotation/Annotation;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object v1, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-static {v1}, Lms8;->p(Lgm;)Ljava/lang/annotation/Annotation;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_2
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-static {v0}, Lms8;->t(Ljava/util/List;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static final e(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final f(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Ljava/lang/Class;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_9

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_3
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_4
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_5
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    const-wide/16 v0, 0x0

    .line 105
    .line 106
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_6
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    const-wide/16 v0, 0x0

    .line 120
    .line 121
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_7
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    const-string p0, "Parameter with void type is illegal"

    .line 135
    .line 136
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_8
    const-string v0, "Unknown primitive: "

    .line 141
    .line 142
    invoke-static {p0, v0}, Lem7;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_9
    return-object v1
.end method

.method public static final g(Ljava/lang/Class;Lxl1;Lyp2;Lw15;Lux4;Ls50;Lrn2;)Ljd0;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ltx4;->a(Ljava/lang/Class;)Lgr6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    instance-of v0, p2, Lvy5;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, Lvy5;

    .line 20
    .line 21
    iget-object v0, v0, Lvy5;->k0:Ljava/util/List;

    .line 22
    .line 23
    :goto_0
    move-object v10, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    instance-of v0, p2, Lcz5;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move-object v0, p2

    .line 30
    check-cast v0, Lcz5;

    .line 31
    .line 32
    iget-object v0, v0, Lcz5;->k0:Ljava/util/List;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    new-instance v1, Ljl1;

    .line 36
    .line 37
    iget-object v2, p0, Lgr6;->a:Lhl1;

    .line 38
    .line 39
    iget-object v4, v2, Lhl1;->b:Lvx4;

    .line 40
    .line 41
    sget-object v6, Ldv8;->b:Ldv8;

    .line 42
    .line 43
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    move-object v8, p1

    .line 48
    move-object v3, p3

    .line 49
    move-object v5, p4

    .line 50
    move-object/from16 v7, p5

    .line 51
    .line 52
    invoke-direct/range {v1 .. v10}, Ljl1;-><init>(Lhl1;Lw15;Led1;Lux4;Ldv8;Ls50;Lxl1;Lfc8;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Lys4;

    .line 56
    .line 57
    invoke-direct {p0, v1}, Lys4;-><init>(Ljl1;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 p1, p6

    .line 61
    .line 62
    invoke-interface {p1, p0, p2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljd0;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    const-string p0, "Unsupported message: "

    .line 70
    .line 71
    invoke-static {p2, p0}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method

.method public static final h(Lej1;)Li44;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lej1;->V()Lld0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Llb6;->X:Lyu3;

    .line 9
    .line 10
    invoke-virtual {v1}, Lyu3;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Ly72;->f(Lkb6;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v1}, Lyu3;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-static {p0}, Ly72;->f(Lkb6;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-interface {p0}, Lkb6;->D()Lov3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of v0, p0, Lev3;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    check-cast p0, Lev3;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object p0, v3

    .line 48
    :goto_0
    if-eqz p0, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Lev3;->h0()Lsx4;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lsx4;->p0()Li44;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    instance-of p0, v0, La41;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    check-cast v0, La41;

    .line 64
    .line 65
    check-cast v0, Ljo2;

    .line 66
    .line 67
    iget-object p0, v0, Ljo2;->n0:Li44;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    invoke-interface {v0}, Ljd0;->P()Li44;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    invoke-interface {v0}, Led1;->p()Led1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p0, Lsx4;

    .line 84
    .line 85
    invoke-virtual {p0}, Lsx4;->p0()Li44;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_4
    :goto_1
    return-object v3
.end method

.method public static final i(Lpw3;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lpw3;->M()Llv3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lev3;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Lev3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lev3;->C()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Lev3;->i0()Lyy3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lyy3;->m:Ljava/lang/String;

    .line 33
    .line 34
    :cond_1
    if-eqz v1, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    return v0
.end method

.method public static final j(Lzu3;)Z
    .locals 9

    .line 1
    invoke-static {p0}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "value"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Ljava/lang/Class;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, [Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-object v2, v3

    .line 23
    :goto_0
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    array-length v4, v2

    .line 52
    move v5, v1

    .line 53
    :goto_1
    if-ge v5, v4, :cond_4

    .line 54
    .line 55
    aget-object v6, v2, v5

    .line 56
    .line 57
    invoke-static {v6}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-static {v7}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    sget-object v8, Lks3;->g:Lfk2;

    .line 70
    .line 71
    iget-object v8, v8, Lfk2;->a:Lgk2;

    .line 72
    .line 73
    iget-object v8, v8, Lgk2;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move-object v6, v3

    .line 86
    :goto_2
    if-nez v6, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    invoke-static {v6}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez v0, :cond_6

    .line 106
    .line 107
    :goto_3
    return v1

    .line 108
    :cond_6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0
.end method

.method public static final k(Lpw3;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lpw3;->z()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, p0

    .line 12
    check-cast v0, Lu1;

    .line 13
    .line 14
    invoke-virtual {v0}, Lu1;->T()Lu1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lms8;->k(Lpw3;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Lu1;->x()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-interface {p0}, Lpw3;->M()Llv3;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of v0, p0, Lrw3;

    .line 39
    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    check-cast p0, Lrw3;

    .line 43
    .line 44
    invoke-virtual {p0}, Lrw3;->getUpperBounds()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lpw3;

    .line 70
    .line 71
    invoke-static {v0}, Lms8;->k(Lpw3;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x1

    .line 78
    return p0

    .line 79
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 80
    return p0
.end method

.method public static final l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lqs0;->a()Lfk2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 9
    .line 10
    iget-object v1, v0, Lgk2;->a:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v2, Lms8;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, v2}, Lfm7;->J0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    sget-object v0, Loo2;->d:Loo2;

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    new-instance v1, Lqs0;

    .line 33
    .line 34
    iget-object v2, v0, Lso2;->a:Lfk2;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lso2;->a(I)Lv15;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v1, v2, p1}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v1, p2}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    sget-object v1, Lll3;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0}, Lll3;->h(Lgk2;)Lqs0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    move-object v0, p1

    .line 57
    :cond_1
    invoke-virtual {v0, p1}, Lqs0;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    const-class p0, Ldn8;

    .line 64
    .line 65
    invoke-static {p0}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_2
    iget-object p1, v0, Lqs0;->a:Lfk2;

    .line 70
    .line 71
    iget-object p1, p1, Lfk2;->a:Lgk2;

    .line 72
    .line 73
    iget-object p1, p1, Lgk2;->a:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, v0, Lqs0;->b:Lfk2;

    .line 76
    .line 77
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 78
    .line 79
    iget-object v0, v0, Lgk2;->a:Ljava/lang/String;

    .line 80
    .line 81
    const-string v1, "kotlin"

    .line 82
    .line 83
    invoke-static {p1, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_c

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sparse-switch v1, :sswitch_data_0

    .line 94
    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_0
    const-string v1, "LongArray"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_3

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    const-class p0, [J

    .line 108
    .line 109
    return-object p0

    .line 110
    :sswitch_1
    const-string v1, "FloatArray"

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_4

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    const-class p0, [F

    .line 120
    .line 121
    return-object p0

    .line 122
    :sswitch_2
    const-string v1, "IntArray"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_5

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    const-class p0, [I

    .line 132
    .line 133
    return-object p0

    .line 134
    :sswitch_3
    const-string v1, "Array"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_6

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    const-class p0, [Ljava/lang/Object;

    .line 144
    .line 145
    return-object p0

    .line 146
    :sswitch_4
    const-string v1, "DoubleArray"

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_7

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_7
    const-class p0, [D

    .line 156
    .line 157
    return-object p0

    .line 158
    :sswitch_5
    const-string v1, "ByteArray"

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_8

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_8
    const-class p0, [B

    .line 168
    .line 169
    return-object p0

    .line 170
    :sswitch_6
    const-string v1, "CharArray"

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_9

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_9
    const-class p0, [C

    .line 180
    .line 181
    return-object p0

    .line 182
    :sswitch_7
    const-string v1, "ShortArray"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-nez v1, :cond_a

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_a
    const-class p0, [S

    .line 192
    .line 193
    return-object p0

    .line 194
    :sswitch_8
    const-string v1, "BooleanArray"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-nez v1, :cond_b

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_b
    const-class p0, [Z

    .line 204
    .line 205
    return-object p0

    .line 206
    :cond_c
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const/4 v2, 0x0

    .line 212
    if-lez p2, :cond_e

    .line 213
    .line 214
    move v3, v2

    .line 215
    :goto_1
    if-ge v3, p2, :cond_d

    .line 216
    .line 217
    const-string v4, "["

    .line 218
    .line 219
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    add-int/lit8 v3, v3, 0x1

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_d
    const-string v3, "L"

    .line 226
    .line 227
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    :cond_e
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-lez v3, :cond_f

    .line 235
    .line 236
    const-string v3, "."

    .line 237
    .line 238
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    :cond_f
    const/16 p1, 0x2e

    .line 246
    .line 247
    const/16 v3, 0x24

    .line 248
    .line 249
    invoke-static {v0, p1, v3}, Lmm7;->X(Ljava/lang/String;CC)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    if-lez p2, :cond_10

    .line 257
    .line 258
    const-string p1, ";"

    .line 259
    .line 260
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    :cond_10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    :try_start_0
    invoke-static {p1, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    return-object p0

    .line 272
    :catch_0
    const/4 p0, 0x0

    .line 273
    return-object p0

    .line 274
    nop

    .line 275
    :sswitch_data_0
    .sparse-switch
        -0x35c13ccf -> :sswitch_8
        -0x2d7eb8a3 -> :sswitch_7
        -0x2d0e4b7d -> :sswitch_6
        -0x47759ef -> :sswitch_5
        0x15568e8 -> :sswitch_4
        0x3c98239 -> :sswitch_3
        0x23deebca -> :sswitch_2
        0x388e557d -> :sswitch_1
        0x7d6d891d -> :sswitch_0
    .end sparse-switch
.end method

.method public static final m(Ljava/lang/ClassLoader;Ljava/lang/String;Z)Lmj0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lms8;->o(Ljava/lang/String;)Llo2;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p1, Llo2;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {p0, v2, v3, v4}, Lms8;->n(Ljava/lang/ClassLoader;Ljava/lang/String;II)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p1, p1, Llo2;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-static {p0, p1, v3, p2}, Lms8;->n(Ljava/lang/ClassLoader;Ljava/lang/String;II)Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 p0, 0x0

    .line 64
    :goto_1
    new-instance p1, Lmj0;

    .line 65
    .line 66
    const/16 p2, 0x1a

    .line 67
    .line 68
    invoke-direct {p1, v1, p0, p2}, Lmj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    return-object p1
.end method

.method public static final n(Ljava/lang/ClassLoader;Ljava/lang/String;II)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x46

    .line 6
    .line 7
    if-eq v0, v1, :cond_7

    .line 8
    .line 9
    const/16 v1, 0x4c

    .line 10
    .line 11
    if-eq v0, v1, :cond_6

    .line 12
    .line 13
    const/16 v1, 0x53

    .line 14
    .line 15
    if-eq v0, v1, :cond_5

    .line 16
    .line 17
    const/16 v1, 0x56

    .line 18
    .line 19
    if-eq v0, v1, :cond_4

    .line 20
    .line 21
    const/16 v1, 0x49

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    const/16 v1, 0x4a

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x5a

    .line 30
    .line 31
    if-eq v0, v1, :cond_1

    .line 32
    .line 33
    const/16 v1, 0x5b

    .line 34
    .line 35
    if-eq v0, v1, :cond_0

    .line 36
    .line 37
    packed-switch v0, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    new-instance p0, Lp14;

    .line 41
    .line 42
    const-string p2, "Unknown type prefix in the method signature: "

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :pswitch_0
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    invoke-static {p0, p1, p2, p3}, Lms8;->n(Ljava/lang/ClassLoader;Ljava/lang/String;II)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lms8;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_2
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_3
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_5
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_6
    add-int/lit8 p2, p2, 0x1

    .line 91
    .line 92
    add-int/lit8 p3, p3, -0x1

    .line 93
    .line 94
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/16 p2, 0x2f

    .line 99
    .line 100
    const/16 p3, 0x2e

    .line 101
    .line 102
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_7
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final o(Ljava/lang/String;)Llo2;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/16 v4, 0x29

    .line 16
    .line 17
    if-eq v3, v4, :cond_3

    .line 18
    .line 19
    move v3, v2

    .line 20
    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/16 v5, 0x5b

    .line 25
    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, "VZCBSIFJD"

    .line 36
    .line 37
    invoke-static {v5, v4}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const/16 v3, 0x4c

    .line 47
    .line 48
    if-ne v4, v3, :cond_2

    .line 49
    .line 50
    const/16 v3, 0x3b

    .line 51
    .line 52
    const/4 v4, 0x4

    .line 53
    invoke-static {p0, v3, v2, v4}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v1

    .line 58
    :goto_2
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move v2, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance v0, Lp14;

    .line 68
    .line 69
    const-string v1, "Unknown type prefix in the method signature: "

    .line 70
    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-direct {v0, p0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_3
    add-int/2addr v2, v1

    .line 80
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v1, Llo2;

    .line 85
    .line 86
    invoke-direct {v1, p0, v0}, Llo2;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    return-object v1
.end method

.method public static final p(Lgm;)Ljava/lang/annotation/Annotation;
    .locals 6

    .line 1
    invoke-static {p0}, Lel1;->d(Lgm;)Lsx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lms8;->q(Lsx4;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move-object v0, v1

    .line 18
    :goto_1
    if-nez v0, :cond_2

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_2
    invoke-interface {p0}, Lgm;->e()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Iterable;

    .line 30
    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lv15;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ls21;

    .line 63
    .line 64
    invoke-static {v0}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v3, v5}, Lms8;->r(Ls21;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v4}, Lv15;->b()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v5, Lqg5;

    .line 79
    .line 80
    invoke-direct {v5, v4, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    move-object v5, v1

    .line 85
    :goto_3
    if-eqz v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    invoke-static {v2}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v0, p0}, Lw39;->q(Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ljava/lang/annotation/Annotation;

    .line 100
    .line 101
    return-object p0
.end method

.method public static final q(Lsx4;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-interface {p0}, Lgd1;->getSource()Lke7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, v0, Ll04;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ll04;

    .line 13
    .line 14
    iget-object p0, v0, Ll04;->X:Lqb6;

    .line 15
    .line 16
    iget-object p0, p0, Lqb6;->a:Ljava/lang/Class;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    instance-of v1, v0, Lhr6;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast v0, Lhr6;

    .line 24
    .line 25
    iget-object p0, v0, Lhr6;->X:Lxa6;

    .line 26
    .line 27
    check-cast p0, Lta6;

    .line 28
    .line 29
    iget-object p0, p0, Lta6;->a:Ljava/lang/Class;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-static {p0}, Lel1;->f(Lot0;)Lqs0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lia6;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-static {p0, v0, v1}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static final r(Ls21;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p0, Lqm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lqm;

    .line 6
    .line 7
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lgm;

    .line 10
    .line 11
    invoke-static {p0}, Lms8;->p(Lgm;)Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ldu;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_16

    .line 21
    .line 22
    check-cast p0, Ldu;

    .line 23
    .line 24
    instance-of v0, p0, Lgj8;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    check-cast v0, Lgj8;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v0, v2

    .line 33
    :goto_0
    if-eqz v0, :cond_1a

    .line 34
    .line 35
    iget-object v0, v0, Lgj8;->c:Lt14;

    .line 36
    .line 37
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v3, p0

    .line 40
    check-cast v3, Ljava/lang/Iterable;

    .line 41
    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    const/16 v5, 0xa

    .line 45
    .line 46
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ls21;

    .line 68
    .line 69
    invoke-static {v5, p1}, Lms8;->r(Ls21;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    sget-object v3, Lzz3;->e:Lv15;

    .line 78
    .line 79
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v3}, Llh8;->x()Lot0;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v3, :cond_3

    .line 88
    .line 89
    move-object v3, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-static {v3}, Lzz3;->s(Lot0;)Ldu5;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :goto_2
    if-nez v3, :cond_4

    .line 96
    .line 97
    const/4 v3, -0x1

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    sget-object v5, Lls8;->a:[I

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    aget v3, v5, v3

    .line 106
    .line 107
    :goto_3
    packed-switch v3, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    :pswitch_0
    invoke-static {}, Lb61;->c()V

    .line 111
    .line 112
    .line 113
    return-object v2

    .line 114
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    new-array p1, p0, [D

    .line 121
    .line 122
    :goto_4
    if-ge v1, p0, :cond_5

    .line 123
    .line 124
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    check-cast v0, Ljava/lang/Double;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 134
    .line 135
    .line 136
    move-result-wide v2

    .line 137
    aput-wide v2, p1, v1

    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    return-object p1

    .line 143
    :pswitch_2
    check-cast p0, Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    new-array p1, p0, [J

    .line 150
    .line 151
    :goto_5
    if-ge v1, p0, :cond_6

    .line 152
    .line 153
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v0, Ljava/lang/Long;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    aput-wide v2, p1, v1

    .line 167
    .line 168
    add-int/lit8 v1, v1, 0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_6
    return-object p1

    .line 172
    :pswitch_3
    check-cast p0, Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    new-array p1, p0, [F

    .line 179
    .line 180
    :goto_6
    if-ge v1, p0, :cond_7

    .line 181
    .line 182
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast v0, Ljava/lang/Float;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    aput v0, p1, v1

    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_7
    return-object p1

    .line 201
    :pswitch_4
    check-cast p0, Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    new-array p1, p0, [I

    .line 208
    .line 209
    :goto_7
    if-ge v1, p0, :cond_8

    .line 210
    .line 211
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    check-cast v0, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    aput v0, p1, v1

    .line 225
    .line 226
    add-int/lit8 v1, v1, 0x1

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_8
    return-object p1

    .line 230
    :pswitch_5
    check-cast p0, Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    new-array p1, p0, [S

    .line 237
    .line 238
    :goto_8
    if-ge v1, p0, :cond_9

    .line 239
    .line 240
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    check-cast v0, Ljava/lang/Short;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    aput-short v0, p1, v1

    .line 254
    .line 255
    add-int/lit8 v1, v1, 0x1

    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_9
    return-object p1

    .line 259
    :pswitch_6
    check-cast p0, Ljava/util/List;

    .line 260
    .line 261
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    new-array p1, p0, [B

    .line 266
    .line 267
    :goto_9
    if-ge v1, p0, :cond_a

    .line 268
    .line 269
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    check-cast v0, Ljava/lang/Byte;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    aput-byte v0, p1, v1

    .line 283
    .line 284
    add-int/lit8 v1, v1, 0x1

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_a
    return-object p1

    .line 288
    :pswitch_7
    check-cast p0, Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    new-array p1, p0, [C

    .line 295
    .line 296
    :goto_a
    if-ge v1, p0, :cond_b

    .line 297
    .line 298
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast v0, Ljava/lang/Character;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    aput-char v0, p1, v1

    .line 312
    .line 313
    add-int/lit8 v1, v1, 0x1

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_b
    return-object p1

    .line 317
    :pswitch_8
    check-cast p0, Ljava/util/List;

    .line 318
    .line 319
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    new-array p1, p0, [Z

    .line 324
    .line 325
    :goto_b
    if-ge v1, p0, :cond_c

    .line 326
    .line 327
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    check-cast v0, Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    aput-boolean v0, p1, v1

    .line 341
    .line 342
    add-int/lit8 v1, v1, 0x1

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_c
    return-object p1

    .line 346
    :pswitch_9
    invoke-static {v0}, Lzz3;->z(Lt14;)Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_15

    .line 351
    .line 352
    invoke-virtual {v0}, Lt14;->l0()Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Lni8;

    .line 361
    .line 362
    invoke-virtual {v0}, Lni8;->b()Lt14;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Lt14;->n0()Llh8;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-interface {v3}, Llh8;->x()Lot0;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    instance-of v5, v3, Lsx4;

    .line 378
    .line 379
    if-eqz v5, :cond_d

    .line 380
    .line 381
    check-cast v3, Lsx4;

    .line 382
    .line 383
    goto :goto_c

    .line 384
    :cond_d
    move-object v3, v2

    .line 385
    :goto_c
    if-eqz v3, :cond_14

    .line 386
    .line 387
    invoke-static {v0}, Lzz3;->I(Lt14;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_f

    .line 392
    .line 393
    check-cast p0, Ljava/util/List;

    .line 394
    .line 395
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 396
    .line 397
    .line 398
    move-result p0

    .line 399
    new-array p1, p0, [Ljava/lang/String;

    .line 400
    .line 401
    :goto_d
    if-ge v1, p0, :cond_e

    .line 402
    .line 403
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    aput-object v0, p1, v1

    .line 411
    .line 412
    add-int/lit8 v1, v1, 0x1

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_e
    return-object p1

    .line 416
    :cond_f
    sget-object v0, Ltg7;->Q:Lgk2;

    .line 417
    .line 418
    invoke-static {v3, v0}, Lzz3;->b(Lsx4;Lgk2;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_11

    .line 423
    .line 424
    check-cast p0, Ljava/util/List;

    .line 425
    .line 426
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    new-array p1, p0, [Ljava/lang/Class;

    .line 431
    .line 432
    :goto_e
    if-ge v1, p0, :cond_10

    .line 433
    .line 434
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    aput-object v0, p1, v1

    .line 442
    .line 443
    add-int/lit8 v1, v1, 0x1

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_10
    return-object p1

    .line 447
    :cond_11
    invoke-static {v3}, Lel1;->f(Lot0;)Lqs0;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    if-eqz v0, :cond_1a

    .line 452
    .line 453
    invoke-static {p1, v0, v1}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    if-nez p1, :cond_12

    .line 458
    .line 459
    goto/16 :goto_11

    .line 460
    .line 461
    :cond_12
    check-cast p0, Ljava/util/List;

    .line 462
    .line 463
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 464
    .line 465
    .line 466
    move-result p0

    .line 467
    invoke-static {p1, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    check-cast p0, [Ljava/lang/Object;

    .line 475
    .line 476
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    :goto_f
    if-ge v1, p1, :cond_13

    .line 481
    .line 482
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    aput-object v0, p0, v1

    .line 487
    .line 488
    add-int/lit8 v1, v1, 0x1

    .line 489
    .line 490
    goto :goto_f

    .line 491
    :cond_13
    return-object p0

    .line 492
    :cond_14
    const-string p0, "Not a class type: "

    .line 493
    .line 494
    invoke-static {v0, p0}, Lb61;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    return-object v2

    .line 498
    :cond_15
    const-string p0, "Not an array type: "

    .line 499
    .line 500
    invoke-static {v0, p0}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    return-object v2

    .line 504
    :cond_16
    instance-of v0, p0, Lx22;

    .line 505
    .line 506
    if-eqz v0, :cond_17

    .line 507
    .line 508
    check-cast p0, Lx22;

    .line 509
    .line 510
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast p0, Lqg5;

    .line 513
    .line 514
    iget-object v0, p0, Lqg5;->X:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v0, Lqs0;

    .line 517
    .line 518
    iget-object p0, p0, Lqg5;->Y:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast p0, Lv15;

    .line 521
    .line 522
    invoke-static {p1, v0, v1}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    if-eqz p1, :cond_1a

    .line 527
    .line 528
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    invoke-static {p1, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    return-object p0

    .line 537
    :cond_17
    instance-of v0, p0, Lkv3;

    .line 538
    .line 539
    if-eqz v0, :cond_1c

    .line 540
    .line 541
    check-cast p0, Lkv3;

    .line 542
    .line 543
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast p0, Ljv3;

    .line 546
    .line 547
    instance-of v0, p0, Liv3;

    .line 548
    .line 549
    if-eqz v0, :cond_18

    .line 550
    .line 551
    check-cast p0, Liv3;

    .line 552
    .line 553
    iget-object p0, p0, Liv3;->a:Lvs0;

    .line 554
    .line 555
    iget-object v0, p0, Lvs0;->a:Lqs0;

    .line 556
    .line 557
    iget p0, p0, Lvs0;->b:I

    .line 558
    .line 559
    invoke-static {p1, v0, p0}, Lms8;->l(Ljava/lang/ClassLoader;Lqs0;I)Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    return-object p0

    .line 564
    :cond_18
    instance-of p1, p0, Lhv3;

    .line 565
    .line 566
    if-eqz p1, :cond_1b

    .line 567
    .line 568
    check-cast p0, Lhv3;

    .line 569
    .line 570
    iget-object p0, p0, Lhv3;->a:Lt14;

    .line 571
    .line 572
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    invoke-interface {p0}, Llh8;->x()Lot0;

    .line 577
    .line 578
    .line 579
    move-result-object p0

    .line 580
    instance-of p1, p0, Lsx4;

    .line 581
    .line 582
    if-eqz p1, :cond_19

    .line 583
    .line 584
    check-cast p0, Lsx4;

    .line 585
    .line 586
    goto :goto_10

    .line 587
    :cond_19
    move-object p0, v2

    .line 588
    :goto_10
    if-eqz p0, :cond_1a

    .line 589
    .line 590
    invoke-static {p0}, Lms8;->q(Lsx4;)Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    return-object p0

    .line 595
    :cond_1a
    :goto_11
    return-object v2

    .line 596
    :cond_1b
    invoke-static {}, Lb61;->c()V

    .line 597
    .line 598
    .line 599
    return-object v2

    .line 600
    :cond_1c
    instance-of p1, p0, Lv32;

    .line 601
    .line 602
    if-nez p1, :cond_1e

    .line 603
    .line 604
    instance-of p1, p0, Le75;

    .line 605
    .line 606
    if-eqz p1, :cond_1d

    .line 607
    .line 608
    return-object v2

    .line 609
    :cond_1d
    invoke-virtual {p0}, Ls21;->b()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    return-object p0

    .line 614
    :cond_1e
    return-object v2

    .line 615
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final s(Lpw3;)Lpw3;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lpw3;->M()Llv3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lev3;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Lev3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lev3;->Z:Lg44;

    .line 20
    .line 21
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcv3;

    .line 26
    .line 27
    iget-object p0, p0, Lcv3;->l:Lg44;

    .line 28
    .line 29
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lpw3;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    return-object v1
.end method

.method public static final t(Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    invoke-static {v1}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "Container"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/annotation/Annotation;

    .line 65
    .line 66
    invoke-static {v1}, Lzc1;->K(Ljava/lang/annotation/Annotation;)Lzu3;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v3}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    const-class v5, Lde6;

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    invoke-static {v3}, Lzc1;->M(Lzu3;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v4, "value"

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v1, [Ljava/lang/annotation/Annotation;

    .line 111
    .line 112
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_1
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    return-object v0

    .line 129
    :cond_4
    :goto_2
    return-object p0
.end method
