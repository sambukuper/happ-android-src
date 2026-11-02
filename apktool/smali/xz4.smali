.class public final Lxz4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lu77;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ll90;->Y:Ll90;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lxz4;->a:Lu77;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lvf3;Lq51;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->a:Lu77;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    return-object p0
.end method

.method public final b(Lvf3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->a:Lu77;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu77;->g(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
