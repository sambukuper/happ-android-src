.class public final Lus3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Li7;
.implements Lpo5;


# static fields
.field public static final synthetic j0:[Lnw3;


# instance fields
.field public final X:Lwx4;

.field public final Y:Lte4;

.field public final Z:Laa7;

.field public final f0:Lte4;

.field public final g0:Lpe4;

.field public final h0:Lte4;

.field public final i0:Lpe4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lus3;

    .line 4
    .line 5
    const-string v2, "settings"

    .line 6
    .line 7
    const-string v3, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Llx5;

    .line 14
    .line 15
    const-string v3, "cloneableType"

    .line 16
    .line 17
    const-string v5, "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Llx5;

    .line 23
    .line 24
    const-string v5, "notConsideredDeprecation"

    .line 25
    .line 26
    const-string v6, "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [Lnw3;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, Lus3;->j0:[Lnw3;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Lwx4;Lve4;Lzk3;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lus3;->X:Lwx4;

    .line 5
    .line 6
    new-instance v0, Lte4;

    .line 7
    .line 8
    invoke-direct {v0, p2, p3}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lus3;->Y:Lte4;

    .line 12
    .line 13
    new-instance p3, Lfk2;

    .line 14
    .line 15
    const-string v0, "java.io"

    .line 16
    .line 17
    invoke-direct {p3, v0}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lh02;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {v2, p1, p3, v0}, Lh02;-><init>(Lvx4;Lfk2;B)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lz74;

    .line 27
    .line 28
    new-instance p3, Lss3;

    .line 29
    .line 30
    invoke-direct {p3, p0, v0}, Lss3;-><init>(Lus3;B)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2, p3}, Lz74;-><init>(Lve4;Ldn2;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    new-instance v1, Lms0;

    .line 41
    .line 42
    const-string p1, "Serializable"

    .line 43
    .line 44
    invoke-static {p1}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    sget-object v4, Lfx4;->g0:Lfx4;

    .line 49
    .line 50
    sget-object v5, Lus0;->Y:Lus0;

    .line 51
    .line 52
    move-object v7, p2

    .line 53
    invoke-direct/range {v1 .. v7}, Lms0;-><init>(Led1;Lv15;Lfx4;Lus0;Ljava/util/Collection;Lve4;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lm02;->X:Lm02;

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    sget-object p3, Ldt4;->b:Ldt4;

    .line 60
    .line 61
    invoke-virtual {v1, p3, p1, p2}, Lms0;->B0(Let4;Ljava/util/Set;Lgs0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lm0;->X()Laa7;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lus3;->Z:Laa7;

    .line 69
    .line 70
    new-instance p1, Lc3;

    .line 71
    .line 72
    const/16 p2, 0x15

    .line 73
    .line 74
    invoke-direct {p1, p0, v7, p2}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    new-instance p2, Lte4;

    .line 78
    .line 79
    invoke-direct {p2, v7, p1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 80
    .line 81
    .line 82
    iput-object p2, p0, Lus3;->f0:Lte4;

    .line 83
    .line 84
    new-instance p1, Lpe4;

    .line 85
    .line 86
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    const/high16 p3, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const/4 v0, 0x2

    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-direct {p2, v1, p3, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 93
    .line 94
    .line 95
    new-instance p3, Lve7;

    .line 96
    .line 97
    const/16 v0, 0xf

    .line 98
    .line 99
    invoke-direct {p3, v0}, Lve7;-><init>(B)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {p1, v7, p2, p3, v0}, Lpe4;-><init>(Lve4;Ljava/util/concurrent/ConcurrentHashMap;Lgn2;B)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lus3;->g0:Lpe4;

    .line 107
    .line 108
    new-instance p1, Lss3;

    .line 109
    .line 110
    invoke-direct {p1, p0, v0}, Lss3;-><init>(Lus3;B)V

    .line 111
    .line 112
    .line 113
    new-instance p2, Lte4;

    .line 114
    .line 115
    invoke-direct {p2, v7, p1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 116
    .line 117
    .line 118
    iput-object p2, p0, Lus3;->h0:Lte4;

    .line 119
    .line 120
    new-instance p1, Lf0;

    .line 121
    .line 122
    const/16 p2, 0x12

    .line 123
    .line 124
    invoke-direct {p1, p0, p2}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, p1}, Lve4;->b(Lgn2;)Lpe4;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lus3;->i0:Lpe4;

    .line 132
    .line 133
    return-void
.end method


# virtual methods
.method public final K(Lsx4;Ljm1;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lus3;->a(Lsx4;)Lp44;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcw0;->getAnnotations()Lsm;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lqo5;->a:Lfk2;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lsm;->k(Lfk2;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p0}, Lus3;->b()Lqs3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    invoke-static {p2, p0}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1}, Lp44;->B0()Lt44;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2}, Lfd1;->getName()Lv15;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object v1, Lx45;->X:Lx45;

    .line 48
    .line 49
    invoke-virtual {p1, p2, v1}, Lt44;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Iterable;

    .line 54
    .line 55
    instance-of p2, p1, Ljava/util/Collection;

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    move-object p2, p1

    .line 60
    check-cast p2, Ljava/util/Collection;

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Lq97;

    .line 84
    .line 85
    invoke-static {p2, p0}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_3

    .line 94
    .line 95
    :goto_0
    const/4 p0, 0x1

    .line 96
    return p0

    .line 97
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 98
    return p0
.end method

.method public final a(Lsx4;)Lp44;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    sget-object v1, Ltg7;->a:Lgk2;

    .line 5
    .line 6
    invoke-static {p1, v1}, Lzz3;->b(Lsx4;Lgk2;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lzz3;->K(Led1;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    sget v1, Lel1;->a:I

    .line 21
    .line 22
    invoke-static {p1}, Lbl1;->f(Led1;)Lgk2;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lgk2;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    sget-object v1, Lll3;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1}, Lll3;->h(Lgk2;)Lqs0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lqs0;->a()Lfk2;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p0}, Lus3;->b()Lqs3;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object p0, p0, Lqs3;->a:Lwx4;

    .line 56
    .line 57
    invoke-static {p0, p1}, Lvr3;->W(Lvx4;Lfk2;)Lsx4;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    instance-of p1, p0, Lp44;

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    check-cast p0, Lp44;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    :goto_0
    return-object v0

    .line 69
    :cond_5
    const/16 p0, 0x6c

    .line 70
    .line 71
    invoke-static {p0}, Lzz3;->a(I)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public final b()Lqs3;
    .locals 2

    .line 1
    sget-object v0, Lus3;->j0:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lus3;->Y:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lqs3;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e(Lsx4;)Ljava/util/Collection;
    .locals 15

    .line 1
    sget-object v0, Lqe4;->A0:Lqe4;

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lsx4;->g0()Lus0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lus0;->X:Lus0;

    .line 8
    .line 9
    if-ne v1, v2, :cond_e

    .line 10
    .line 11
    invoke-virtual {p0}, Lus3;->b()Lqs3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p1}, Lus3;->a(Lsx4;)Lp44;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_0
    invoke-static {v1}, Lel1;->g(Led1;)Lfk2;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, La82;->f:La82;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v4, Lll3;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, Lll3;->g(Lfk2;)Lqs0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2}, Lqs0;->a()Lfk2;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v3, v2}, Lzz3;->j(Lfk2;)Lsx4;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v2, v4

    .line 54
    :goto_0
    if-nez v2, :cond_2

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_2
    invoke-static {v2, v1}, Lw79;->q(Lsx4;Lsx4;)Lxg7;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v5, Lwi8;

    .line 63
    .line 64
    invoke-direct {v5, v3}, Lwi8;-><init>(Lui8;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, v1, Lp44;->s0:Lt44;

    .line 68
    .line 69
    iget-object v3, v3, Lt44;->q:Lte4;

    .line 70
    .line 71
    invoke-virtual {v3}, Lte4;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/util/List;

    .line 76
    .line 77
    new-instance v6, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    const/16 v8, 0x2e

    .line 91
    .line 92
    const/4 v9, 0x3

    .line 93
    const/4 v10, 0x1

    .line 94
    if-eqz v7, :cond_a

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    move-object v11, v7

    .line 101
    check-cast v11, Lgs0;

    .line 102
    .line 103
    invoke-virtual {v11}, Ljo2;->e()Lfl1;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    iget-object v12, v12, Lfl1;->a:Ll5;

    .line 108
    .line 109
    iget-boolean v12, v12, Ll5;->Y:Z

    .line 110
    .line 111
    if-eqz v12, :cond_3

    .line 112
    .line 113
    invoke-virtual {v2}, Lsx4;->B()Ljava/util/Collection;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast v12, Ljava/lang/Iterable;

    .line 121
    .line 122
    instance-of v13, v12, Ljava/util/Collection;

    .line 123
    .line 124
    if-eqz v13, :cond_4

    .line 125
    .line 126
    move-object v13, v12

    .line 127
    check-cast v13, Ljava/util/Collection;

    .line 128
    .line 129
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    if-eqz v13, :cond_4

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    :cond_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_6

    .line 145
    .line 146
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Lgs0;

    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v5}, Lgs0;->W0(Lwi8;)Lgs0;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-static {v13, v14}, Lhf5;->j(Ljd0;Ljd0;)I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-ne v13, v10, :cond_5

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    :goto_2
    invoke-virtual {v11}, Ljo2;->L()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-ne v12, v10, :cond_8

    .line 175
    .line 176
    invoke-virtual {v11}, Ljo2;->L()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v10}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, Lot8;

    .line 188
    .line 189
    invoke-virtual {v10}, Lqt8;->c()Lt14;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-virtual {v10}, Lt14;->n0()Llh8;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-interface {v10}, Llh8;->x()Lot0;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    if-eqz v10, :cond_7

    .line 202
    .line 203
    sget v12, Lel1;->a:I

    .line 204
    .line 205
    invoke-static {v10}, Lbl1;->f(Led1;)Lgk2;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    move-object v10, v4

    .line 214
    :goto_3
    invoke-static/range {p1 .. p1}, Lbl1;->f(Led1;)Lgk2;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v10, v12}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_8

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_8
    invoke-static {v11}, Lzz3;->D(Lhd1;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-nez v10, :cond_3

    .line 234
    .line 235
    sget-object v10, Lxs3;->f:Ljava/util/LinkedHashSet;

    .line 236
    .line 237
    invoke-static {v11, v9}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    sget-object v11, Lll3;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v1}, Lel1;->g(Led1;)Lfk2;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    iget-object v11, v11, Lfk2;->a:Lgk2;

    .line 248
    .line 249
    invoke-static {v11}, Lll3;->h(Lgk2;)Lqs0;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    if-eqz v11, :cond_9

    .line 254
    .line 255
    invoke-static {v11}, Lzs3;->b(Lqs0;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    goto :goto_4

    .line 260
    :cond_9
    invoke-static {v1, v0}, Lz51;->t(Lsx4;Lqe4;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    :goto_4
    new-instance v12, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-interface {v10, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-nez v8, :cond_3

    .line 284
    .line 285
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto/16 :goto_1

    .line 289
    .line 290
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    const/16 v3, 0xa

    .line 293
    .line 294
    invoke-static {v6, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_d

    .line 310
    .line 311
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    check-cast v4, Lgs0;

    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    sget-object v6, Lwi8;->b:Lwi8;

    .line 321
    .line 322
    invoke-virtual {v4, v6}, Ljo2;->M0(Lwi8;)Lio2;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    move-object/from16 v7, p1

    .line 327
    .line 328
    iput-object v7, v6, Lio2;->Y:Led1;

    .line 329
    .line 330
    invoke-virtual {v7}, Lsx4;->X()Laa7;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    invoke-virtual {v6, v11}, Lio2;->r(Lt14;)Lgo2;

    .line 335
    .line 336
    .line 337
    iput-boolean v10, v6, Lio2;->q0:Z

    .line 338
    .line 339
    iget-object v11, v5, Lwi8;->a:Lui8;

    .line 340
    .line 341
    iput-object v11, v6, Lio2;->X:Lui8;

    .line 342
    .line 343
    sget-object v11, Lxs3;->g:Ljava/util/LinkedHashSet;

    .line 344
    .line 345
    invoke-static {v4, v9}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    sget-object v12, Lll3;->a:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {v1}, Lel1;->g(Led1;)Lfk2;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    iget-object v12, v12, Lfk2;->a:Lgk2;

    .line 356
    .line 357
    invoke-static {v12}, Lll3;->h(Lgk2;)Lqs0;

    .line 358
    .line 359
    .line 360
    move-result-object v12

    .line 361
    if-eqz v12, :cond_b

    .line 362
    .line 363
    invoke-static {v12}, Lzs3;->b(Lqs0;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v12

    .line 367
    goto :goto_6

    .line 368
    :cond_b
    invoke-static {v1, v0}, Lz51;->t(Lsx4;Lqe4;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    :goto_6
    new-instance v13, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {v13, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-interface {v11, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-nez v4, :cond_c

    .line 392
    .line 393
    sget-object v4, Lus3;->j0:[Lnw3;

    .line 394
    .line 395
    const/4 v11, 0x2

    .line 396
    aget-object v4, v4, v11

    .line 397
    .line 398
    iget-object v11, p0, Lus3;->h0:Lte4;

    .line 399
    .line 400
    invoke-static {v11, v4}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    check-cast v4, Lsm;

    .line 405
    .line 406
    invoke-virtual {v6, v4}, Lio2;->n(Lsm;)Lgo2;

    .line 407
    .line 408
    .line 409
    :cond_c
    iget-object v4, v6, Lio2;->z0:Ljo2;

    .line 410
    .line 411
    invoke-virtual {v4, v6}, Ljo2;->J0(Lio2;)Ljo2;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    check-cast v4, Lgs0;

    .line 419
    .line 420
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_d
    return-object v2

    .line 425
    :cond_e
    :goto_7
    sget-object p0, Ld02;->X:Ld02;

    .line 426
    .line 427
    return-object p0
.end method

.method public final f(Lsx4;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lus3;->b()Lqs3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lus3;->a(Lsx4;)Lp44;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lp44;->B0()Lt44;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lf54;->c()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    :cond_0
    sget-object p0, Lm02;->X:Lm02;

    .line 28
    .line 29
    :cond_1
    check-cast p0, Ljava/util/Collection;

    .line 30
    .line 31
    return-object p0
.end method

.method public final k(Lsx4;)Ljava/util/Collection;
    .locals 6

    .line 1
    sget v0, Lel1;->a:I

    .line 2
    .line 3
    invoke-static {p1}, Lbl1;->f(Led1;)Lgk2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lxs3;->a:Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    sget-object v0, Ltg7;->g:Lgk2;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lgk2;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    iget-object v4, p0, Lus3;->Z:Laa7;

    .line 21
    .line 22
    if-nez v1, :cond_5

    .line 23
    .line 24
    sget-object v1, Ltg7;->g0:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-virtual {p1, v0}, Lgk2;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object p0, Lll3;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p1}, Lll3;->h(Lgk2;)Lqs0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lqs0;->a()Lfk2;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p0, p0, Lfk2;->a:Lgk2;

    .line 60
    .line 61
    iget-object p0, p0, Lgk2;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    const-class p1, Ljava/io/Serializable;

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    move v2, v3

    .line 75
    :catch_0
    :goto_1
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-static {v4}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    sget-object p0, Ld02;->X:Ld02;

    .line 83
    .line 84
    :goto_2
    return-object p0

    .line 85
    :cond_5
    :goto_3
    sget-object p1, Lus3;->j0:[Lnw3;

    .line 86
    .line 87
    aget-object p1, p1, v3

    .line 88
    .line 89
    iget-object p0, p0, Lus3;->f0:Lte4;

    .line 90
    .line 91
    invoke-static {p0, p1}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Laa7;

    .line 96
    .line 97
    const/4 p1, 0x2

    .line 98
    new-array p1, p1, [Lt14;

    .line 99
    .line 100
    aput-object p0, p1, v2

    .line 101
    .line 102
    aput-object v4, p1, v3

    .line 103
    .line 104
    invoke-static {p1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public final l(Lv15;Lsx4;)Ljava/util/Collection;
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lqu0;->e:Lv15;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sget-object v1, Lx45;->X:Lx45;

    .line 11
    .line 12
    sget-object v2, Lus3;->j0:[Lnw3;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    sget-object v4, Ld02;->X:Ld02;

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    instance-of v0, p2, Lvl1;

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    sget-object v0, Ltg7;->g:Lgk2;

    .line 24
    .line 25
    invoke-static {p2, v0}, Lzz3;->b(Lsx4;Lgk2;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-static {p2}, Lzz3;->s(Lot0;)Ldu5;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    :cond_0
    check-cast p2, Lvl1;

    .line 38
    .line 39
    iget-object v0, p2, Lvl1;->g0:Lfy5;

    .line 40
    .line 41
    iget-object v0, v0, Lfy5;->s0:Ljava/util/List;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_3

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lvy5;

    .line 68
    .line 69
    iget-object v6, p2, Lvl1;->n0:Ljl1;

    .line 70
    .line 71
    iget-object v6, v6, Ljl1;->Y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Lw15;

    .line 74
    .line 75
    iget v5, v5, Lvy5;->h0:I

    .line 76
    .line 77
    invoke-static {v6, v5}, Lu70;->S(Lw15;I)Lv15;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    sget-object v6, Lqu0;->e:Lv15;

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Lv15;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    return-object v4

    .line 90
    :cond_3
    :goto_0
    iget-object p0, p0, Lus3;->f0:Lte4;

    .line 91
    .line 92
    aget-object v0, v2, v3

    .line 93
    .line 94
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Laa7;

    .line 99
    .line 100
    invoke-virtual {p0}, Lt14;->K()Let4;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-interface {p0, p1, v1}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-static {p0}, Lwv0;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lq97;

    .line 115
    .line 116
    invoke-interface {p0}, Lho2;->i0()Lgo2;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0, p2}, Lgo2;->w(Led1;)Lgo2;

    .line 121
    .line 122
    .line 123
    sget-object p1, Lgl1;->e:Lfl1;

    .line 124
    .line 125
    invoke-interface {p0, p1}, Lgo2;->k(Lfl1;)Lgo2;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Lm0;->X()Laa7;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p0, p1}, Lgo2;->r(Lt14;)Lgo2;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Lm0;->p0()Li44;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p0, p1}, Lgo2;->f(Li44;)Lgo2;

    .line 140
    .line 141
    .line 142
    invoke-interface {p0}, Lgo2;->build()Lho2;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast p0, Lq97;

    .line 150
    .line 151
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0

    .line 156
    :cond_4
    invoke-virtual {p0}, Lus3;->b()Lqs3;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p2}, Lus3;->a(Lsx4;)Lp44;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const/4 v5, 0x3

    .line 168
    const/4 v6, 0x0

    .line 169
    if-nez v0, :cond_5

    .line 170
    .line 171
    goto/16 :goto_b

    .line 172
    .line 173
    :cond_5
    invoke-static {v0}, Lel1;->g(Led1;)Lfk2;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v8, La82;->f:La82;

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    sget-object v9, Lll3;->a:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v7}, Lll3;->g(Lfk2;)Lqs0;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    if-eqz v7, :cond_6

    .line 189
    .line 190
    invoke-virtual {v7}, Lqs0;->a()Lfk2;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-virtual {v8, v7}, Lzz3;->j(Lfk2;)Lsx4;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    goto :goto_1

    .line 199
    :cond_6
    move-object v7, v6

    .line 200
    :goto_1
    if-nez v7, :cond_7

    .line 201
    .line 202
    sget-object v7, Lm02;->X:Lm02;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_7
    invoke-static {v7}, Lbl1;->f(Led1;)Lgk2;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    sget-object v10, Lll3;->k:Ljava/util/HashMap;

    .line 213
    .line 214
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    check-cast v9, Lfk2;

    .line 219
    .line 220
    if-nez v9, :cond_8

    .line 221
    .line 222
    invoke-static {v7}, Lw45;->U(Ljava/lang/Object;)Ljava/util/Set;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    check-cast v7, Ljava/util/Collection;

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_8
    invoke-virtual {v8, v9}, Lzz3;->j(Lfk2;)Lsx4;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    filled-new-array {v7, v8}, [Lsx4;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-static {v7}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    :goto_2
    check-cast v7, Ljava/lang/Iterable;

    .line 242
    .line 243
    instance-of v8, v7, Ljava/util/List;

    .line 244
    .line 245
    if-eqz v8, :cond_a

    .line 246
    .line 247
    move-object v8, v7

    .line 248
    check-cast v8, Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_9

    .line 255
    .line 256
    :goto_3
    move-object v8, v6

    .line 257
    goto :goto_5

    .line 258
    :cond_9
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    sub-int/2addr v9, v3

    .line 263
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    goto :goto_5

    .line 268
    :cond_a
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-nez v9, :cond_b

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-eqz v10, :cond_c

    .line 288
    .line 289
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    goto :goto_4

    .line 294
    :cond_c
    move-object v8, v9

    .line 295
    :goto_5
    check-cast v8, Lsx4;

    .line 296
    .line 297
    if-nez v8, :cond_d

    .line 298
    .line 299
    goto/16 :goto_b

    .line 300
    .line 301
    :cond_d
    sget v4, Lpc7;->Z:I

    .line 302
    .line 303
    new-instance v4, Ljava/util/ArrayList;

    .line 304
    .line 305
    const/16 v9, 0xa

    .line 306
    .line 307
    invoke-static {v7, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    if-eqz v9, :cond_e

    .line 323
    .line 324
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    check-cast v9, Lsx4;

    .line 329
    .line 330
    invoke-static {v9}, Lel1;->g(Led1;)Lfk2;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :cond_e
    new-instance v7, Lpc7;

    .line 339
    .line 340
    invoke-direct {v7}, Lh2;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 344
    .line 345
    .line 346
    sget-object v4, Lll3;->a:Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {p2}, Lbl1;->f(Led1;)Lgk2;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    sget-object v9, Lll3;->j:Ljava/util/HashMap;

    .line 353
    .line 354
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    invoke-static {v0}, Lel1;->g(Led1;)Lfk2;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    new-instance v10, Lc3;

    .line 363
    .line 364
    const/16 v11, 0x16

    .line 365
    .line 366
    invoke-direct {v10, v0, v8, v11}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 367
    .line 368
    .line 369
    iget-object v0, p0, Lus3;->g0:Lpe4;

    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance v8, Lre4;

    .line 375
    .line 376
    invoke-direct {v8, v9, v10}, Lre4;-><init>(Ljava/lang/Object;Ldn2;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v8}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    if-eqz v0, :cond_23

    .line 384
    .line 385
    check-cast v0, Lsx4;

    .line 386
    .line 387
    invoke-virtual {v0}, Lsx4;->r0()Let4;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-interface {v0, p1, v1}, Let4;->b(Lv15;Lx45;)Ljava/util/Collection;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    check-cast p1, Ljava/lang/Iterable;

    .line 399
    .line 400
    new-instance v0, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 403
    .line 404
    .line 405
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    :cond_f
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_18

    .line 414
    .line 415
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    move-object v8, v1

    .line 420
    check-cast v8, Lq97;

    .line 421
    .line 422
    invoke-virtual {v8}, Ljo2;->r()I

    .line 423
    .line 424
    .line 425
    move-result v9

    .line 426
    if-eq v9, v3, :cond_10

    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_10
    invoke-virtual {v8}, Ljo2;->e()Lfl1;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    iget-object v9, v9, Lfl1;->a:Ll5;

    .line 434
    .line 435
    iget-boolean v9, v9, Ll5;->Y:Z

    .line 436
    .line 437
    if-nez v9, :cond_11

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_11
    invoke-static {v8}, Lzz3;->D(Lhd1;)Z

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-eqz v9, :cond_12

    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_12
    invoke-virtual {v8}, Ljo2;->q()Ljava/util/Collection;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    check-cast v9, Ljava/lang/Iterable;

    .line 452
    .line 453
    instance-of v10, v9, Ljava/util/Collection;

    .line 454
    .line 455
    if-eqz v10, :cond_13

    .line 456
    .line 457
    move-object v10, v9

    .line 458
    check-cast v10, Ljava/util/Collection;

    .line 459
    .line 460
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    if-eqz v10, :cond_13

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_13
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    :cond_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    if-eqz v10, :cond_15

    .line 476
    .line 477
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v10

    .line 481
    check-cast v10, Lho2;

    .line 482
    .line 483
    invoke-interface {v10}, Led1;->p()Led1;

    .line 484
    .line 485
    .line 486
    move-result-object v10

    .line 487
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-static {v10}, Lel1;->g(Led1;)Lfk2;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    invoke-virtual {v7, v10}, Lpc7;->contains(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    if-eqz v10, :cond_14

    .line 499
    .line 500
    goto :goto_7

    .line 501
    :cond_15
    :goto_8
    invoke-virtual {v8}, Lhd1;->p()Led1;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    check-cast v9, Lsx4;

    .line 509
    .line 510
    invoke-static {v8, v5}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    sget-object v11, Lxs3;->e:Ljava/util/LinkedHashSet;

    .line 515
    .line 516
    sget-object v12, Lll3;->a:Ljava/lang/String;

    .line 517
    .line 518
    invoke-static {v9}, Lel1;->g(Led1;)Lfk2;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    iget-object v12, v12, Lfk2;->a:Lgk2;

    .line 523
    .line 524
    invoke-static {v12}, Lll3;->h(Lgk2;)Lqs0;

    .line 525
    .line 526
    .line 527
    move-result-object v12

    .line 528
    if-eqz v12, :cond_16

    .line 529
    .line 530
    invoke-static {v12}, Lzs3;->b(Lqs0;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    goto :goto_9

    .line 535
    :cond_16
    sget-object v12, Lqe4;->A0:Lqe4;

    .line 536
    .line 537
    invoke-static {v9, v12}, Lz51;->t(Lsx4;Lqe4;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v9

    .line 541
    :goto_9
    new-instance v12, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    const/16 v9, 0x2e

    .line 547
    .line 548
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    invoke-interface {v11, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    xor-int/2addr v9, v4

    .line 563
    if-eqz v9, :cond_17

    .line 564
    .line 565
    move v8, v3

    .line 566
    goto :goto_a

    .line 567
    :cond_17
    invoke-static {v8}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    sget-object v9, Lpz2;->X0:Lpz2;

    .line 572
    .line 573
    new-instance v10, Lve7;

    .line 574
    .line 575
    const/16 v11, 0xe

    .line 576
    .line 577
    invoke-direct {v10, p0, v11}, Lve7;-><init>(Ljava/lang/Object;B)V

    .line 578
    .line 579
    .line 580
    invoke-static {v8, v9, v10}, Ljb5;->w(Ljava/util/List;Ld91;Lgn2;)Ljava/lang/Boolean;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 588
    .line 589
    .line 590
    move-result v8

    .line 591
    :goto_a
    if-nez v8, :cond_f

    .line 592
    .line 593
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    goto/16 :goto_7

    .line 597
    .line 598
    :cond_18
    move-object v4, v0

    .line 599
    :goto_b
    new-instance p1, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 602
    .line 603
    .line 604
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    :cond_19
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-eqz v1, :cond_22

    .line 613
    .line 614
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    check-cast v1, Lq97;

    .line 619
    .line 620
    invoke-virtual {v1}, Lhd1;->p()Led1;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    check-cast v4, Lsx4;

    .line 628
    .line 629
    invoke-static {v4, p2}, Lw79;->q(Lsx4;Lsx4;)Lxg7;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    new-instance v7, Lwi8;

    .line 634
    .line 635
    invoke-direct {v7, v4}, Lwi8;-><init>(Lui8;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, v7}, Ljo2;->g(Lwi8;)Lho2;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    check-cast v4, Lq97;

    .line 646
    .line 647
    invoke-interface {v4}, Lho2;->i0()Lgo2;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-interface {v4, p2}, Lgo2;->w(Led1;)Lgo2;

    .line 652
    .line 653
    .line 654
    invoke-virtual {p2}, Lsx4;->p0()Li44;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    invoke-interface {v4, v7}, Lgo2;->f(Li44;)Lgo2;

    .line 659
    .line 660
    .line 661
    invoke-interface {v4}, Lgo2;->g()Lgo2;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, Lhd1;->p()Led1;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    check-cast v7, Lsx4;

    .line 672
    .line 673
    invoke-static {v1, v5}, Lw45;->y(Lho2;I)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    new-instance v9, Lea6;

    .line 678
    .line 679
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 680
    .line 681
    .line 682
    invoke-static {v7}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    new-instance v10, Lvk1;

    .line 687
    .line 688
    const/16 v11, 0x13

    .line 689
    .line 690
    invoke-direct {v10, p0, v11}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 691
    .line 692
    .line 693
    new-instance v11, Lc91;

    .line 694
    .line 695
    const/4 v12, 0x2

    .line 696
    invoke-direct {v11, v8, v9, v12}, Lc91;-><init>(Ljava/lang/Object;Ljava/io/Serializable;B)V

    .line 697
    .line 698
    .line 699
    invoke-static {v7, v10, v11}, Ljb5;->p(Ljava/util/List;Ld91;Lw45;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    check-cast v7, Lts3;

    .line 707
    .line 708
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    if-eqz v7, :cond_1f

    .line 713
    .line 714
    if-eq v7, v3, :cond_21

    .line 715
    .line 716
    if-eq v7, v12, :cond_1c

    .line 717
    .line 718
    if-eq v7, v5, :cond_1b

    .line 719
    .line 720
    const/4 v1, 0x4

    .line 721
    if-ne v7, v1, :cond_1a

    .line 722
    .line 723
    :goto_d
    move-object v1, v6

    .line 724
    goto/16 :goto_10

    .line 725
    .line 726
    :cond_1a
    invoke-static {}, Lb61;->c()V

    .line 727
    .line 728
    .line 729
    return-object v6

    .line 730
    :cond_1b
    iget-object v1, p0, Lus3;->h0:Lte4;

    .line 731
    .line 732
    aget-object v7, v2, v12

    .line 733
    .line 734
    invoke-static {v1, v7}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    check-cast v1, Lsm;

    .line 739
    .line 740
    invoke-interface {v4, v1}, Lgo2;->n(Lsm;)Lgo2;

    .line 741
    .line 742
    .line 743
    goto :goto_f

    .line 744
    :cond_1c
    invoke-virtual {v1}, Lfd1;->getName()Lv15;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    sget-object v8, Lvs3;->a:Lv15;

    .line 749
    .line 750
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result v8

    .line 754
    iget-object v9, p0, Lus3;->i0:Lpe4;

    .line 755
    .line 756
    if-eqz v8, :cond_1d

    .line 757
    .line 758
    invoke-virtual {v1}, Lfd1;->getName()Lv15;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-virtual {v1}, Lv15;->b()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    new-instance v7, Lqg5;

    .line 767
    .line 768
    const-string v8, "first"

    .line 769
    .line 770
    invoke-direct {v7, v1, v8}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v9, v7}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    check-cast v1, Lsm;

    .line 778
    .line 779
    goto :goto_e

    .line 780
    :cond_1d
    sget-object v8, Lvs3;->b:Lv15;

    .line 781
    .line 782
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v7

    .line 786
    if-eqz v7, :cond_1e

    .line 787
    .line 788
    invoke-virtual {v1}, Lfd1;->getName()Lv15;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    invoke-virtual {v1}, Lv15;->b()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    new-instance v7, Lqg5;

    .line 797
    .line 798
    const-string v8, "last"

    .line 799
    .line 800
    invoke-direct {v7, v1, v8}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v9, v7}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    check-cast v1, Lsm;

    .line 808
    .line 809
    :goto_e
    invoke-interface {v4, v1}, Lgo2;->n(Lsm;)Lgo2;

    .line 810
    .line 811
    .line 812
    goto :goto_f

    .line 813
    :cond_1e
    const-string p0, "Unexpected name: "

    .line 814
    .line 815
    invoke-virtual {v1}, Lfd1;->getName()Lv15;

    .line 816
    .line 817
    .line 818
    move-result-object p1

    .line 819
    invoke-static {p1, p0}, Lkp5;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    return-object v6

    .line 823
    :cond_1f
    invoke-virtual {p2}, Lsx4;->m()Lfx4;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    sget-object v7, Lfx4;->Y:Lfx4;

    .line 828
    .line 829
    if-ne v1, v7, :cond_20

    .line 830
    .line 831
    invoke-virtual {p2}, Lsx4;->g0()Lus0;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    sget-object v7, Lus0;->Z:Lus0;

    .line 836
    .line 837
    if-eq v1, v7, :cond_20

    .line 838
    .line 839
    goto :goto_d

    .line 840
    :cond_20
    invoke-interface {v4}, Lgo2;->i()Lgo2;

    .line 841
    .line 842
    .line 843
    :cond_21
    :goto_f
    invoke-interface {v4}, Lgo2;->build()Lho2;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    check-cast v1, Lq97;

    .line 851
    .line 852
    :goto_10
    if-eqz v1, :cond_19

    .line 853
    .line 854
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    goto/16 :goto_c

    .line 858
    .line 859
    :cond_22
    return-object p1

    .line 860
    :cond_23
    invoke-static {v5}, Lpe4;->c(I)V

    .line 861
    .line 862
    .line 863
    throw v6
.end method
