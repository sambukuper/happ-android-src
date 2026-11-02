.class public final Lww4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public synthetic g0:F

.field public final synthetic h0:Lgn2;


# direct methods
.method public constructor <init>(Lgn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lww4;->h0:Lgn2;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lww4;->g0:F

    .line 5
    .line 6
    new-instance v0, Ljava/lang/Float;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lww4;->h0:Lgn2;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    return-object p0
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p3, Lq51;

    .line 10
    .line 11
    new-instance p2, Lww4;

    .line 12
    .line 13
    iget-object p0, p0, Lww4;->h0:Lgn2;

    .line 14
    .line 15
    invoke-direct {p2, p0, p3}, Lww4;-><init>(Lgn2;Lq51;)V

    .line 16
    .line 17
    .line 18
    iput p1, p2, Lww4;->g0:F

    .line 19
    .line 20
    sget-object p0, Ldn8;->a:Ldn8;

    .line 21
    .line 22
    invoke-virtual {p2, p0}, Lww4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
