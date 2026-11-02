.class public final Len8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final b:Len8;


# instance fields
.field public final synthetic a:Lk85;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Len8;

    .line 2
    .line 3
    invoke-direct {v0}, Len8;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Len8;->b:Len8;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk85;

    .line 5
    .line 6
    invoke-direct {v0}, Lk85;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Len8;->a:Lk85;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldn8;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Len8;->a:Lk85;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lk85;->a(Lol7;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Len8;->a:Lk85;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk85;->b(Lrd1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    iget-object p0, p0, Len8;->a:Lk85;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk85;->d()Le37;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
