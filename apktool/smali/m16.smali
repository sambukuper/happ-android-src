.class public final Lm16;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ljava/util/List;

.field public h0:Lb71;

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ls16;

.field public k0:I


# direct methods
.method public constructor <init>(Ls16;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm16;->j0:Ls16;

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
    .locals 6

    .line 1
    iput-object p1, p0, Lm16;->i0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm16;->k0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm16;->k0:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lm16;->j0:Ls16;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Ls16;->c(Ljava/lang/String;Ljava/util/List;Lze0;Lb71;Ls51;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
