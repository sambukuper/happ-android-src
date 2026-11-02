.class public final Lyg8;
.super Ljo2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La41;


# static fields
.field public static final K0:Ls18;


# instance fields
.field public final H0:Lve4;

.field public final I0:Lkm1;

.field public J0:Lgs0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    new-instance v0, Ls18;

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    invoke-direct {v0, v1}, Ls18;-><init>(B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyg8;->K0:Ls18;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lve4;Lkm1;Lgs0;Lyg8;Lsm;ILke7;)V
    .locals 7

    .line 1
    sget-object v5, Lhf7;->e:Lv15;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v3, p2

    .line 5
    move-object v4, p4

    .line 6
    move-object v2, p5

    .line 7
    move v1, p6

    .line 8
    move-object v6, p7

    .line 9
    invoke-direct/range {v0 .. v6}, Ljo2;-><init>(ILsm;Led1;Lho2;Lv15;Lke7;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lyg8;->H0:Lve4;

    .line 13
    .line 14
    iput-object v3, v0, Lyg8;->I0:Lkm1;

    .line 15
    .line 16
    new-instance p0, Lxg8;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-direct {p0, v0, p3, p2}, Lxg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance p2, Lse4;

    .line 26
    .line 27
    invoke-direct {p2, p1, p0}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, Lyg8;->J0:Lgs0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final G0()Lgd1;
    .locals 0

    .line 1
    invoke-super {p0}, Ljo2;->a()Lho2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyg8;

    .line 9
    .line 10
    return-object p0
.end method

.method public final I(Led1;Lfx4;Lfl1;)Lld0;
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwi8;->b:Lwi8;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljo2;->M0(Lwi8;)Lio2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iput-object p1, p0, Lio2;->Y:Led1;

    .line 11
    .line 12
    iput-object p2, p0, Lio2;->Z:Lfx4;

    .line 13
    .line 14
    iput-object p3, p0, Lio2;->f0:Lfl1;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    iput p1, p0, Lio2;->h0:I

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lio2;->o0:Z

    .line 21
    .line 22
    iget-object p1, p0, Lio2;->z0:Ljo2;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljo2;->J0(Lio2;)Ljo2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast p0, Lyg8;

    .line 32
    .line 33
    return-object p0
.end method

.method public final I0(ILsm;Led1;Lho2;Lv15;Lke7;)Ljo2;
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-eq p1, v6, :cond_0

    .line 11
    .line 12
    const/4 p3, 0x4

    .line 13
    :cond_0
    new-instance v0, Lyg8;

    .line 14
    .line 15
    iget-object v2, p0, Lyg8;->I0:Lkm1;

    .line 16
    .line 17
    iget-object v3, p0, Lyg8;->J0:Lgs0;

    .line 18
    .line 19
    iget-object v1, p0, Lyg8;->H0:Lve4;

    .line 20
    .line 21
    move-object v4, p0

    .line 22
    move-object v5, p2

    .line 23
    move-object v7, p6

    .line 24
    invoke-direct/range {v0 .. v7}, Lyg8;-><init>(Lve4;Lkm1;Lgs0;Lyg8;Lsm;ILke7;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final Q0(Lwi8;)Lyg8;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Ljo2;->g(Lwi8;)Lho2;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p1, Lyg8;

    .line 12
    .line 13
    iget-object v0, p1, Ljo2;->k0:Lt14;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lwi8;->d(Lt14;)Lwi8;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, Lyg8;->J0:Lgs0;

    .line 23
    .line 24
    invoke-virtual {p0}, Lgs0;->T0()Lgs0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v0}, Lgs0;->W0(Lwi8;)Lgs0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_0
    iput-object p0, p1, Lyg8;->J0:Lgs0;

    .line 37
    .line 38
    return-object p1
.end method

.method public final a()Led1;
    .locals 0

    .line 12
    invoke-super {p0}, Ljo2;->a()Lho2;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Lyg8;

    return-object p0
.end method

.method public final a()Lho2;
    .locals 0

    .line 13
    invoke-super {p0}, Ljo2;->a()Lho2;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Lyg8;

    return-object p0
.end method

.method public final a()Ljd0;
    .locals 0

    .line 1
    invoke-super {p0}, Ljo2;->a()Lho2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyg8;

    .line 9
    .line 10
    return-object p0
.end method

.method public final a()Lld0;
    .locals 0

    .line 11
    invoke-super {p0}, Ljo2;->a()Lho2;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Lyg8;

    return-object p0
.end method

.method public final bridge synthetic g(Lwi8;)Lgd1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyg8;->Q0(Lwi8;)Lyg8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic g(Lwi8;)Lho2;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lyg8;->Q0(Lwi8;)Lyg8;

    move-result-object p0

    return-object p0
.end method

.method public final j()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->k0:Lt14;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final p()Led1;
    .locals 0

    .line 4
    iget-object p0, p0, Lyg8;->I0:Lkm1;

    return-object p0
.end method

.method public final p()Lpt0;
    .locals 0

    .line 1
    iget-object p0, p0, Lyg8;->I0:Lkm1;

    .line 2
    .line 3
    return-object p0
.end method
