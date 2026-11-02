.class public final Lce6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La94;


# instance fields
.field public final synthetic X:Ln84;

.field public final synthetic Y:Lea6;

.field public final synthetic Z:Lb71;

.field public final synthetic f0:Ln84;

.field public final synthetic g0:Lmm0;

.field public final synthetic h0:Lq15;

.field public final synthetic i0:Lrn2;


# direct methods
.method public constructor <init>(Ln84;Lea6;Lb71;Ln84;Lmm0;Lq15;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce6;->X:Ln84;

    .line 5
    .line 6
    iput-object p2, p0, Lce6;->Y:Lea6;

    .line 7
    .line 8
    iput-object p3, p0, Lce6;->Z:Lb71;

    .line 9
    .line 10
    iput-object p4, p0, Lce6;->f0:Ln84;

    .line 11
    .line 12
    iput-object p5, p0, Lce6;->g0:Lmm0;

    .line 13
    .line 14
    iput-object p6, p0, Lce6;->h0:Lq15;

    .line 15
    .line 16
    iput-object p7, p0, Lce6;->i0:Lrn2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final k(Ld94;Ln84;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lce6;->X:Ln84;

    .line 2
    .line 3
    iget-object v0, p0, Lce6;->Y:Lea6;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lwu1;

    .line 9
    .line 10
    iget-object p2, p0, Lce6;->h0:Lq15;

    .line 11
    .line 12
    iget-object v2, p0, Lce6;->i0:Lrn2;

    .line 13
    .line 14
    invoke-direct {p1, p2, v2, v1}, Lwu1;-><init>(Lq15;Lrn2;Lq51;)V

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    iget-object p0, p0, Lce6;->Z:Lb71;

    .line 19
    .line 20
    invoke-static {p0, v1, v1, p1, p2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iput-object p0, v0, Lea6;->X:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p1, p0, Lce6;->f0:Ln84;

    .line 28
    .line 29
    if-ne p2, p1, :cond_2

    .line 30
    .line 31
    iget-object p1, v0, Lea6;->X:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lbm3;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-interface {p1, v1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iput-object v1, v0, Lea6;->X:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_2
    sget-object p1, Ln84;->ON_DESTROY:Ln84;

    .line 43
    .line 44
    if-ne p2, p1, :cond_3

    .line 45
    .line 46
    iget-object p0, p0, Lce6;->g0:Lmm0;

    .line 47
    .line 48
    sget-object p1, Ldn8;->a:Ldn8;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method
