.class public final Luh8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final Y:[Ldh8;

.field public static final Z:Luh8;

.field public static final f0:Lgh8;

.field public static final g0:Ljava/lang/Class;

.field public static final h0:Ljava/lang/Class;

.field public static final i0:Ljava/lang/Class;

.field public static final j0:Ljava/lang/Class;

.field public static final k0:Ljava/lang/Class;

.field public static final l0:Ljava/lang/Class;

.field public static final m0:Ljava/lang/Class;

.field public static final n0:Ljava/lang/Class;

.field public static final o0:Ljava/lang/Class;

.field public static final p0:Lba7;

.field public static final q0:Lba7;

.field public static final r0:Lba7;

.field public static final s0:Lba7;

.field public static final t0:Lba7;

.field public static final u0:Lba7;

.field public static final v0:Lba7;

.field public static final w0:Lba7;

.field public static final x0:Lba7;


# instance fields
.field public final X:Lc24;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ldh8;

    .line 3
    .line 4
    sput-object v0, Luh8;->Y:[Ldh8;

    .line 5
    .line 6
    new-instance v0, Luh8;

    .line 7
    .line 8
    invoke-direct {v0}, Luh8;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Luh8;->Z:Luh8;

    .line 12
    .line 13
    sget-object v0, Lgh8;->i0:Lgh8;

    .line 14
    .line 15
    sput-object v0, Luh8;->f0:Lgh8;

    .line 16
    .line 17
    const-class v0, Ljava/lang/String;

    .line 18
    .line 19
    sput-object v0, Luh8;->g0:Ljava/lang/Class;

    .line 20
    .line 21
    const-class v1, Ljava/lang/Object;

    .line 22
    .line 23
    sput-object v1, Luh8;->h0:Ljava/lang/Class;

    .line 24
    .line 25
    const-class v2, Ljava/lang/Comparable;

    .line 26
    .line 27
    sput-object v2, Luh8;->i0:Ljava/lang/Class;

    .line 28
    .line 29
    const-class v3, Ljava/lang/Enum;

    .line 30
    .line 31
    sput-object v3, Luh8;->j0:Ljava/lang/Class;

    .line 32
    .line 33
    const-class v4, Lup3;

    .line 34
    .line 35
    sput-object v4, Luh8;->k0:Ljava/lang/Class;

    .line 36
    .line 37
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    sput-object v5, Luh8;->l0:Ljava/lang/Class;

    .line 40
    .line 41
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    sput-object v6, Luh8;->m0:Ljava/lang/Class;

    .line 44
    .line 45
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    sput-object v7, Luh8;->n0:Ljava/lang/Class;

    .line 48
    .line 49
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    sput-object v8, Luh8;->o0:Ljava/lang/Class;

    .line 52
    .line 53
    new-instance v9, Lba7;

    .line 54
    .line 55
    invoke-direct {v9, v5}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    sput-object v9, Luh8;->p0:Lba7;

    .line 59
    .line 60
    new-instance v5, Lba7;

    .line 61
    .line 62
    invoke-direct {v5, v6}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    sput-object v5, Luh8;->q0:Lba7;

    .line 66
    .line 67
    new-instance v5, Lba7;

    .line 68
    .line 69
    invoke-direct {v5, v7}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    sput-object v5, Luh8;->r0:Lba7;

    .line 73
    .line 74
    new-instance v5, Lba7;

    .line 75
    .line 76
    invoke-direct {v5, v8}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    sput-object v5, Luh8;->s0:Lba7;

    .line 80
    .line 81
    new-instance v5, Lba7;

    .line 82
    .line 83
    invoke-direct {v5, v0}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    sput-object v5, Luh8;->t0:Lba7;

    .line 87
    .line 88
    new-instance v0, Lba7;

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Luh8;->u0:Lba7;

    .line 94
    .line 95
    new-instance v0, Lba7;

    .line 96
    .line 97
    invoke-direct {v0, v2}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Luh8;->v0:Lba7;

    .line 101
    .line 102
    new-instance v0, Lba7;

    .line 103
    .line 104
    invoke-direct {v0, v3}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Luh8;->w0:Lba7;

    .line 108
    .line 109
    new-instance v0, Lba7;

    .line 110
    .line 111
    invoke-direct {v0, v4}, Lba7;-><init>(Ljava/lang/Class;)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Luh8;->x0:Lba7;

    .line 115
    .line 116
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lc24;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/16 v2, 0xc8

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lc24;-><init>(II)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Luh8;->X:Lc24;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/Class;)Lba7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    sget-object v0, Luh8;->l0:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Luh8;->p0:Lba7;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Luh8;->n0:Ljava/lang/Class;

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Luh8;->r0:Lba7;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v0, Luh8;->o0:Ljava/lang/Class;

    .line 22
    .line 23
    if-ne p0, v0, :cond_2

    .line 24
    .line 25
    sget-object p0, Luh8;->s0:Lba7;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object v0, Luh8;->m0:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne p0, v0, :cond_6

    .line 31
    .line 32
    sget-object p0, Luh8;->q0:Lba7;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    sget-object v0, Luh8;->g0:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne p0, v0, :cond_4

    .line 38
    .line 39
    sget-object p0, Luh8;->t0:Lba7;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_4
    sget-object v0, Luh8;->h0:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne p0, v0, :cond_5

    .line 45
    .line 46
    sget-object p0, Luh8;->u0:Lba7;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_5
    sget-object v0, Luh8;->k0:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p0, v0, :cond_6

    .line 52
    .line 53
    sget-object p0, Luh8;->x0:Lba7;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_6
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method public static e(Ldh8;Ldh8;)Z
    .locals 6

    .line 1
    instance-of v0, p1, Lho5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lho5;

    .line 7
    .line 8
    iput-object p0, p1, Lho5;->t0:Ldh8;

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v2, p1, Ldh8;->j0:Ljava/lang/Class;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eq v0, v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Ldh8;->y0()Lgh8;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lgh8;->e()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1}, Ldh8;->y0()Lgh8;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lgh8;->e()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    move v2, v3

    .line 40
    :goto_0
    if-ge v2, v0, :cond_3

    .line 41
    .line 42
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ldh8;

    .line 47
    .line 48
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Ldh8;

    .line 53
    .line 54
    invoke-static {v4, v5}, Luh8;->e(Ldh8;Ldh8;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    :goto_1
    return v3

    .line 61
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return v1
.end method

.method public static f(Ldh8;Ljava/lang/Class;)Ldh8;
    .locals 2

    .line 1
    iget-object v0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ldh8;->x0(Ljava/lang/Class;)Ldh8;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "Class %s not a super-type of %s"

    .line 28
    .line 29
    invoke-static {p1, p0}, Lkp5;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "Internal error: class %s not included as super-type for %s"

    .line 42
    .line 43
    invoke-static {p1, p0}, Lkp5;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-object v1
.end method

.method public static h(Ldh8;Ljava/lang/Class;)[Ldh8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldh8;->x0(Ljava/lang/Class;)Ldh8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Luh8;->Y:[Ldh8;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldh8;->y0()Lgh8;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Lgh8;->Y:[Ldh8;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;
    .locals 9

    .line 1
    instance-of v0, p2, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Class;

    .line 6
    .line 7
    sget-object p3, Luh8;->f0:Lgh8;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v2, Luh8;->j0:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    sget-object p0, Luh8;->w0:Lba7;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    sget-object v2, Luh8;->i0:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne v0, v2, :cond_2

    .line 37
    .line 38
    sget-object p0, Luh8;->v0:Lba7;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    move v2, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    array-length v2, p2

    .line 50
    :goto_0
    if-nez v2, :cond_4

    .line 51
    .line 52
    sget-object p2, Luh8;->f0:Lgh8;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    new-array v3, v2, [Ldh8;

    .line 56
    .line 57
    :goto_1
    if-ge v1, v2, :cond_5

    .line 58
    .line 59
    aget-object v4, p2, v1

    .line 60
    .line 61
    invoke-virtual {p0, p1, v4, p3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    aput-object v4, v3, v1

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-static {v0, v3}, Lgh8;->c(Ljava/lang/Class;[Ldh8;)Lgh8;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :goto_2
    invoke-virtual {p0, p1, v0, p2}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_6
    instance-of v0, p2, Ldh8;

    .line 80
    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    check-cast p2, Ldh8;

    .line 84
    .line 85
    return-object p2

    .line 86
    :cond_7
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 87
    .line 88
    if-eqz v0, :cond_8

    .line 89
    .line 90
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p0, p1, p2, p3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    sget p0, Lcu;->u0:I

    .line 101
    .line 102
    iget-object p0, v3, Ldh8;->j0:Ljava/lang/Class;

    .line 103
    .line 104
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    new-instance v2, Lcu;

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    move-object v4, p3

    .line 114
    invoke-direct/range {v2 .. v8}, Lcu;-><init>(Ldh8;Lgh8;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_8
    move-object v4, p3

    .line 119
    instance-of p3, p2, Ljava/lang/reflect/TypeVariable;

    .line 120
    .line 121
    if-eqz p3, :cond_11

    .line 122
    .line 123
    check-cast p2, Ljava/lang/reflect/TypeVariable;

    .line 124
    .line 125
    invoke-interface {p2}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    const/4 v0, 0x0

    .line 130
    if-eqz v4, :cond_10

    .line 131
    .line 132
    iget-object v2, v4, Lgh8;->X:[Ljava/lang/String;

    .line 133
    .line 134
    array-length v3, v2

    .line 135
    move v5, v1

    .line 136
    :goto_3
    if-ge v5, v3, :cond_a

    .line 137
    .line 138
    aget-object v6, v2, v5

    .line 139
    .line 140
    invoke-virtual {p3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_9

    .line 145
    .line 146
    iget-object v0, v4, Lgh8;->Y:[Ldh8;

    .line 147
    .line 148
    aget-object v0, v0, v5

    .line 149
    .line 150
    instance-of v2, v0, Lkf6;

    .line 151
    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    move-object v2, v0

    .line 155
    check-cast v2, Lkf6;

    .line 156
    .line 157
    iget-object v2, v2, Lkf6;->s0:Ldh8;

    .line 158
    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    move-object v0, v2

    .line 162
    goto :goto_4

    .line 163
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_a
    :goto_4
    if-eqz v0, :cond_b

    .line 167
    .line 168
    return-object v0

    .line 169
    :cond_b
    iget-object v0, v4, Lgh8;->Z:[Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v0, :cond_d

    .line 172
    .line 173
    array-length v2, v0

    .line 174
    :cond_c
    add-int/lit8 v2, v2, -0x1

    .line 175
    .line 176
    if-ltz v2, :cond_d

    .line 177
    .line 178
    aget-object v3, v0, v2

    .line 179
    .line 180
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_c

    .line 185
    .line 186
    sget-object p0, Luh8;->u0:Lba7;

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_d
    iget-object v0, v4, Lgh8;->Z:[Ljava/lang/String;

    .line 190
    .line 191
    if-nez v0, :cond_e

    .line 192
    .line 193
    move v2, v1

    .line 194
    goto :goto_5

    .line 195
    :cond_e
    array-length v2, v0

    .line 196
    :goto_5
    if-nez v2, :cond_f

    .line 197
    .line 198
    const/4 v0, 0x1

    .line 199
    new-array v0, v0, [Ljava/lang/String;

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_f
    add-int/lit8 v3, v2, 0x1

    .line 203
    .line 204
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, [Ljava/lang/String;

    .line 209
    .line 210
    :goto_6
    aput-object p3, v0, v2

    .line 211
    .line 212
    new-instance p3, Lgh8;

    .line 213
    .line 214
    iget-object v2, v4, Lgh8;->X:[Ljava/lang/String;

    .line 215
    .line 216
    iget-object v3, v4, Lgh8;->Y:[Ldh8;

    .line 217
    .line 218
    invoke-direct {p3, v2, v3, v0}, Lgh8;-><init>([Ljava/lang/String;[Ldh8;[Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    monitor-enter p2

    .line 222
    :try_start_0
    invoke-interface {p2}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    aget-object p2, v0, v1

    .line 228
    .line 229
    invoke-virtual {p0, p1, p2, p3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :catchall_0
    move-exception v0

    .line 235
    move-object p0, v0

    .line 236
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    throw p0

    .line 238
    :cond_10
    const-string p0, "Null `bindings` passed (type variable \""

    .line 239
    .line 240
    const-string p1, "\")"

    .line 241
    .line 242
    invoke-static {p0, p3, p1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_11
    instance-of p3, p2, Ljava/lang/reflect/WildcardType;

    .line 251
    .line 252
    if-eqz p3, :cond_12

    .line 253
    .line 254
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 255
    .line 256
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    aget-object p2, p2, v1

    .line 261
    .line 262
    invoke-virtual {p0, p1, p2, v4}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 268
    .line 269
    new-instance p1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string p3, "Unrecognized Type: "

    .line 272
    .line 273
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    if-nez p2, :cond_13

    .line 277
    .line 278
    const-string p2, "[null]"

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    :goto_7
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p0
.end method

.method public final c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;
    .locals 19

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
    iget-object v4, v0, Luh8;->X:Lc24;

    .line 10
    .line 11
    iget-object v4, v4, Lc24;->X:Ljava/io/Serializable;

    .line 12
    .line 13
    move-object v10, v4

    .line 14
    check-cast v10, Lwu5;

    .line 15
    .line 16
    invoke-static {v2}, Luh8;->a(Ljava/lang/Class;)Lba7;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {v3}, Lgh8;->f()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    iget-object v4, v3, Lgh8;->Y:[Ldh8;

    .line 35
    .line 36
    array-length v5, v4

    .line 37
    move v6, v11

    .line 38
    :goto_0
    if-ge v6, v5, :cond_3

    .line 39
    .line 40
    aget-object v7, v4, v6

    .line 41
    .line 42
    instance-of v7, v7, Ly43;

    .line 43
    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    move-object v5, v12

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    new-instance v5, Leh8;

    .line 52
    .line 53
    iget v6, v3, Lgh8;->f0:I

    .line 54
    .line 55
    invoke-direct {v5, v2, v4, v6}, Leh8;-><init>(Ljava/lang/Class;[Ldh8;I)V

    .line 56
    .line 57
    .line 58
    :goto_1
    move-object v13, v5

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    :goto_2
    move-object v13, v2

    .line 61
    :goto_3
    if-nez v13, :cond_5

    .line 62
    .line 63
    move-object v4, v12

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    invoke-virtual {v10, v13}, Lwu5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ldh8;

    .line 70
    .line 71
    :goto_4
    if-eqz v4, :cond_6

    .line 72
    .line 73
    return-object v4

    .line 74
    :cond_6
    if-nez v1, :cond_7

    .line 75
    .line 76
    new-instance v1, Llr;

    .line 77
    .line 78
    invoke-direct {v1, v12, v2}, Llr;-><init>(Llr;Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    move-object v14, v1

    .line 82
    goto :goto_7

    .line 83
    :cond_7
    iget-object v5, v1, Llr;->Z:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/lang/Class;

    .line 86
    .line 87
    if-ne v5, v2, :cond_8

    .line 88
    .line 89
    move-object v9, v1

    .line 90
    goto :goto_6

    .line 91
    :cond_8
    iget-object v5, v1, Llr;->Y:Ljava/lang/Object;

    .line 92
    .line 93
    :goto_5
    check-cast v5, Llr;

    .line 94
    .line 95
    if-eqz v5, :cond_a

    .line 96
    .line 97
    iget-object v6, v5, Llr;->Z:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v6, Ljava/lang/Class;

    .line 100
    .line 101
    if-ne v6, v2, :cond_9

    .line 102
    .line 103
    move-object v9, v5

    .line 104
    goto :goto_6

    .line 105
    :cond_9
    iget-object v5, v5, Llr;->Y:Ljava/lang/Object;

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_a
    move-object v9, v12

    .line 109
    :goto_6
    if-eqz v9, :cond_c

    .line 110
    .line 111
    new-instance v0, Lkf6;

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    sget-object v2, Luh8;->f0:Lgh8;

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x0

    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    move-object/from16 v1, p2

    .line 122
    .line 123
    invoke-direct/range {v0 .. v8}, Ldh8;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 124
    .line 125
    .line 126
    iget-object v1, v9, Llr;->f0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/util/ArrayList;

    .line 129
    .line 130
    if-nez v1, :cond_b

    .line 131
    .line 132
    new-instance v1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v1, v9, Llr;->f0:Ljava/lang/Object;

    .line 138
    .line 139
    :cond_b
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_c
    new-instance v5, Llr;

    .line 144
    .line 145
    invoke-direct {v5, v1, v2}, Llr;-><init>(Llr;Ljava/lang/Class;)V

    .line 146
    .line 147
    .line 148
    move-object v14, v5

    .line 149
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    const/4 v15, 0x1

    .line 154
    if-eqz v1, :cond_d

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v14, v1, v3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    sget v0, Lcu;->u0:I

    .line 165
    .line 166
    iget-object v0, v1, Ldh8;->j0:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {v0, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v3, v0

    .line 173
    new-instance v0, Lcu;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    move-object/from16 v2, p3

    .line 179
    .line 180
    invoke-direct/range {v0 .. v6}, Lcu;-><init>(Ldh8;Lgh8;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 181
    .line 182
    .line 183
    move-object/from16 v17, v12

    .line 184
    .line 185
    goto/16 :goto_19

    .line 186
    .line 187
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_e

    .line 192
    .line 193
    invoke-virtual {v0, v14, v2, v3}, Luh8;->d(Llr;Ljava/lang/Class;Lgh8;)[Ldh8;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object v1, v12

    .line 198
    goto :goto_9

    .line 199
    :cond_e
    sget-object v1, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-nez v1, :cond_f

    .line 206
    .line 207
    move-object v1, v12

    .line 208
    goto :goto_8

    .line 209
    :cond_f
    invoke-virtual {v0, v14, v1, v3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :goto_8
    invoke-virtual {v0, v14, v2, v3}, Luh8;->d(Llr;Ljava/lang/Class;Lgh8;)[Ldh8;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :goto_9
    sget-object v5, Luh8;->t0:Lba7;

    .line 218
    .line 219
    const-class v6, Ljava/util/Properties;

    .line 220
    .line 221
    if-ne v2, v6, :cond_10

    .line 222
    .line 223
    move-object v4, v0

    .line 224
    new-instance v0, Ltp4;

    .line 225
    .line 226
    const/4 v8, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v7, 0x0

    .line 229
    move-object/from16 v16, v6

    .line 230
    .line 231
    move-object v6, v5

    .line 232
    move-object/from16 v17, v3

    .line 233
    .line 234
    move-object v3, v1

    .line 235
    move-object v1, v2

    .line 236
    move-object/from16 v2, v17

    .line 237
    .line 238
    move-object/from16 v17, v12

    .line 239
    .line 240
    move-object/from16 v12, v16

    .line 241
    .line 242
    invoke-direct/range {v0 .. v9}, Ltp4;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v18, v2

    .line 246
    .line 247
    move-object v2, v1

    .line 248
    move-object/from16 v1, v18

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_10
    move-object/from16 v17, v4

    .line 252
    .line 253
    move-object v4, v0

    .line 254
    move-object/from16 v0, v17

    .line 255
    .line 256
    move-object/from16 v17, v3

    .line 257
    .line 258
    move-object v3, v1

    .line 259
    move-object/from16 v1, v17

    .line 260
    .line 261
    move-object/from16 v17, v12

    .line 262
    .line 263
    move-object v12, v6

    .line 264
    if-eqz v3, :cond_11

    .line 265
    .line 266
    invoke-virtual {v3, v2, v1, v3, v4}, Ldh8;->M0(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)Ldh8;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    :cond_11
    :goto_a
    if-nez v0, :cond_27

    .line 271
    .line 272
    if-nez v1, :cond_12

    .line 273
    .line 274
    sget-object v0, Luh8;->f0:Lgh8;

    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_12
    move-object v0, v1

    .line 278
    :goto_b
    const-class v6, Ljava/util/Map;

    .line 279
    .line 280
    sget-object v7, Luh8;->u0:Lba7;

    .line 281
    .line 282
    if-ne v2, v6, :cond_17

    .line 283
    .line 284
    if-ne v2, v12, :cond_13

    .line 285
    .line 286
    move-object v2, v0

    .line 287
    :goto_c
    move-object v6, v5

    .line 288
    goto :goto_e

    .line 289
    :cond_13
    invoke-virtual {v0}, Lgh8;->e()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    if-eqz v6, :cond_16

    .line 298
    .line 299
    const/4 v7, 0x2

    .line 300
    if-eq v6, v7, :cond_15

    .line 301
    .line 302
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 303
    .line 304
    invoke-static {v2}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    if-ne v6, v15, :cond_14

    .line 313
    .line 314
    const-string v4, ""

    .line 315
    .line 316
    goto :goto_d

    .line 317
    :cond_14
    const-string v4, "s"

    .line 318
    .line 319
    :goto_d
    filled-new-array {v2, v3, v4, v0}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    const-string v2, "Strange Map type %s with %d type parameter%s (%s), can not resolve"

    .line 324
    .line 325
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v1

    .line 333
    :cond_15
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    check-cast v6, Ldh8;

    .line 338
    .line 339
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    check-cast v5, Ldh8;

    .line 344
    .line 345
    move-object v2, v6

    .line 346
    move-object v6, v5

    .line 347
    move-object v5, v2

    .line 348
    move-object v2, v0

    .line 349
    goto :goto_e

    .line 350
    :cond_16
    move-object v2, v0

    .line 351
    move-object v5, v7

    .line 352
    goto :goto_c

    .line 353
    :goto_e
    new-instance v0, Ltp4;

    .line 354
    .line 355
    const/4 v8, 0x0

    .line 356
    const/4 v9, 0x0

    .line 357
    const/4 v7, 0x0

    .line 358
    move-object v12, v1

    .line 359
    move-object/from16 v1, p2

    .line 360
    .line 361
    invoke-direct/range {v0 .. v9}, Ltp4;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_16

    .line 365
    .line 366
    :cond_17
    move-object v12, v1

    .line 367
    move-object v1, v2

    .line 368
    move-object v2, v0

    .line 369
    const-class v0, Ljava/util/Collection;

    .line 370
    .line 371
    const-string v5, ": cannot determine type parameters"

    .line 372
    .line 373
    if-ne v1, v0, :cond_1a

    .line 374
    .line 375
    invoke-virtual {v2}, Lgh8;->e()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    if-eqz v6, :cond_18

    .line 384
    .line 385
    :goto_f
    move-object v5, v7

    .line 386
    goto :goto_10

    .line 387
    :cond_18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-ne v6, v15, :cond_19

    .line 392
    .line 393
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    move-object v7, v0

    .line 398
    check-cast v7, Ldh8;

    .line 399
    .line 400
    goto :goto_f

    .line 401
    :goto_10
    new-instance v0, Lvv0;

    .line 402
    .line 403
    const/4 v7, 0x0

    .line 404
    const/4 v8, 0x0

    .line 405
    const/4 v6, 0x0

    .line 406
    invoke-direct/range {v0 .. v8}, Lvv0;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 407
    .line 408
    .line 409
    goto/16 :goto_16

    .line 410
    .line 411
    :cond_19
    const-string v0, "Strange Collection type "

    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-static {v0, v1, v5}, Lu52;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-object v17

    .line 421
    :cond_1a
    const-class v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 422
    .line 423
    if-ne v1, v0, :cond_1d

    .line 424
    .line 425
    invoke-virtual {v2}, Lgh8;->e()Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_1b

    .line 434
    .line 435
    :goto_11
    move-object v5, v7

    .line 436
    goto :goto_12

    .line 437
    :cond_1b
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-ne v6, v15, :cond_1c

    .line 442
    .line 443
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    move-object v7, v0

    .line 448
    check-cast v7, Ldh8;

    .line 449
    .line 450
    goto :goto_11

    .line 451
    :goto_12
    new-instance v0, Lfa6;

    .line 452
    .line 453
    const/4 v8, 0x0

    .line 454
    const/4 v9, 0x0

    .line 455
    const/4 v6, 0x0

    .line 456
    const/4 v7, 0x0

    .line 457
    invoke-direct/range {v0 .. v9}, Lfa6;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_16

    .line 461
    .line 462
    :cond_1c
    const-string v0, "Strange Reference type "

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-static {v0, v1, v5}, Lu52;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    return-object v17

    .line 472
    :cond_1d
    const-class v0, Ljava/util/Iterator;

    .line 473
    .line 474
    if-eq v1, v0, :cond_22

    .line 475
    .line 476
    const-class v0, Ljava/util/stream/Stream;

    .line 477
    .line 478
    if-ne v1, v0, :cond_1e

    .line 479
    .line 480
    goto :goto_13

    .line 481
    :cond_1e
    const-class v0, Ljava/util/stream/BaseStream;

    .line 482
    .line 483
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-eqz v0, :cond_21

    .line 488
    .line 489
    const-class v0, Ljava/util/stream/DoubleStream;

    .line 490
    .line 491
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-eqz v0, :cond_1f

    .line 496
    .line 497
    new-instance v0, Lzi3;

    .line 498
    .line 499
    const/4 v7, 0x0

    .line 500
    const/4 v8, 0x0

    .line 501
    sget-object v5, Luh8;->q0:Lba7;

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    invoke-direct/range {v0 .. v8}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 505
    .line 506
    .line 507
    goto :goto_16

    .line 508
    :cond_1f
    const-class v0, Ljava/util/stream/IntStream;

    .line 509
    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_20

    .line 515
    .line 516
    new-instance v0, Lzi3;

    .line 517
    .line 518
    const/4 v7, 0x0

    .line 519
    const/4 v8, 0x0

    .line 520
    sget-object v5, Luh8;->r0:Lba7;

    .line 521
    .line 522
    const/4 v6, 0x0

    .line 523
    invoke-direct/range {v0 .. v8}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 524
    .line 525
    .line 526
    goto :goto_16

    .line 527
    :cond_20
    const-class v0, Ljava/util/stream/LongStream;

    .line 528
    .line 529
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-eqz v0, :cond_21

    .line 534
    .line 535
    new-instance v0, Lzi3;

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const/4 v8, 0x0

    .line 539
    sget-object v5, Luh8;->s0:Lba7;

    .line 540
    .line 541
    const/4 v6, 0x0

    .line 542
    invoke-direct/range {v0 .. v8}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 543
    .line 544
    .line 545
    move-object/from16 v1, p2

    .line 546
    .line 547
    goto :goto_16

    .line 548
    :cond_21
    move-object/from16 v1, p2

    .line 549
    .line 550
    move-object/from16 v0, v17

    .line 551
    .line 552
    goto :goto_16

    .line 553
    :cond_22
    :goto_13
    invoke-virtual {v2}, Lgh8;->e()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    if-eqz v1, :cond_23

    .line 562
    .line 563
    :goto_14
    move-object v5, v7

    .line 564
    goto :goto_15

    .line 565
    :cond_23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-ne v1, v15, :cond_26

    .line 570
    .line 571
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    move-object v7, v0

    .line 576
    check-cast v7, Ldh8;

    .line 577
    .line 578
    goto :goto_14

    .line 579
    :goto_15
    new-instance v0, Lzi3;

    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    const/4 v8, 0x0

    .line 583
    const/4 v6, 0x0

    .line 584
    move-object/from16 v1, p2

    .line 585
    .line 586
    invoke-direct/range {v0 .. v8}, Lzi3;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;Ldh8;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 587
    .line 588
    .line 589
    :goto_16
    if-nez v0, :cond_27

    .line 590
    .line 591
    array-length v0, v4

    .line 592
    :goto_17
    if-ge v11, v0, :cond_25

    .line 593
    .line 594
    aget-object v2, v4, v11

    .line 595
    .line 596
    invoke-virtual {v2, v1, v12, v3, v4}, Ldh8;->M0(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)Ldh8;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    if-eqz v2, :cond_24

    .line 601
    .line 602
    move-object v0, v2

    .line 603
    goto :goto_18

    .line 604
    :cond_24
    add-int/lit8 v11, v11, 0x1

    .line 605
    .line 606
    goto :goto_17

    .line 607
    :cond_25
    move-object/from16 v0, v17

    .line 608
    .line 609
    :goto_18
    if-nez v0, :cond_27

    .line 610
    .line 611
    new-instance v0, Lba7;

    .line 612
    .line 613
    invoke-direct {v0, v1, v12, v3, v4}, Lba7;-><init>(Ljava/lang/Class;Lgh8;Ldh8;[Ldh8;)V

    .line 614
    .line 615
    .line 616
    goto :goto_19

    .line 617
    :cond_26
    move-object/from16 v1, p2

    .line 618
    .line 619
    const-string v0, "Strange Iteration type "

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-static {v0, v1, v5}, Lu52;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    return-object v17

    .line 629
    :cond_27
    :goto_19
    iget-object v1, v14, Llr;->f0:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v1, Ljava/util/ArrayList;

    .line 632
    .line 633
    if-eqz v1, :cond_29

    .line 634
    .line 635
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-eqz v2, :cond_29

    .line 644
    .line 645
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    check-cast v2, Lkf6;

    .line 650
    .line 651
    iget-object v3, v2, Lkf6;->s0:Ldh8;

    .line 652
    .line 653
    if-nez v3, :cond_28

    .line 654
    .line 655
    iput-object v0, v2, Lkf6;->s0:Ldh8;

    .line 656
    .line 657
    goto :goto_1a

    .line 658
    :cond_28
    iget-object v1, v2, Lkf6;->s0:Ldh8;

    .line 659
    .line 660
    const-string v2, ", new = "

    .line 661
    .line 662
    const-string v3, "Trying to re-set self reference; old value = "

    .line 663
    .line 664
    invoke-static {v3, v1, v2, v0}, Lkp5;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    return-object v17

    .line 668
    :cond_29
    if-eqz v13, :cond_2a

    .line 669
    .line 670
    invoke-virtual {v0}, Ldh8;->G0()Z

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-nez v1, :cond_2a

    .line 675
    .line 676
    invoke-virtual {v10, v13, v0, v15}, Lwu5;->g(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    :cond_2a
    return-object v0
.end method

.method public final d(Llr;Ljava/lang/Class;Lgh8;)[Ldh8;
    .locals 4

    .line 1
    sget-object v0, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    array-length v0, p2

    .line 14
    new-array v1, v0, [Ldh8;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v0, :cond_1

    .line 18
    .line 19
    aget-object v3, p2, v2

    .line 20
    .line 21
    invoke-virtual {p0, p1, v3, p3}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-object v1

    .line 31
    :cond_2
    :goto_1
    sget-object p0, Luh8;->Y:[Ldh8;

    .line 32
    .line 33
    return-object p0
.end method

.method public final g(Ldh8;Ljava/lang/Class;Z)Ldh8;
    .locals 23

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
    iget-object v3, v1, Ldh8;->j0:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne v3, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v4, Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v5, Luh8;->f0:Lgh8;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v6, v2, v5}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_1
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_16

    .line 30
    .line 31
    invoke-virtual {v1}, Ldh8;->I0()Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_6

    .line 36
    .line 37
    instance-of v7, v1, Ltp4;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    const-class v7, Ljava/util/HashMap;

    .line 42
    .line 43
    if-eq v2, v7, :cond_2

    .line 44
    .line 45
    const-class v7, Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    if-eq v2, v7, :cond_2

    .line 48
    .line 49
    const-class v7, Ljava/util/EnumMap;

    .line 50
    .line 51
    if-eq v2, v7, :cond_2

    .line 52
    .line 53
    const-class v7, Ljava/util/TreeMap;

    .line 54
    .line 55
    if-ne v2, v7, :cond_6

    .line 56
    .line 57
    :cond_2
    move-object v3, v1

    .line 58
    check-cast v3, Ltp4;

    .line 59
    .line 60
    iget-object v4, v3, Ltp4;->s0:Ldh8;

    .line 61
    .line 62
    iget-object v3, v3, Ltp4;->t0:Ldh8;

    .line 63
    .line 64
    invoke-static {v2, v4, v3}, Lgh8;->b(Ljava/lang/Class;Ldh8;Ldh8;)Lgh8;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v0, v6, v2, v3}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_3
    instance-of v7, v1, Lvv0;

    .line 75
    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    const-class v7, Ljava/util/ArrayList;

    .line 79
    .line 80
    if-eq v2, v7, :cond_5

    .line 81
    .line 82
    const-class v7, Ljava/util/LinkedList;

    .line 83
    .line 84
    if-eq v2, v7, :cond_5

    .line 85
    .line 86
    const-class v7, Ljava/util/HashSet;

    .line 87
    .line 88
    if-eq v2, v7, :cond_5

    .line 89
    .line 90
    const-class v7, Ljava/util/TreeSet;

    .line 91
    .line 92
    if-ne v2, v7, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const-class v7, Ljava/util/EnumSet;

    .line 96
    .line 97
    if-ne v3, v7, :cond_6

    .line 98
    .line 99
    :goto_0
    return-object v1

    .line 100
    :cond_5
    :goto_1
    move-object v3, v1

    .line 101
    check-cast v3, Lvv0;

    .line 102
    .line 103
    iget-object v3, v3, Lvv0;->s0:Ldh8;

    .line 104
    .line 105
    invoke-static {v3, v2}, Lgh8;->a(Ldh8;Ljava/lang/Class;)Lgh8;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v0, v6, v2, v3}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto/16 :goto_9

    .line 114
    .line 115
    :cond_6
    invoke-virtual {v1}, Ldh8;->y0()Lgh8;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v7}, Lgh8;->f()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_7

    .line 124
    .line 125
    invoke-virtual {v0, v6, v2, v5}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto/16 :goto_9

    .line 130
    .line 131
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    array-length v7, v7

    .line 136
    if-nez v7, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0, v6, v2, v5}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    goto/16 :goto_9

    .line 143
    .line 144
    :cond_8
    new-array v5, v7, [Lho5;

    .line 145
    .line 146
    const/4 v9, 0x0

    .line 147
    :goto_2
    if-ge v9, v7, :cond_9

    .line 148
    .line 149
    new-instance v10, Lho5;

    .line 150
    .line 151
    invoke-direct {v10, v9}, Lho5;-><init>(I)V

    .line 152
    .line 153
    .line 154
    aput-object v10, v5, v9

    .line 155
    .line 156
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_9
    invoke-static {v2, v5}, Lgh8;->c(Ljava/lang/Class;[Ldh8;)Lgh8;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v0, v6, v2, v9}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-virtual {v9, v3}, Ldh8;->x0(Ljava/lang/Class;)Ldh8;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    if-eqz v9, :cond_15

    .line 172
    .line 173
    invoke-virtual {v1}, Ldh8;->y0()Lgh8;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3}, Lgh8;->e()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v9}, Ldh8;->y0()Lgh8;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-virtual {v9}, Lgh8;->e()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    const/4 v12, 0x0

    .line 198
    :goto_3
    sget-object v13, Luh8;->u0:Lba7;

    .line 199
    .line 200
    if-ge v12, v11, :cond_10

    .line 201
    .line 202
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    check-cast v14, Ldh8;

    .line 207
    .line 208
    if-ge v12, v10, :cond_a

    .line 209
    .line 210
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    check-cast v15, Ldh8;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_a
    move-object v15, v13

    .line 218
    :goto_4
    invoke-static {v14, v15}, Luh8;->e(Ldh8;Ldh8;)Z

    .line 219
    .line 220
    .line 221
    move-result v16

    .line 222
    if-nez v16, :cond_b

    .line 223
    .line 224
    invoke-virtual {v14, v4}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v16

    .line 228
    iget-object v8, v14, Ldh8;->j0:Ljava/lang/Class;

    .line 229
    .line 230
    if-eqz v16, :cond_c

    .line 231
    .line 232
    :cond_b
    move-object/from16 v16, v6

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_c
    move-object/from16 v16, v6

    .line 236
    .line 237
    if-nez v12, :cond_d

    .line 238
    .line 239
    instance-of v6, v1, Ltp4;

    .line 240
    .line 241
    if-eqz v6, :cond_d

    .line 242
    .line 243
    invoke-virtual {v15, v4}, Ldh8;->H0(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_d

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_d
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_e

    .line 255
    .line 256
    iget-object v6, v15, Ldh8;->j0:Ljava/lang/Class;

    .line 257
    .line 258
    if-eq v8, v6, :cond_f

    .line 259
    .line 260
    invoke-virtual {v8, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v6, :cond_e

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_e
    add-int/lit8 v12, v12, 0x1

    .line 268
    .line 269
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-virtual {v14}, Ldh8;->w0()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v15}, Ldh8;->w0()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    filled-new-array {v3, v4, v6, v8}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    const-string v4, "Type parameter #%d/%d differs; can not specialize %s with %s"

    .line 290
    .line 291
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    move-object/from16 v22, v3

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_f
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 299
    .line 300
    move-object/from16 v6, v16

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_10
    move-object/from16 v16, v6

    .line 304
    .line 305
    move-object/from16 v22, v16

    .line 306
    .line 307
    :goto_6
    if-eqz v22, :cond_12

    .line 308
    .line 309
    if-eqz p3, :cond_11

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_11
    invoke-virtual {v1}, Ldh8;->w0()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v18

    .line 316
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v20

    .line 320
    const-string v21, ", problem: "

    .line 321
    .line 322
    const-string v17, "Failed to specialize base type "

    .line 323
    .line 324
    const-string v19, " as "

    .line 325
    .line 326
    invoke-static/range {v17 .. v22}, Lu52;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    return-object v16

    .line 330
    :cond_12
    :goto_7
    new-array v3, v7, [Ldh8;

    .line 331
    .line 332
    const/4 v8, 0x0

    .line 333
    :goto_8
    if-ge v8, v7, :cond_14

    .line 334
    .line 335
    aget-object v4, v5, v8

    .line 336
    .line 337
    iget-object v4, v4, Lho5;->t0:Ldh8;

    .line 338
    .line 339
    if-nez v4, :cond_13

    .line 340
    .line 341
    move-object v4, v13

    .line 342
    :cond_13
    aput-object v4, v3, v8

    .line 343
    .line 344
    add-int/lit8 v8, v8, 0x1

    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_14
    invoke-static {v2, v3}, Lgh8;->c(Ljava/lang/Class;[Ldh8;)Lgh8;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    move-object/from16 v4, v16

    .line 352
    .line 353
    invoke-virtual {v0, v4, v2, v3}, Luh8;->c(Llr;Ljava/lang/Class;Lgh8;)Ldh8;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    :goto_9
    invoke-virtual {v0, v1}, Ldh8;->Q0(Ldh8;)Ldh8;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    return-object v0

    .line 362
    :cond_15
    move-object v4, v6

    .line 363
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v2, "Internal error: unable to locate supertype ("

    .line 372
    .line 373
    const-string v3, ") from resolved subtype "

    .line 374
    .line 375
    invoke-static {v2, v0, v3, v1}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-object v4

    .line 383
    :cond_16
    move-object v4, v6

    .line 384
    invoke-static {v2}, Lit0;->u(Ljava/lang/Class;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v1}, Lit0;->n(Ldh8;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    const-string v2, "Class "

    .line 393
    .line 394
    const-string v3, " not subtype of "

    .line 395
    .line 396
    invoke-static {v2, v0, v3, v1}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    return-object v4
.end method
