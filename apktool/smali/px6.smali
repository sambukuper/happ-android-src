.class public final Lpx6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lba6;

.field public final synthetic i0:F


# direct methods
.method public constructor <init>(Lba6;FLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpx6;->h0:Lba6;

    .line 2
    .line 3
    iput p2, p0, Lpx6;->i0:F

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lxx6;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lpx6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lpx6;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lpx6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Lpx6;

    .line 2
    .line 3
    iget-object v1, p0, Lpx6;->h0:Lba6;

    .line 4
    .line 5
    iget p0, p0, Lpx6;->i0:F

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lpx6;-><init>(Lba6;FLq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lpx6;->g0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lpx6;->g0:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lxx6;

    .line 7
    .line 8
    iget v0, p0, Lpx6;->i0:F

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lxx6;->a(F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object p0, p0, Lpx6;->h0:Lba6;

    .line 15
    .line 16
    iput p1, p0, Lba6;->X:F

    .line 17
    .line 18
    sget-object p0, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    return-object p0
.end method
