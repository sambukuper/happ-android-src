.class public final Lik0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljj0;

.field public final b:Lvk7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>(Ljj0;Lvk7;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lik0;->a:Ljj0;

    .line 8
    .line 9
    iput-object p2, p0, Lik0;->b:Lvk7;

    .line 10
    .line 11
    new-instance p1, Lo7;

    .line 12
    .line 13
    const/16 p2, 0x10

    .line 14
    .line 15
    invoke-direct {p1, p0, p2}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lvz7;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lik0;->c:Lvz7;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Li26;
    .locals 0

    .line 1
    iget-object p0, p0, Lik0;->c:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li26;

    .line 8
    .line 9
    return-object p0
.end method
