.class public final Lfc;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf17;


# instance fields
.field public X:Z

.field public final synthetic Y:Lx67;


# direct methods
.method public constructor <init>(Lx67;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfc;->Y:Lx67;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Le17;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lfc;->Y:Lx67;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lfc;->X:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
