.class public final Lzx3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:S

.field public final b:Lvz4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12c

    .line 5
    .line 6
    iput-short v0, p0, Lzx3;->a:S

    .line 7
    .line 8
    sget-object v0, Lgf3;->a:Lvz4;

    .line 9
    .line 10
    new-instance v0, Lvz4;

    .line 11
    .line 12
    invoke-direct {v0}, Lvz4;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lzx3;->b:Lvz4;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Float;I)Lyx3;
    .locals 2

    .line 1
    new-instance v0, Lyx3;

    .line 2
    .line 3
    sget-object v1, Lyx1;->d:Lb61;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lyx3;-><init>(Ljava/lang/Float;Lxx1;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lzx3;->b:Lvz4;

    .line 9
    .line 10
    invoke-virtual {p0, p2, v0}, Lvz4;->h(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
