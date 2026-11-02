.class public final Lnp0;
.super Lmp0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>(Lxe2;Ls61;ILl90;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Lb02;->X:Lb02;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p3, -0x3

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    sget-object p4, Ll90;->X:Ll90;

    .line 17
    .line 18
    :cond_2
    invoke-direct {p0, p3, p4, p2, p1}, Lmp0;-><init>(ILl90;Ls61;Lxe2;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final f(Ls61;ILl90;)Lkp0;
    .locals 1

    .line 1
    new-instance v0, Lnp0;

    .line 2
    .line 3
    iget-object p0, p0, Lmp0;->f0:Lxe2;

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, p1, p0}, Lmp0;-><init>(ILl90;Ls61;Lxe2;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final h()Lxe2;
    .locals 0

    .line 1
    iget-object p0, p0, Lmp0;->f0:Lxe2;

    .line 2
    .line 3
    return-object p0
.end method
