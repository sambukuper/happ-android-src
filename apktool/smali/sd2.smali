.class public final Lsd2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu27;


# instance fields
.field public final a:Lu27;

.field public final b:Lgn2;

.field public final c:Lgn2;


# direct methods
.method public constructor <init>(Lu27;Lgn2;Lgn2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lsd2;->a:Lu27;

    .line 11
    .line 12
    iput-object p2, p0, Lsd2;->b:Lgn2;

    .line 13
    .line 14
    iput-object p3, p0, Lsd2;->c:Lgn2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lrd2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lrd2;-><init>(Lsd2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
