.class public final Lh76;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmh7;
.implements Lxe2;
.implements Lwo2;


# instance fields
.field public final synthetic X:Loh7;

.field private final job:Lbm3;


# direct methods
.method public constructor <init>(Loh7;Log7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh76;->X:Loh7;

    .line 5
    .line 6
    iput-object p2, p0, Lh76;->job:Lbm3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Loh7;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lc71;->X:Lc71;

    .line 7
    .line 8
    return-object p0
.end method

.method public final b(Ls61;ILl90;)Lxe2;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Ll90;->Y:Ll90;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lv77;->c(Lr77;Ls61;ILl90;)Lxe2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_1
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 2
    .line 3
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
