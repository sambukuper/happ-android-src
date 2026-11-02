.class public final Lrf5;
.super Le50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final n0:Lr75;


# instance fields
.field public final Y:Ll37;

.field public final Z:Lm85;

.field public final f0:Ljx5;

.field public final g0:Ljx5;

.field public h0:Ljp;

.field public i0:Ljp;

.field public j0:Ljp;

.field public k0:Ljp;

.field public transient l0:Lix5;

.field public transient m0:Lr75;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lr75;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v2, v1}, Lr75;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lrf5;->n0:Lr75;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ll37;Lm85;Ljx5;Ljx5;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lrf5;->Y:Ll37;

    .line 37
    iput-object p2, p0, Lrf5;->Z:Lm85;

    .line 38
    iput-object p3, p0, Lrf5;->g0:Ljx5;

    .line 39
    iput-object p4, p0, Lrf5;->f0:Ljx5;

    return-void
.end method

.method public constructor <init>(Lrf5;Ljx5;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lrf5;->Y:Ll37;

    .line 5
    .line 6
    iput-object v0, p0, Lrf5;->Y:Ll37;

    .line 7
    .line 8
    iget-object v0, p1, Lrf5;->Z:Lm85;

    .line 9
    .line 10
    iput-object v0, p0, Lrf5;->Z:Lm85;

    .line 11
    .line 12
    iget-object v0, p1, Lrf5;->g0:Ljx5;

    .line 13
    .line 14
    iput-object v0, p0, Lrf5;->g0:Ljx5;

    .line 15
    .line 16
    iput-object p2, p0, Lrf5;->f0:Ljx5;

    .line 17
    .line 18
    iget-object p2, p1, Lrf5;->h0:Ljp;

    .line 19
    .line 20
    iput-object p2, p0, Lrf5;->h0:Ljp;

    .line 21
    .line 22
    iget-object p2, p1, Lrf5;->i0:Ljp;

    .line 23
    .line 24
    iput-object p2, p0, Lrf5;->i0:Ljp;

    .line 25
    .line 26
    iget-object p2, p1, Lrf5;->j0:Ljp;

    .line 27
    .line 28
    iput-object p2, p0, Lrf5;->j0:Ljp;

    .line 29
    .line 30
    iget-object p1, p1, Lrf5;->k0:Ljp;

    .line 31
    .line 32
    iput-object p1, p0, Lrf5;->k0:Ljp;

    .line 33
    .line 34
    return-void
.end method

.method public static A(Ljp;Ljx5;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Ljp;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ljp;->c:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast v0, Ljx5;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljx5;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljp;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static varargs B(I[Ljp;)Lyr2;
    .locals 2

    .line 1
    aget-object v0, p1, p0

    .line 2
    .line 3
    invoke-static {v0}, Lrf5;->y(Ljp;)Lyr2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    if-ge p0, v1, :cond_1

    .line 11
    .line 12
    aget-object v1, p1, p0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, p1}, Lrf5;->B(I[Ljp;)Lyr2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {v0, p0}, Lyr2;->q(Lyr2;Lyr2;)Lyr2;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    return-object v0
.end method

.method public static q(Ljp;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Ljp;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v0, Ljx5;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Ljp;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljp;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static r(Ljp;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Ljp;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v0, Ljx5;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Ljx5;->X:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljp;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static s(Ljp;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Ljp;->f:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ljp;->c:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast v0, Ljx5;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Ljx5;->X:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljp;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static t(Ljp;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Ljp;->f:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljp;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static u(Ljp;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Ljp;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljp;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public static v(Ljp;Lyr2;)Ljp;
    .locals 8

    .line 1
    iget-object v0, p0, Ljp;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgl;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lgl;->E0(Lyr2;)Lvj8;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lgl;

    .line 11
    .line 12
    iget-object v0, p0, Ljp;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljp;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0, p1}, Lrf5;->v(Ljp;Lyr2;)Ljp;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Ljp;->f(Ljp;)Ljp;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    iget-object p1, p0, Ljp;->g:Ljava/lang/Object;

    .line 27
    .line 28
    if-ne v2, p1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance v1, Ljp;

    .line 32
    .line 33
    iget-object p1, p0, Ljp;->b:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    check-cast v3, Ljp;

    .line 37
    .line 38
    iget-object p1, p0, Ljp;->c:Ljava/io/Serializable;

    .line 39
    .line 40
    move-object v4, p1

    .line 41
    check-cast v4, Ljx5;

    .line 42
    .line 43
    iget-boolean v5, p0, Ljp;->d:Z

    .line 44
    .line 45
    iget-boolean v6, p0, Ljp;->e:Z

    .line 46
    .line 47
    iget-boolean v7, p0, Ljp;->f:Z

    .line 48
    .line 49
    invoke-direct/range {v1 .. v7}, Ljp;-><init>(Ljava/lang/Object;Ljp;Ljx5;ZZZ)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static x(Ljp;Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 1
    :goto_0
    if-eqz p0, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Ljp;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v0, Ljx5;

    .line 6
    .line 7
    iget-boolean v1, p0, Ljp;->d:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_1
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljp;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    return-object p1
.end method

.method public static y(Ljp;)Lyr2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljp;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgl;

    .line 4
    .line 5
    iget-object v0, v0, Lgl;->C0:Lyr2;

    .line 6
    .line 7
    iget-object p0, p0, Ljp;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljp;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lrf5;->y(Ljp;)Lyr2;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, p0}, Lyr2;->q(Lyr2;Lyr2;)Lyr2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    return-object v0
.end method

.method public static z(Lhl;)I
    .locals 2

    .line 1
    iget-object p0, p0, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "get"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x3

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-le v0, v1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    const-string v0, "is"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 v0, 0x2

    .line 37
    if-le p0, v0, :cond_1

    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    return v1
.end method


# virtual methods
.method public final C(Lhl;Lhl;)Lhl;
    .locals 6

    .line 1
    iget-object v0, p1, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p2, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    iget-object v0, p2, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "set"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    const/4 v5, 0x3

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-le v0, v5, :cond_2

    .line 51
    .line 52
    move v0, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v0, v3

    .line 55
    :goto_0
    iget-object v2, p1, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-le v1, v5, :cond_3

    .line 72
    .line 73
    move v3, v4

    .line 74
    :cond_3
    if-eq v0, v3, :cond_5

    .line 75
    .line 76
    if-ge v0, v3, :cond_4

    .line 77
    .line 78
    :goto_1
    return-object p2

    .line 79
    :cond_4
    :goto_2
    return-object p1

    .line 80
    :cond_5
    iget-object p0, p0, Lrf5;->Z:Lm85;

    .line 81
    .line 82
    if-nez p0, :cond_6

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_6
    invoke-virtual {p0, p1, p2}, Lm85;->b0(Lhl;Lhl;)Lhl;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

.method public final D(Lrf5;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 2
    .line 3
    iget-object v1, p1, Lrf5;->h0:Ljp;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-object v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v0, v1}, Ljp;->a(Ljp;)Ljp;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iput-object v0, p0, Lrf5;->h0:Ljp;

    .line 17
    .line 18
    iget-object v0, p0, Lrf5;->i0:Ljp;

    .line 19
    .line 20
    iget-object v1, p1, Lrf5;->i0:Ljp;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    move-object v0, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    if-nez v1, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-virtual {v0, v1}, Ljp;->a(Ljp;)Ljp;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_1
    iput-object v0, p0, Lrf5;->i0:Ljp;

    .line 34
    .line 35
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 36
    .line 37
    iget-object v1, p1, Lrf5;->j0:Ljp;

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_4
    if-nez v1, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    invoke-virtual {v0, v1}, Ljp;->a(Ljp;)Ljp;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_2
    iput-object v0, p0, Lrf5;->j0:Ljp;

    .line 51
    .line 52
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 53
    .line 54
    iget-object p1, p1, Lrf5;->k0:Ljp;

    .line 55
    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    move-object v0, p1

    .line 59
    goto :goto_3

    .line 60
    :cond_6
    if-nez p1, :cond_7

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_7
    invoke-virtual {v0, p1}, Ljp;->a(Ljp;)Ljp;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_3
    iput-object v0, p0, Lrf5;->k0:Ljp;

    .line 68
    .line 69
    return-void
.end method

.method public final E()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 2
    .line 3
    invoke-static {v0}, Lrf5;->t(Ljp;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 10
    .line 11
    invoke-static {v0}, Lrf5;->t(Ljp;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 18
    .line 19
    invoke-static {v0}, Lrf5;->t(Ljp;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lrf5;->i0:Ljp;

    .line 26
    .line 27
    invoke-static {p0}, Lrf5;->t(Ljp;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final F()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 2
    .line 3
    invoke-static {v0}, Lrf5;->u(Ljp;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 10
    .line 11
    invoke-static {v0}, Lrf5;->u(Ljp;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 18
    .line 19
    invoke-static {v0}, Lrf5;->u(Ljp;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lrf5;->i0:Ljp;

    .line 26
    .line 27
    invoke-static {p0}, Lrf5;->u(Ljp;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrf5;->i0:Ljp;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lrf5;->h0:Ljp;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lrf5;->u(Ljp;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final b()Lep3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le50;->e()Lgl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lrf5;->Z:Lm85;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, v0}, Lm85;->x(Lvj8;)Lep3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lep3;->g0:Lep3;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public final c()Lr75;
    .locals 4

    .line 1
    iget-object v0, p0, Lrf5;->m0:Lr75;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lrf5;->n0:Lr75;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    return-object v0

    .line 12
    :cond_1
    iget-object v0, p0, Lrf5;->Z:Lm85;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget-object v3, p0, Lrf5;->j0:Ljp;

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    iget-object v1, v3, Ljp;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lgl;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lm85;->B(Lgl;)Lr75;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_2
    if-nez v1, :cond_3

    .line 29
    .line 30
    iget-object v3, p0, Lrf5;->h0:Ljp;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    iget-object v1, v3, Ljp;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lgl;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lm85;->B(Lgl;)Lr75;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_3
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    move-object v2, v1

    .line 46
    :goto_0
    iput-object v2, p0, Lrf5;->m0:Lr75;

    .line 47
    .line 48
    return-object v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lrf5;

    .line 2
    .line 3
    iget-object v0, p0, Lrf5;->i0:Ljp;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lrf5;->i0:Ljp;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v0, p1, Lrf5;->i0:Ljp;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lrf5;->j()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1}, Lrf5;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final d()[Ljava/lang/Class;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lrf5;->Z:Lm85;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lrf5;->j0:Ljp;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v2, Ljp;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lgl;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lm85;->N(Lvj8;)[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Lrf5;->h0:Ljp;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Ljp;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lgl;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lm85;->N(Lvj8;)[Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    return-object v0
.end method

.method public final f()Lll;
    .locals 3

    .line 1
    iget-object v0, p0, Lrf5;->i0:Ljp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object v1, v0, Ljp;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lll;

    .line 10
    .line 11
    iget-object v2, v1, Lll;->D0:Lul;

    .line 12
    .line 13
    instance-of v2, v2, Lcl;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    iget-object v0, v0, Ljp;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljp;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lrf5;->i0:Ljp;

    .line 25
    .line 26
    iget-object p0, p0, Ljp;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lll;

    .line 29
    .line 30
    return-object p0
.end method

.method public final g()Lel;
    .locals 9

    .line 1
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, v0, Ljp;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lel;

    .line 10
    .line 11
    iget-object v0, v0, Ljp;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljp;

    .line 14
    .line 15
    :goto_0
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v3, v0, Ljp;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lel;

    .line 20
    .line 21
    iget-object v4, v2, Lel;->D0:Ljava/lang/reflect/Field;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, v3, Lel;->D0:Ljava/lang/reflect/Field;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eq v4, v5, :cond_2

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-virtual {v2}, Lel;->K()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {v3}, Lel;->K()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eq v4, v5, :cond_4

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    :goto_1
    move-object v2, v3

    .line 70
    :cond_3
    :goto_2
    iget-object v0, v0, Ljp;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljp;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {p0}, Lrf5;->j()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v2}, Lgl;->A0()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const-string v7, " vs "

    .line 84
    .line 85
    invoke-virtual {v3}, Lgl;->A0()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    const-string v3, "Multiple fields representing property \""

    .line 90
    .line 91
    const-string v5, "\": "

    .line 92
    .line 93
    invoke-static/range {v3 .. v8}, Lu52;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_5
    return-object v2
.end method

.method public final h()Lhl;
    .locals 9

    .line 1
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, v0, Ljp;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljp;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-object p0, v0, Ljp;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lhl;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    :goto_0
    iget-object v3, v0, Ljp;->g:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v2, :cond_6

    .line 21
    .line 22
    iget-object v4, v2, Ljp;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lhl;

    .line 25
    .line 26
    iget-object v5, v3, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v4, Lhl;

    .line 33
    .line 34
    iget-object v6, v4, Lhl;->E0:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    if-eq v5, v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {v4}, Lrf5;->z(Lhl;)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-static {v3}, Lrf5;->z(Lhl;)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eq v5, v6, :cond_5

    .line 65
    .line 66
    if-ge v5, v6, :cond_4

    .line 67
    .line 68
    :goto_1
    move-object v0, v2

    .line 69
    :cond_4
    :goto_2
    iget-object v2, v2, Ljp;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljp;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    move-object v0, v4

    .line 75
    invoke-virtual {p0}, Lrf5;->j()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v3}, Lhl;->A0()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    const-string v7, " vs "

    .line 84
    .line 85
    invoke-virtual {v0}, Lhl;->A0()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    const-string v3, "Conflicting getter definitions for property \""

    .line 90
    .line 91
    const-string v5, "\": "

    .line 92
    .line 93
    invoke-static/range {v3 .. v8}, Lu52;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_6
    invoke-virtual {v0}, Ljp;->h()Ljp;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lrf5;->j0:Ljp;

    .line 102
    .line 103
    check-cast v3, Lhl;

    .line 104
    .line 105
    return-object v3
.end method

.method public final i()Lix5;
    .locals 12

    .line 1
    iget-object v0, p0, Lrf5;->l0:Lix5;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Ljp;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lgl;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Ljp;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lgl;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-nez v0, :cond_2

    .line 25
    .line 26
    sget-object v0, Lix5;->j0:Lix5;

    .line 27
    .line 28
    iput-object v0, p0, Lrf5;->l0:Lix5;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    iget-object v1, p0, Lrf5;->Z:Lm85;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lm85;->V(Lgl;)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v1, v0}, Lm85;->u(Lgl;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v1, v0}, Lm85;->z(Lgl;)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v1, v0}, Lm85;->t(Lgl;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    if-nez v3, :cond_4

    .line 50
    .line 51
    if-nez v5, :cond_4

    .line 52
    .line 53
    if-nez v6, :cond_4

    .line 54
    .line 55
    sget-object v0, Lix5;->j0:Lix5;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move-object v6, v4

    .line 61
    new-instance v4, Lix5;

    .line 62
    .line 63
    iget-object v5, v0, Lix5;->X:Ljava/lang/Boolean;

    .line 64
    .line 65
    iget-object v7, v0, Lix5;->Y:Ljava/lang/Integer;

    .line 66
    .line 67
    iget-object v8, v0, Lix5;->Z:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v10, v0, Lix5;->f0:Lm75;

    .line 70
    .line 71
    iget-object v11, v0, Lix5;->g0:Lm75;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-direct/range {v4 .. v11}, Lix5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v4

    .line 78
    :goto_1
    iput-object v0, p0, Lrf5;->l0:Lix5;

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    sget-object v0, Lix5;->h0:Lix5;

    .line 82
    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    if-nez v5, :cond_8

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    if-nez v3, :cond_6

    .line 91
    .line 92
    sget-object v0, Lix5;->j0:Lix5;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    sget-object v0, Lix5;->h0:Lix5;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    sget-object v0, Lix5;->i0:Lix5;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_8
    :goto_2
    new-instance v2, Lix5;

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    invoke-direct/range {v2 .. v9}, Lix5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v2

    .line 116
    :goto_3
    iput-object v0, p0, Lrf5;->l0:Lix5;

    .line 117
    .line 118
    :cond_9
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrf5;->f0:Ljx5;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Ljx5;->X:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public final k()Ldh8;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrf5;->h()Lhl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lrf5;->g()Lel;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Luh8;->u0:Lba7;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lvj8;->Q()Ldh8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final l()Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lrf5;->k()Ldh8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldh8;->j0:Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0
.end method

.method public final m()Lhl;
    .locals 8

    .line 1
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, v0, Ljp;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljp;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-object p0, v0, Ljp;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lhl;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    :goto_0
    iget-object v3, v0, Ljp;->g:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz v2, :cond_8

    .line 21
    .line 22
    iget-object v4, v2, Ljp;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Ljp;

    .line 25
    .line 26
    iget-object v5, v2, Ljp;->g:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v6, v3

    .line 29
    check-cast v6, Lhl;

    .line 30
    .line 31
    move-object v7, v5

    .line 32
    check-cast v7, Lhl;

    .line 33
    .line 34
    invoke-virtual {p0, v6, v7}, Lrf5;->C(Lhl;Lhl;)Lhl;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    if-ne v6, v3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-ne v6, v5, :cond_3

    .line 42
    .line 43
    move-object v0, v2

    .line 44
    :goto_1
    move-object v2, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :goto_2
    iget-object v3, v0, Ljp;->g:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    iget-object v5, v4, Ljp;->g:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v6, v3

    .line 64
    check-cast v6, Lhl;

    .line 65
    .line 66
    move-object v7, v5

    .line 67
    check-cast v7, Lhl;

    .line 68
    .line 69
    invoke-virtual {p0, v6, v7}, Lrf5;->C(Lhl;Lhl;)Lhl;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-ne v6, v3, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    if-ne v6, v5, :cond_5

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 79
    .line 80
    .line 81
    move-object v0, v4

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :goto_3
    iget-object v3, v4, Ljp;->b:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v4, v3

    .line 89
    check-cast v4, Ljp;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    invoke-virtual {v0}, Ljp;->h()Ljp;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, Lrf5;->k0:Ljp;

    .line 103
    .line 104
    check-cast v3, Lhl;

    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_7
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v2, Lqf5;

    .line 112
    .line 113
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v2, " vs "

    .line 121
    .line 122
    invoke-static {v2}, Ljava/util/stream/Collectors;->joining(Ljava/lang/CharSequence;)Ljava/util/stream/Collector;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p0}, Lrf5;->j()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string v2, "Conflicting setter definitions for property \""

    .line 137
    .line 138
    const-string v3, "\": "

    .line 139
    .line 140
    invoke-static {v2, p0, v3, v0}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_8
    invoke-virtual {v0}, Ljp;->h()Ljp;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, p0, Lrf5;->k0:Ljp;

    .line 153
    .line 154
    check-cast v3, Lhl;

    .line 155
    .line 156
    return-object v3
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrf5;->h0:Ljp;

    .line 2
    .line 3
    invoke-static {v0}, Lrf5;->r(Ljp;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lrf5;->j0:Ljp;

    .line 10
    .line 11
    invoke-static {v0}, Lrf5;->r(Ljp;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lrf5;->k0:Ljp;

    .line 18
    .line 19
    invoke-static {v0}, Lrf5;->r(Ljp;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lrf5;->i0:Ljp;

    .line 26
    .line 27
    invoke-static {p0}, Lrf5;->q(Ljp;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final p()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lrf5;->Z:Lm85;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lrf5;->j0:Ljp;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v2, Ljp;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lgl;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lm85;->Z(Lgl;)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Lrf5;->h0:Ljp;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Ljp;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lgl;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lm85;->Z(Lgl;)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[Property \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lrf5;->f0:Ljx5;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\'; ctors: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lrf5;->i0:Ljp;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", field(s): "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lrf5;->h0:Ljp;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", getter(s): "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lrf5;->j0:Ljp;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", setter(s): "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lrf5;->k0:Ljp;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, "]"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final w(Ljava/util/Set;Ljava/util/HashMap;Ljp;)V
    .locals 6

    .line 1
    move-object v0, p3

    .line 2
    :goto_0
    if-eqz v0, :cond_9

    .line 3
    .line 4
    iget-object v1, v0, Ljp;->c:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v1, Ljx5;

    .line 7
    .line 8
    iget-boolean v2, v0, Ljp;->d:Z

    .line 9
    .line 10
    if-eqz v2, :cond_6

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lrf5;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    new-instance v2, Lrf5;

    .line 24
    .line 25
    iget-object v3, p0, Lrf5;->Z:Lm85;

    .line 26
    .line 27
    iget-object v4, p0, Lrf5;->g0:Ljx5;

    .line 28
    .line 29
    iget-object v5, p0, Lrf5;->Y:Ll37;

    .line 30
    .line 31
    invoke-direct {v2, v5, v3, v4, v1}, Lrf5;-><init>(Ll37;Lm85;Ljx5;Ljx5;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v1, p0, Lrf5;->h0:Ljp;

    .line 38
    .line 39
    if-ne p3, v1, :cond_2

    .line 40
    .line 41
    iget-object v1, v2, Lrf5;->h0:Ljp;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljp;->f(Ljp;)Ljp;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, v2, Lrf5;->h0:Ljp;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget-object v1, p0, Lrf5;->j0:Ljp;

    .line 51
    .line 52
    if-ne p3, v1, :cond_3

    .line 53
    .line 54
    iget-object v1, v2, Lrf5;->j0:Ljp;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljp;->f(Ljp;)Ljp;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, v2, Lrf5;->j0:Ljp;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    iget-object v1, p0, Lrf5;->k0:Ljp;

    .line 64
    .line 65
    if-ne p3, v1, :cond_4

    .line 66
    .line 67
    iget-object v1, v2, Lrf5;->k0:Ljp;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljp;->f(Ljp;)Ljp;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, v2, Lrf5;->k0:Ljp;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    iget-object v1, p0, Lrf5;->i0:Ljp;

    .line 77
    .line 78
    if-ne p3, v1, :cond_5

    .line 79
    .line 80
    iget-object v1, v2, Lrf5;->i0:Ljp;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljp;->f(Ljp;)Ljp;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, v2, Lrf5;->i0:Ljp;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const-string p1, "Internal error: mismatched accessors, property: "

    .line 90
    .line 91
    invoke-static {p0, p1}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    :goto_1
    iget-boolean v1, v0, Ljp;->e:Z

    .line 96
    .line 97
    if-nez v1, :cond_7

    .line 98
    .line 99
    :goto_2
    iget-object v0, v0, Ljp;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljp;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_7
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance p3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Conflicting/ambiguous property name definitions (implicit name "

    .line 109
    .line 110
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, Lrf5;->f0:Ljx5;

    .line 114
    .line 115
    if-nez p0, :cond_8

    .line 116
    .line 117
    sget-object p0, Lit0;->a:[Ljava/lang/annotation/Annotation;

    .line 118
    .line 119
    const-string p0, "[null]"

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_8
    iget-object p0, p0, Ljx5;->X:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {p0}, Lit0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_3
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p0, "): found multiple explicit names: "

    .line 132
    .line 133
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p0, ", but also implicit accessor: "

    .line 140
    .line 141
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p2

    .line 155
    :cond_9
    return-void
.end method
