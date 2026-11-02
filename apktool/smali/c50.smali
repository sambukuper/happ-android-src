.class public final Lc50;
.super Lh50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final m0:Lh50;


# direct methods
.method public constructor <init>(Lc50;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lh50;-><init>(Lh50;Ljava/util/Set;Ljava/util/Set;)V

    .line 13
    iput-object p1, p0, Lc50;->m0:Lh50;

    return-void
.end method

.method public constructor <init>(Lc50;Lwg;Ljava/lang/Object;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lh50;-><init>(Lh50;Lwg;Ljava/lang/Object;)V

    .line 11
    iput-object p1, p0, Lc50;->m0:Lh50;

    return-void
.end method

.method public constructor <init>(Lg50;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p1, Lh50;->h0:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-direct {p0, p1, v0, v1}, Lh50;-><init>(Lh50;Lwg;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc50;->m0:Lh50;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh50;->g0:[Lf50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lh50;->f0:[Lf50;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :try_start_0
    array-length v1, p0

    .line 12
    :goto_0
    if-ge v0, v1, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v0

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Lro3;->X()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catch_0
    move-exception p3

    .line 23
    goto :goto_2

    .line 24
    :catch_1
    move-exception p2

    .line 25
    goto :goto_3

    .line 26
    :cond_1
    invoke-virtual {v2, p1, p2, p3}, Lf50;->j(Ljava/lang/Object;Lro3;Lt37;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void

    .line 33
    :goto_2
    new-instance v1, Lpp3;

    .line 34
    .line 35
    const-string v2, "Infinite recursion (StackOverflowError)"

    .line 36
    .line 37
    invoke-direct {v1, p2, v2, p3}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    aget-object p0, p0, v0

    .line 41
    .line 42
    iget-object p0, p0, Lf50;->Y:Lr37;

    .line 43
    .line 44
    iget-object p0, p0, Lr37;->X:Ljava/lang/String;

    .line 45
    .line 46
    new-instance p2, Lop3;

    .line 47
    .line 48
    invoke-direct {p2, p1, p0}, Lop3;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v1, Lpp3;->X:Ljava/util/LinkedList;

    .line 52
    .line 53
    if-nez p0, :cond_3

    .line 54
    .line 55
    new-instance p0, Ljava/util/LinkedList;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p0, v1, Lpp3;->X:Ljava/util/LinkedList;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/16 p1, 0x3e8

    .line 67
    .line 68
    if-ge p0, p1, :cond_4

    .line 69
    .line 70
    iget-object p0, v1, Lpp3;->X:Ljava/util/LinkedList;

    .line 71
    .line 72
    invoke-virtual {p0, p2}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    throw v1

    .line 76
    :goto_3
    aget-object p0, p0, v0

    .line 77
    .line 78
    iget-object p0, p0, Lf50;->Y:Lr37;

    .line 79
    .line 80
    iget-object p0, p0, Lr37;->X:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p3, p2, p1, p0}, Llj7;->n(Lt37;Ljava/lang/Exception;Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    throw p0
.end method

.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 2

    .line 1
    sget-object v0, Ln37;->v0:Ln37;

    .line 2
    .line 3
    iget-object v1, p3, Lt37;->X:Ll37;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ll37;->j(Ln37;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lh50;->f0:[Lf50;

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lc50;->A(Ljava/lang/Object;Lro3;Lt37;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p2, p1}, Lro3;->J0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2, p3}, Lc50;->A(Ljava/lang/Object;Lro3;Lt37;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lro3;->D()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh50;->j0:Lwg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lh50;->o(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v0, Lgr3;->g0:Lgr3;

    .line 10
    .line 11
    invoke-virtual {p0, p4, p1, v0}, Lh50;->q(Lri8;Ljava/lang/Object;Lgr3;)Lz76;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p4, p2, v0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lc50;->A(Ljava/lang/Object;Lro3;Lt37;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p4, p2, v0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final g(Lc25;)Lar3;
    .locals 0

    .line 1
    iget-object p0, p0, Lc50;->m0:Lh50;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lar3;->g(Lc25;)Lar3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Llj7;->X:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "BeanAsArraySerializer for "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final w(Ljava/util/Set;Ljava/util/Set;)Lh50;
    .locals 1

    .line 1
    new-instance v0, Lc50;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lc50;-><init>(Lc50;Ljava/util/Set;Ljava/util/Set;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final x(Ljava/lang/Object;)Lh50;
    .locals 2

    .line 1
    new-instance v0, Lc50;

    .line 2
    .line 3
    iget-object v1, p0, Lh50;->j0:Lwg;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Lc50;-><init>(Lc50;Lwg;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final y(Lwg;)Lh50;
    .locals 0

    .line 1
    iget-object p0, p0, Lc50;->m0:Lh50;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh50;->y(Lwg;)Lh50;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
