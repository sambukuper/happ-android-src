.class public final Lew2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lew2;->a:Z

    .line 5
    .line 6
    iput-object p1, p0, Lew2;->b:Ldn2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Lmq5;Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lzs1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-boolean v2, p0, Lew2;->a:Z

    .line 5
    .line 6
    iget-object p0, p0, Lew2;->b:Ldn2;

    .line 7
    .line 8
    invoke-direct {v0, v2, p0, v1}, Lzs1;-><init>(ZLjava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x7

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p1, v1, v0, p2, p0}, Lq18;->d(Lmq5;Llo4;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lc71;->X:Lc71;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    return-object p0
.end method
