.class public final Loo8;
.super Lh50;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final m0:Lc25;


# direct methods
.method public constructor <init>(Lh50;Lc25;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lh50;->f0:[Lf50;

    .line 2
    .line 3
    invoke-static {v0, p2}, Lh50;->s([Lf50;Lc25;)[Lf50;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lh50;->g0:[Lf50;

    .line 8
    .line 9
    invoke-static {v1, p2}, Lh50;->s([Lf50;Lc25;)[Lf50;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, p1, v0, v1}, Lh50;-><init>(Lh50;[Lf50;[Lf50;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Loo8;->m0:Lc25;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Loo8;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lh50;-><init>(Lh50;Ljava/util/Set;Ljava/util/Set;)V

    .line 20
    iget-object p1, p1, Loo8;->m0:Lc25;

    iput-object p1, p0, Loo8;->m0:Lc25;

    return-void
.end method

.method public constructor <init>(Loo8;Lwg;)V
    .locals 1

    .line 23
    iget-object v0, p1, Lh50;->h0:Ljava/lang/Object;

    invoke-direct {p0, p1, p2, v0}, Lh50;-><init>(Lh50;Lwg;Ljava/lang/Object;)V

    .line 24
    iget-object p1, p1, Loo8;->m0:Lc25;

    iput-object p1, p0, Loo8;->m0:Lc25;

    return-void
.end method

.method public constructor <init>(Loo8;Lwg;Ljava/lang/Object;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lh50;-><init>(Lh50;Lwg;Ljava/lang/Object;)V

    .line 26
    iget-object p1, p1, Loo8;->m0:Lc25;

    iput-object p1, p0, Loo8;->m0:Lc25;

    return-void
.end method

.method public constructor <init>(Loo8;[Lf50;[Lf50;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lh50;-><init>(Lh50;[Lf50;[Lf50;)V

    .line 22
    iget-object p1, p1, Loo8;->m0:Lc25;

    iput-object p1, p0, Loo8;->m0:Lc25;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh50;->j0:Lwg;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, p2, p3, v0}, Lh50;->p(Ljava/lang/Object;Lro3;Lt37;Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lh50;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lh50;->u(Ljava/lang/Object;Lro3;Lt37;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lh50;->v(Ljava/lang/Object;Lro3;Lt37;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 2

    .line 1
    sget-object v0, Ln37;->j0:Ln37;

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
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lh50;->j0:Lwg;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p3, p4}, Lh50;->o(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p4, p0, Lh50;->h0:Ljava/lang/Object;

    .line 24
    .line 25
    if-nez p4, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lh50;->u(Ljava/lang/Object;Lro3;Lt37;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lh50;->v(Ljava/lang/Object;Lro3;Lt37;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_2
    iget-object p0, p0, Llj7;->X:Ljava/lang/Class;

    .line 36
    .line 37
    const-string p1, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`"

    .line 38
    .line 39
    invoke-virtual {p3, p0, p1}, Lt37;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final g(Lc25;)Lar3;
    .locals 1

    .line 1
    new-instance v0, Loo8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Loo8;-><init>(Lh50;Lc25;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final r()Lh50;
    .locals 0

    .line 1
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
    const-string v0, "UnwrappingBeanSerializer for "

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
    new-instance v0, Loo8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Loo8;-><init>(Loo8;Ljava/util/Set;Ljava/util/Set;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final x(Ljava/lang/Object;)Lh50;
    .locals 2

    .line 1
    new-instance v0, Loo8;

    .line 2
    .line 3
    iget-object v1, p0, Lh50;->j0:Lwg;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Loo8;-><init>(Loo8;Lwg;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final y(Lwg;)Lh50;
    .locals 1

    .line 1
    new-instance v0, Loo8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Loo8;-><init>(Loo8;Lwg;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final z([Lf50;[Lf50;)Lh50;
    .locals 1

    .line 1
    new-instance v0, Loo8;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Loo8;-><init>(Loo8;[Lf50;[Lf50;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
