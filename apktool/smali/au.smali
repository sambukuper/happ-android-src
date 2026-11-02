.class public abstract Lau;
.super Le41;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp51;


# instance fields
.field public final Z:Ld50;

.field public final f0:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lau;Ld50;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object p1, p1, Llj7;->X:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lau;->Z:Ld50;

    .line 8
    .line 9
    iput-object p3, p0, Lau;->f0:Ljava/lang/Boolean;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lau;->Z:Ld50;

    .line 14
    iput-object p1, p0, Lau;->f0:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public a(Lt37;Ld50;)Lar3;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Llj7;->X:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Llj7;->k(Lt37;Ld50;Ljava/lang/Class;)Lno3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lko3;->X:Lko3;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lno3;->a(Lko3;)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lau;->f0:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p2, p1}, Lau;->q(Ld50;Ljava/lang/Boolean;)Lar3;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    return-object p0
.end method

.method public final f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 1

    .line 1
    sget-object v0, Lgr3;->g0:Lgr3;

    .line 2
    .line 3
    invoke-virtual {p4, p1, v0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p4, p2, v0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, p1}, Lro3;->m(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lau;->r(Ljava/lang/Object;Lro3;Lt37;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p4, p2, v0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final p(Lt37;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lau;->f0:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ln37;->v0:Ln37;

    .line 6
    .line 7
    iget-object p1, p1, Lt37;->X:Ll37;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ll37;->j(Ln37;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public q(Ld50;Ljava/lang/Boolean;)Lar3;
    .locals 1

    .line 1
    new-instance v0, Lwi7;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lau;-><init>(Lau;Ld50;Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public r(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    check-cast p1, [Z

    .line 2
    .line 3
    array-length p0, p1

    .line 4
    const/4 p3, 0x0

    .line 5
    :goto_0
    if-ge p3, p0, :cond_0

    .line 6
    .line 7
    aget-boolean v0, p1, p3

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lro3;->C(Z)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 p3, p3, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method
