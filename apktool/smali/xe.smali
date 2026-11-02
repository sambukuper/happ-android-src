.class public final Lxe;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lb15;

.field public final synthetic Z:Ly05;

.field public final synthetic f0:Lay6;

.field public final synthetic g0:Lx67;

.field public final synthetic h0:J

.field public final synthetic i0:F

.field public final synthetic j0:Lzy0;


# direct methods
.method public constructor <init>(Lkx4;Lb15;Ly05;Lay6;Lx67;JFLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxe;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lxe;->Y:Lb15;

    .line 7
    .line 8
    iput-object p3, p0, Lxe;->Z:Ly05;

    .line 9
    .line 10
    iput-object p4, p0, Lxe;->f0:Lay6;

    .line 11
    .line 12
    iput-object p5, p0, Lxe;->g0:Lx67;

    .line 13
    .line 14
    iput-wide p6, p0, Lxe;->h0:J

    .line 15
    .line 16
    iput p8, p0, Lxe;->i0:F

    .line 17
    .line 18
    iput-object p9, p0, Lxe;->j0:Lzy0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    move p2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    :goto_0
    and-int/2addr p1, v1

    .line 20
    invoke-virtual {v9, p1, p2}, Llp2;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v8, p0, Lxe;->j0:Lzy0;

    .line 27
    .line 28
    const/16 v10, 0x180

    .line 29
    .line 30
    iget-object v0, p0, Lxe;->X:Lkx4;

    .line 31
    .line 32
    iget-object v1, p0, Lxe;->Y:Lb15;

    .line 33
    .line 34
    iget-object v2, p0, Lxe;->Z:Ly05;

    .line 35
    .line 36
    iget-object v3, p0, Lxe;->f0:Lay6;

    .line 37
    .line 38
    iget-object v4, p0, Lxe;->g0:Lx67;

    .line 39
    .line 40
    iget-wide v5, p0, Lxe;->h0:J

    .line 41
    .line 42
    iget v7, p0, Lxe;->i0:F

    .line 43
    .line 44
    invoke-static/range {v0 .. v10}, Ljm4;->f(Lkx4;Lb15;Ly05;Lay6;Lx67;JFLzy0;Llp2;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v9}, Llp2;->Q()V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 52
    .line 53
    return-object p0
.end method
