.class public final Lbk7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr47;

    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lbk7;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lr47;

    .line 19
    .line 20
    const/16 v1, 0xe

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lbk7;->b:Lvz7;

    .line 31
    .line 32
    new-instance v0, Lr47;

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lvz7;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lbk7;->c:Lvz7;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    iget-object p0, p0, Lbk7;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object p0
.end method
