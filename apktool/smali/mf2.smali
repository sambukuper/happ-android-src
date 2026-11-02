.class public final Lmf2;
.super Ls51;


# instance fields
.field public synthetic f0:Ljava/lang/Object;

.field public g0:I

.field public final synthetic h0:Llf2;

.field public i0:Lze2;

.field public j0:Lqu6;

.field public k0:I


# direct methods
.method public constructor <init>(Llf2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf2;->h0:Llf2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lmf2;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lmf2;->g0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lmf2;->g0:I

    .line 9
    .line 10
    iget-object p1, p0, Lmf2;->h0:Llf2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Llf2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
