.class public final Lbq3;
.super Lbo3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final X:Lya4;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lya4;

    .line 5
    .line 6
    sget-object v1, Lya4;->k0:Ll71;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lya4;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lbq3;->X:Lya4;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;Lbo3;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lxp3;->X:Lxp3;

    .line 4
    .line 5
    :cond_0
    iget-object p0, p0, Lbq3;->X:Lya4;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lya4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lbq3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lbq3;

    .line 8
    .line 9
    iget-object p1, p1, Lbq3;->X:Lya4;

    .line 10
    .line 11
    iget-object p0, p0, Lbq3;->X:Lya4;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public final f(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lxp3;->X:Lxp3;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Liq3;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Liq3;-><init>(Ljava/lang/Number;)V

    .line 9
    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p2, p1}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    new-instance v0, Liq3;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Liq3;-><init>(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbq3;->X:Lya4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lxp3;->X:Lxp3;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Liq3;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Liq3;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :goto_0
    invoke-virtual {p0, p1, p2}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(Ljava/lang/String;)Lbo3;
    .locals 0

    .line 1
    iget-object p0, p0, Lbq3;->X:Lya4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbo3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final l(Ljava/lang/String;)Lbq3;
    .locals 0

    .line 1
    iget-object p0, p0, Lbq3;->X:Lya4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbq3;

    .line 8
    .line 9
    return-object p0
.end method
